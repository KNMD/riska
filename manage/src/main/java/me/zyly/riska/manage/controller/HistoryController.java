package me.zyly.riska.manage.controller;

import me.zyly.riska.core.service.QueryCacheService;
import me.zyly.riska.manage.Constants;
import me.zyly.riska.manage.service.KLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.HttpStatus;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

@RestController
@RequestMapping("/history")
public class HistoryController extends LoginedController{

    private @Autowired QueryCacheService<KLineService.Md> queryCacheService;
    private @Autowired TaskExecutor taskExecutor;
    private @Autowired KLineService kLineService;
    private static final SimpleDateFormat sft = new SimpleDateFormat("yyyyMMdd");

    @GetMapping("/k")
    public KLineService.Md k(@RequestParam int start,
                             @RequestParam int end,
                             @RequestParam String instrumentID,
                             @RequestParam boolean equalsAlgorithm,
                             @RequestParam(required = false, defaultValue = Constants.DEFAULT_RATE) double rate) throws ParseException {

        long startTimestamp = sft.parse(String.valueOf(start)).getTime(),
                endTimestamp = sft.parse(String.valueOf(end)).getTime();
        return kLineService.equivalenceLine(instrumentID, startTimestamp, endTimestamp, rate, equalsAlgorithm);
    }

    @GetMapping("/k/async")
    public String kAsync(@RequestParam int start,
                             @RequestParam int end,
                             @RequestParam String instrumentID,
                             @RequestParam boolean equalsAlgorithm,
                             @RequestParam(required = false, defaultValue = Constants.DEFAULT_RATE) double rate) throws ParseException {
//        String key = DigestUtils.md5DigestAsHex(String.format(
//                "%s_%s_%s_%s", start, end, instrumentID, rate).getBytes());
        String key = DigestUtils.md5DigestAsHex(UUID.randomUUID().toString().getBytes());
        try {
            queryCacheService.get(key);
        } catch (QueryCacheService.GetError getError) {
            taskExecutor.execute(()-> {
                try {
                    KLineService.Md md = k(start, end, instrumentID, equalsAlgorithm, rate);
                    queryCacheService.save(key, md, true);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        return key;
    }

    @GetMapping("/k/cache")
    public KLineService.Md kAsync(String key) {
        if(StringUtils.isEmpty(key)) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        try {
            return queryCacheService.get(key);
        } catch (QueryCacheService.GetError getError) {
            if(getError instanceof QueryCacheService.Null) {
                throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
            }else {
                throw new HttpClientErrorException(HttpStatus.REQUEST_TIMEOUT);
            }
        }
    }

}
