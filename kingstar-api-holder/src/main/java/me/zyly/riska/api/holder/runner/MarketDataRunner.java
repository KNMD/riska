package me.zyly.riska.api.holder.runner;

import ksmdapiex.CThostFtdcMdApi;
import ksmdapiex.CThostFtdcMdSpi;
import me.zyly.riska.api.holder.Boot;
import me.zyly.riska.api.holder.RiskaMdSpi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MarketDataRunner implements CommandLineRunner {
    private static Logger LOGGER = LoggerFactory.getLogger(MarketDataRunner.class);

    private @Autowired Boot.KingstarAPIConfig config;
    @Override
    public void run(String... strings) throws Exception {
        LOGGER.debug( "Start MarketDataMarketDataSPI Login ------------------------" );
        BridJ.register(CThostFtdcMdSpi.class);
        BridJ.register(CThostFtdcMdApi.class);    // 必须的

        Pointer<Byte > pointer = CThostFtdcMdApi.GetApiVersion();
        LOGGER.debug("check api version is {}", pointer.getCString());

        Pointer<CThostFtdcMdApi> PointerThostFtdcMdApi = CThostFtdcMdApi.CreateFtdcMdApi(
                Pointer.pointerToCString(config.getLogPath()), false, false) ;
        CThostFtdcMdApi ftdcMdApi = PointerThostFtdcMdApi.get( ) ;
        /*
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( ftdcMdApi ) ;        // 必须的
        RiskaMdSpi riskaMdSpi = new RiskaMdSpi();
        riskaMdSpi.setM_api(ftdcMdApi);
        riskaMdSpi.setM_brokerID(config.getBrokerID());
        riskaMdSpi.setM_userID(config.getUserID());
        riskaMdSpi.setM_password(config.getPassword());
        riskaMdSpi.setMarketDataID(config.getMarketDataID());
        /*
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( riskaMdSpi ) ;            // 必须的
        ftdcMdApi.RegisterSpi( Pointer.pointerTo( riskaMdSpi ) ) ;
        ftdcMdApi.RegisterFront( Pointer.pointerToCString( config.getHost() ) );
        ftdcMdApi.Init();
        ftdcMdApi.Join();
        LOGGER.info("CThostFtdcMdApi Init finished!!!");
    }
}
