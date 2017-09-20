package me.zyly.riska.api.holder;

import ksmdapiex.CThostFtdcMdApi;
import ksmdapiex.CThostFtdcMdSpi;
import ksuserapistructex.*;
import lombok.Setter;
import me.zyly.riska.core.domain.MarketData;
import org.bridj.Pointer;
import org.bridj.ann.Virtual;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.charset.Charset;

public class RiskaMdSpi extends CThostFtdcMdSpi {
    private static final Logger LOGGER = LoggerFactory.getLogger(RiskaMdSpi.class);
    private @Setter String m_brokerID;
    private @Setter String m_userID;
    private @Setter String m_password;
    private @Setter String marketDataID;
    private @Setter CThostFtdcMdApi m_api;

    /**
     * \u5f53\u5ba2\u6237\u7aef\u4e0e\u4ea4\u6613\u540e\u53f0\u5efa\u7acb\u8d77\u901a\u4fe1\u8fde\u63a5\u65f6\uff08\u8fd8\u672a\u767b\u5f55\u524d\uff09\uff0c\u8be5\u65b9\u6cd5\u88ab\u8c03\u7528\u3002<br>
     * Original signature : <code>void OnFrontConnected()</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:17</i>
     */
    @Virtual(0)
    public void OnFrontConnected() {
        LOGGER.info( "OnFrontConnected" );
        //登陆
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID( this.m_brokerID );
        userLoginField.setUserID( this.m_userID );
        userLoginField.setPassword( this.m_password );
        LOGGER.debug("start Login... {}, {}, {}", this.m_brokerID, this.m_userID, this.m_password);
        Pointer<CThostFtdcReqUserLoginField> cThostFtdcReqUserLoginFields = Pointer.pointerTo(userLoginField);
        this.m_api.ReqUserLogin( cThostFtdcReqUserLoginFields  , 1 ) ;
    }

    /**
     * 0x2003 \u6536\u5230\u9519\u8bef\u62a5\u6587<br>
     * Original signature : <code>void OnFrontDisconnected(int)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:26</i>
     */
    @Virtual(1)
    public void OnFrontDisconnected(int nReason) {
        LOGGER.info("OnFrontDisconnected, nReason: {}", nReason);
    }

    /**
     * @param nTimeLapse \u8ddd\u79bb\u4e0a\u6b21\u63a5\u6536\u62a5\u6587\u7684\u65f6\u95f4<br>
     * Original signature : <code>void OnHeartBeatWarning(int)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:30</i>
     */

    @Virtual(2)
    public void OnHeartBeatWarning(int nTimeLapse) {
        LOGGER.info("OnHeartBeatWarning, nTimeLapse: {}", nTimeLapse) ;
    }

    /**
     * \u767b\u5f55\u8bf7\u6c42\u54cd\u5e94<br>
     * Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:34</i>
     */
    @Virtual(3)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        LOGGER.info( "OnRspUserLogin: ErrorCode: {}, ErrorMsg: {}, SubscribeMarketData: {}", pRspInfo.get().ErrorID(), toUTF8(pRspInfo.get().ErrorMsg()), marketDataID);
        int nRet = this.m_api.SubscribeMarketData( Pointer.pointerToCStrings( marketDataID ) , 1 ) ;
        LOGGER.info( "SubscribeMarketData : {}", nRet );
    }

    /**
     * \u767b\u51fa\u8bf7\u6c42\u54cd\u5e94<br>
     * Original signature : <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:37</i>
     */
    @Virtual(4)
    public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
        LOGGER.info("OnRspUserLogout, ErrorCode: {}, ErrorMsg: {}", pRspInfo.get().ErrorID(), toUTF8(pRspInfo.get().ErrorMsg()));
    }

    /**
     * \u9519\u8bef\u5e94\u7b54<br>
     * Original signature : <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:40</i>
     */
    @Virtual(5)
    public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
        LOGGER.info("OnRspError, ErrorCode: {}, ErrorMsg: {}", pRspInfo.get().ErrorID(), toUTF8(pRspInfo.get().ErrorMsg()));
    }

    /**
     * \u8ba2\u9605\u884c\u60c5\u5e94\u7b54<br>
     * Original signature : <code>void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:43</i>
     */
    @Virtual(6)
    public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
//        if(null == LOGGER) {
//            System.out.println("123123");
//        }
//        if(null == pSpecificInstrument) {
//            LOGGER.debug("pSpecificInstrument is null ");
//        }
//        if(null == pRspInfo) {
//            LOGGER.debug("pRspInfo is null ");
//        }
//        LOGGER.debug("nRequestID: {}, bIsLast: {}", nRequestID, bIsLast);
//        LOGGER.info("OnRspSubMarketData, instrumentId: {}, ErrorCode: {}, ErrorMsg: {}", pSpecificInstrument.get().InstrumentID().getCString(),
//                pRspInfo.get().ErrorID(), toUTF8(pRspInfo.get().ErrorMsg())) ;
    }

    /**
     * \u53d6\u6d88\u8ba2\u9605\u884c\u60c5\u5e94\u7b54<br>
     * Original signature : <code>void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:46</i>
     */
    @Virtual(7)
    public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {

        LOGGER.info( "OnRspUnSubMarketData, instrumentId: {}, ErrorCode: {}, ErrorMsg: {}", pSpecificInstrument.get().InstrumentID().getCString(),
                pRspInfo.get().ErrorID(), toUTF8(pRspInfo.get().ErrorMsg())) ;
    }

    /**
     * \u6df1\u5ea6\u884c\u60c5\u901a\u77e5<br>
     * Original signature : <code>void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code><br>
     * <i>native declaration : ThostFtdcMdApi.h:49</i>
     */
    @Virtual(8)
    public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData) {
        CThostFtdcDepthMarketDataField data = pDepthMarketData.get();
        LOGGER.debug( "OnRtnDepthMarketData : {}", ToString_CThostFtdcDepthMarketDataField(data));
        MarketData marketData = coverToStandardMD(data);
        try {
            Boot.dataTransporter.produce(marketData);
        } catch (Exception e) {
            LOGGER.error("produce market data error", e);
        }
        LOGGER.info("marketData: {}", marketData);
    }

    private Document coverToDocument(CThostFtdcDepthMarketDataField data) {
        return new Document().append("tradingDay", data.TradingDay().getCString())
                .append("instrumentID", data.InstrumentID().getCString())
                .append("exchangeID", data.ExchangeID().getCString())
                .append("exchangeInstID", data.ExchangeInstID().getCString())
                .append("lastPrice", data.LastPrice())
                .append("preSettlementPrice", data.PreSettlementPrice())
                .append("preClosePrice", data.PreClosePrice())
                .append("preOpenInterest", data.PreOpenInterest())
                .append("openPrice", data.OpenPrice())
                .append("highestPrice", data.HighestPrice())
                .append("lowestPrice", data.LowestPrice())
                .append("volume", data.Volume())
                .append("turnover", data.Turnover())
                .append("openInterest", data.OpenInterest())
                .append("closePrice", data.ClosePrice())
                .append("settlementPrice", data.SettlementPrice())
                .append("upperLimitPrice", data.UpperLimitPrice())
                .append("lowerLimitPrice", data.LowerLimitPrice())
                .append("preDelta", data.PreDelta())
                .append("currDelta", data.CurrDelta())
                .append("updateTime", data.UpdateTime().getCString())
                .append("updateMillisec", data.UpdateMillisec())
                .append("bidPrice1", data.BidPrice1())
                .append("bidPrice2", data.BidPrice2())
                .append("bidPrice3", data.BidPrice3())
                .append("bidPrice4", data.BidPrice4())
                .append("bidPrice5", data.BidPrice5())
                .append("bidVolume1", data.BidVolume1())
                .append("bidVolume2", data.BidVolume2())
                .append("bidVolume3", data.BidVolume3())
                .append("bidVolume4", data.BidVolume4())
                .append("bidVolume5", data.BidVolume5())
                .append("askPrice1", data.AskPrice1())
                .append("askPrice2", data.AskPrice2())
                .append("askPrice3", data.AskPrice3())
                .append("askPrice4", data.AskPrice4())
                .append("askPrice5", data.AskPrice5())
                .append("askVolume1", data.AskVolume1())
                .append("askVolume2", data.AskVolume2())
                .append("askVolume3", data.AskVolume3())
                .append("askVolume4", data.AskVolume4())
                .append("askVolume5", data.AskVolume5())
                .append("averagePrice", data.AveragePrice())
                .append("actionDay", data.ActionDay().getCString());
    }

    @SuppressWarnings("unused")
    private MarketData coverToStandardMD(CThostFtdcDepthMarketDataField data) {
        MarketData marketData = new MarketData();
        marketData.setTradingDay(Integer.parseInt(data.TradingDay().getCString()));
        marketData.setInstrumentID(data.InstrumentID().getCString());
//        marketData.setExchangeInstID(data.ExchangeInstID().getCString());
        marketData.setLastPrice(data.LastPrice());
//        marketData.setPreSettlementPrice(data.PreSettlementPrice());
//        marketData.setPreClosePrice(data.PreClosePrice());
//        marketData.setPreOpenInterest(data.PreOpenInterest());
        marketData.setOpenPrice(data.OpenPrice());
        marketData.setHighestPrice(data.HighestPrice());
        marketData.setLowestPrice(data.LowestPrice());
//        marketData.setVolume(data.Volume());
//        marketData.setTurnover(data.Turnover());
//        marketData.setOpenInterest(data.OpenInterest());
//        marketData.setClosePrice(data.ClosePrice());
//        marketData.setSettlementPrice(data.SettlementPrice());
//        marketData.setUpperLimitPrice(data.UpperLimitPrice());
//        marketData.setLowerLimitPrice(data.LowerLimitPrice());
//        marketData.setPreDelta(data.PreDelta());
//        marketData.setCurrDelta(data.CurrDelta());
        marketData.setUpdateTime(data.UpdateTime().getCString());
        marketData.setUpdateMillisec(data.UpdateMillisec());
//        marketData.setBidPrice1(data.BidPrice1());
//        marketData.setBidPrice2(data.BidPrice2());
//        marketData.setBidPrice3(data.BidPrice3());
//        marketData.setBidPrice4(data.BidPrice4());
//        marketData.setBidPrice5(data.BidPrice5());
//        marketData.setBidVolume1(data.BidVolume1());
//        marketData.setBidVolume2(data.BidVolume2());
//        marketData.setBidVolume3(data.BidVolume3());
//        marketData.setBidVolume4(data.BidVolume4());
//        marketData.setBidVolume5(data.BidVolume5());
//        marketData.setAskPrice1(data.AskPrice1());
//        marketData.setAskPrice2(data.AskPrice2());
//        marketData.setAskPrice3(data.AskPrice3());
//        marketData.setAskPrice4(data.AskPrice4());
//        marketData.setAskPrice5(data.AskPrice5());
//        marketData.setAskVolume1(data.AskVolume1());
//        marketData.setAskVolume2(data.AskVolume2());
//        marketData.setAskVolume3(data.AskVolume3());
//        marketData.setAskVolume4(data.AskVolume4());
//        marketData.setAskVolume5(data.AskVolume5());
//        marketData.setAveragePrice(data.AveragePrice());
//        marketData.setActionDay(data.ActionDay().getCString());
        marketData.optimizeData();
        return marketData;
    }

    private String ToString_CThostFtdcDepthMarketDataField( CThostFtdcDepthMarketDataField data ) {
        return String.format( "%s %s.%03d %f %d %f %d %f %d" ,
                data.InstrumentID().getCString(),
                data.UpdateTime().getCString(),
                data.UpdateMillisec(),
                data.LastPrice(),
                data.Volume(),
                data.AskPrice1(),
                data.AskVolume1(),
                data.BidPrice1(),
                data.BidVolume1()
        ) ;
    }

    private String toUTF8(Pointer<Byte> pointer) {
        return pointer.getString(Pointer.StringType.C, Charset.forName("GBK"));
    }
}
