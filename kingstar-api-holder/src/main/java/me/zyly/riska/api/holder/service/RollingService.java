package me.zyly.riska.api.holder.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class RollingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RollingService.class);

    public String instrumentID() {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.MONTH, 1);

        String year = String.valueOf(calendar.get(Calendar.YEAR)).substring(2, 4);
        int month = calendar.get(Calendar.MONTH) + 1;
        String newInstrumentID = String.format("%s%s", year, month);
        LOGGER.info("current instrumentID is {}", newInstrumentID);
        return newInstrumentID;
    }

}
