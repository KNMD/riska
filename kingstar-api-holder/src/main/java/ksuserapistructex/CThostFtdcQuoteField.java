package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:3418</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcQuoteField extends StructObject {
	public CThostFtdcQuoteField() {
		super();
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > QuoteRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public double AskPrice() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public CThostFtdcQuoteField AskPrice(double AskPrice) {
		this.io.setDoubleField(this, 5, AskPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(6) 
	public double BidPrice() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(6) 
	public CThostFtdcQuoteField BidPrice(double BidPrice) {
		this.io.setDoubleField(this, 6, BidPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public int AskVolume() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public CThostFtdcQuoteField AskVolume(int AskVolume) {
		this.io.setIntField(this, 7, AskVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public int BidVolume() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public CThostFtdcQuoteField BidVolume(int BidVolume) {
		this.io.setIntField(this, 8, BidVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(9) 
	public int RequestID() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(9) 
	public CThostFtdcQuoteField RequestID(int RequestID) {
		this.io.setIntField(this, 9, RequestID);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(10) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(11) 
	public byte AskOffsetFlag() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(11) 
	public CThostFtdcQuoteField AskOffsetFlag(byte AskOffsetFlag) {
		this.io.setByteField(this, 11, AskOffsetFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(12) 
	public byte BidOffsetFlag() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(12) 
	public CThostFtdcQuoteField BidOffsetFlag(byte BidOffsetFlag) {
		this.io.setByteField(this, 12, BidOffsetFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(13) 
	public byte AskHedgeFlag() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(13) 
	public CThostFtdcQuoteField AskHedgeFlag(byte AskHedgeFlag) {
		this.io.setByteField(this, 13, AskHedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(14) 
	public byte BidHedgeFlag() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(14) 
	public CThostFtdcQuoteField BidHedgeFlag(byte BidHedgeFlag) {
		this.io.setByteField(this, 14, BidHedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(15) 
	public Pointer<Byte > QuoteLocalID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(16) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(17) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(18) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(19) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(20) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(21) 
	public int InstallID() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(21) 
	public CThostFtdcQuoteField InstallID(int InstallID) {
		this.io.setIntField(this, 21, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(22) 
	public int NotifySequence() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(22) 
	public CThostFtdcQuoteField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 22, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(23) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(23) 
	public CThostFtdcQuoteField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 23, OrderSubmitStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(24) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(25) 
	public int SettlementID() {
		return this.io.getIntField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(25) 
	public CThostFtdcQuoteField SettlementID(int SettlementID) {
		this.io.setIntField(this, 25, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(26) 
	public Pointer<Byte > QuoteSysID() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(27) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(28) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(29) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(30) 
	public byte QuoteStatus() {
		return this.io.getByteField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(30) 
	public CThostFtdcQuoteField QuoteStatus(byte QuoteStatus) {
		this.io.setByteField(this, 30, QuoteStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(31) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(32) 
	public int SequenceNo() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(32) 
	public CThostFtdcQuoteField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 32, SequenceNo);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(33) 
	public Pointer<Byte > AskOrderSysID() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \ufffd\uda9f\udf71\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(34) 
	public Pointer<Byte > BidOrderSysID() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(35) 
	public int FrontID() {
		return this.io.getIntField(this, 35);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(35) 
	public CThostFtdcQuoteField FrontID(int FrontID) {
		this.io.setIntField(this, 35, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(36) 
	public int SessionID() {
		return this.io.getIntField(this, 36);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(36) 
	public CThostFtdcQuoteField SessionID(int SessionID) {
		this.io.setIntField(this, 36, SessionID);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(37) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 37);
	}
	/**
	 * \u05f4\u032c\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({256}) 
	@Field(38) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(39) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 39);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(40) 
	public int BrokerQuoteSeq() {
		return this.io.getIntField(this, 40);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(40) 
	public CThostFtdcQuoteField BrokerQuoteSeq(int BrokerQuoteSeq) {
		this.io.setIntField(this, 40, BrokerQuoteSeq);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(41) 
	public Pointer<Byte > AskOrderRef() {
		return this.io.getPointerField(this, 41);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\uda86\ude35\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(42) 
	public Pointer<Byte > BidOrderRef() {
		return this.io.getPointerField(this, 42);
	}
	/**
	 * \u04e6\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(43) 
	public Pointer<Byte > ForQuoteSysID() {
		return this.io.getPointerField(this, 43);
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(44) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 44);
	}
	public CThostFtdcQuoteField(Pointer pointer) {
		super(pointer);
	}
}
