package me.david.test;

import me.zyly.riska.manage.Boot;
import me.zyly.riska.manage.domain.Scope;
import me.zyly.riska.manage.domain.SingleMarketData;
import me.zyly.riska.manage.service.KLineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Boot.class)
@Import(Boot.class)
@SuppressWarnings("SpringJavaAutowiringInspection")
public class KlineTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(KlineTest.class);
    private @Autowired KLineService kLineService;
    @Test
    public void testSingleEqLine() {
        int [] md = {30030, 30050, 30080, 30070, 30100, 30090};
        Scope scope = new Scope.Algorithm.IC().calculate(0.003, 30000);
        List<SingleMarketData> data = new ArrayList<>();
        for(int m : md) {
            SingleMarketData current = new SingleMarketData(m);
            scope = kLineService.compareForEquivalence(current, data, scope);
        }
        for(SingleMarketData d : data) {
            LOGGER.info("d: {}",d);
        }
    }

    @Test
    public void testTruthEqLine() {
//        Scope scope = new Scope.Algorithm.IC().calculate(0.001, 7350);
//        List<SingleMarketData> data = kLineService.equivalenceLine("IC1601", 20160104, 20160105, scope);
//        LOGGER.info("scope: {}", scope);
//        for(SingleMarketData d : data) {
//            LOGGER.info("d: {}",d);
//        }
    }

    @Test
    public void testDiv() {
        System.out.println(27/9);
    }
}
