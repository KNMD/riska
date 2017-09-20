package me.zyly.riska.core.domain;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Data
@Document
@CompoundIndexes({
        @CompoundIndex(name = "instrumentID", def = "{'instrumentID': -1}"),
        @CompoundIndex(name = "instrumentInt", def = "{'instrumentInt': -1}"),
        @CompoundIndex(name = "one_day_query_index", def = "{'tradeTimestamp': -1, instrument: 1}")
})
public class MarketData {
    private static final Logger LOGGER = LoggerFactory.getLogger(MarketData.class);
    private static final SimpleDateFormat sft = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    private String id;
    ///交易日 yyyyMMdd
    private Integer tradingDay;
    ///合约代码
    private String instrumentID;
    ///交易所代码
    private String exchangeID;
    ///合约在交易所的代码
//    private String exchangeInstID;
    ///最新价
    private double lastPrice;
    ///上次结算价
//    private double preSettlementPrice;
    ///昨收盘
//    private double preClosePrice;
    ///昨持仓量
//    private double preOpenInterest;
    ///今开盘
    private double openPrice;
    ///最高价
    private double highestPrice;
    ///最低价
    private double lowestPrice;
    ///数量
//    private int volume;
    ///成交金额
//    private double turnover;
    ///持仓量
//    private double openInterest;
    ///今收盘
//    private double closePrice;
    ///本次结算价
//    private double settlementPrice;
    ///涨停板价
//    private double upperLimitPrice;
    ///跌停板价
//    private double lowerLimitPrice;
    ///昨虚实度
//    private double preDelta;
    ///今虚实度
//    private double currDelta;
    ///最后修改时间
    private String updateTime;
    ///最后修改毫秒
    private int updateMillisec;
    ///申买价一
//    private double bidPrice1;
//    ///申买量一
//    private int bidVolume1;
//    ///申卖价一
//    private double askPrice1;
//    ///申卖量一
//    private int askVolume1;
//    ///申买价二
//    private double bidPrice2;
//    ///申买量二
//    private int bidVolume2;
//    ///申卖价二
//    private double askPrice2;
//    ///申卖量二
//    private int askVolume2;
//    ///申买价三
//    private double bidPrice3;
//    ///申买量三
//    private int bidVolume3;
//    ///申卖价三
//    private double askPrice3;
//    ///申卖量三
//    private int askVolume3;
//    ///申买价四
//    private double bidPrice4;
//    ///申买量四
//    private int bidVolume4;
//    ///申卖价四
//    private double askPrice4;
//    ///申卖量四
//    private int askVolume4;
//    ///申买价五
//    private double bidPrice5;
//    ///申买量五
//    private int bidVolume5;
//    ///申卖价五
//    private double askPrice5;
//    ///申卖量五
//    private int askVolume5;
//    ///当日均价
//    private double averagePrice;
//    ///业务日期
//    private String actionDay;

    //ext adv data
    private int lastPriceInt;
    private int openPriceInt;
    private int highestPriceInt;
    private int lowestPriceInt;
    private int closePriceInt;
    private long tradeTimestamp;
    private long createTimestamp;
    private long lastPriceOffsetInt;
    private String instrument;
    private int instrumentInt;

    public void optimizeData() {
        this.lastPriceInt = new BigDecimal(String.valueOf(this.lastPrice)).multiply(new BigDecimal(10)).intValue();
        this.openPriceInt = new BigDecimal(String.valueOf(this.openPrice)).multiply(new BigDecimal(10)).intValue();
        this.highestPriceInt = new BigDecimal(String.valueOf(this.highestPrice)).multiply(new BigDecimal(10)).intValue();
        this.lowestPriceInt = new BigDecimal(String.valueOf(this.lowestPrice)).multiply(new BigDecimal(10)).intValue();
        try {
            this.tradeTimestamp = sft.parse(String.valueOf(this.tradingDay) + this.updateTime.replaceAll(":", "") + String.valueOf(this.updateMillisec)).getTime();
        } catch (ParseException e) {
            throw new IllegalArgumentException("casting tradeTimestamp error");
        }
        this.createTimestamp = System.currentTimeMillis();
        this.instrument = this.instrumentID.substring(0,2);
        this.instrumentInt = Integer.parseInt(this.instrumentID.substring(2, this.instrumentID.length()));
        this.lastPriceOffsetInt = this.lastPriceInt;
    }
}
