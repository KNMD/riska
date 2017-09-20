package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u027d\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:1715</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcTradeField extends StructObject {
	public CThostFtdcTradeField() {
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
	public Pointer<Byte > OrderRef() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(6) 
	public Pointer<Byte > TradeID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(7) 
	public byte Direction() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(7) 
	public CThostFtdcTradeField Direction(byte Direction) {
		this.io.setByteField(this, 7, Direction);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(9) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(10) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05fd\ufffd\u026b<br>
	 * C type : TThostFtdcTradingRoleType
	 */
	@Field(11) 
	public byte TradingRole() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05fd\ufffd\u026b<br>
	 * C type : TThostFtdcTradingRoleType
	 */
	@Field(11) 
	public CThostFtdcTradeField TradingRole(byte TradingRole) {
		this.io.setByteField(this, 11, TradingRole);
		return this;
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(12) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(13) 
	public byte OffsetFlag() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(13) 
	public CThostFtdcTradeField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 13, OffsetFlag);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(14) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(14) 
	public CThostFtdcTradeField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 14, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(15) 
	public double Price() {
		return this.io.getDoubleField(this, 15);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(15) 
	public CThostFtdcTradeField Price(double Price) {
		this.io.setDoubleField(this, 15, Price);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(16) 
	public int Volume() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(16) 
	public CThostFtdcTradeField Volume(int Volume) {
		this.io.setIntField(this, 16, Volume);
		return this;
	}
	/**
	 * \ufffd\u027d\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(17) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\u027d\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTypeType
	 */
	@Field(19) 
	public byte TradeType() {
		return this.io.getByteField(this, 19);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTypeType
	 */
	@Field(19) 
	public CThostFtdcTradeField TradeType(byte TradeType) {
		this.io.setByteField(this, 19, TradeType);
		return this;
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcPriceSourceType
	 */
	@Field(20) 
	public byte PriceSource() {
		return this.io.getByteField(this, 20);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcPriceSourceType
	 */
	@Field(20) 
	public CThostFtdcTradeField PriceSource(byte PriceSource) {
		this.io.setByteField(this, 20, PriceSource);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(22) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(23) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(24) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(25) 
	public int SequenceNo() {
		return this.io.getIntField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(25) 
	public CThostFtdcTradeField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 25, SequenceNo);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(26) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(27) 
	public int SettlementID() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(27) 
	public CThostFtdcTradeField SettlementID(int SettlementID) {
		this.io.setIntField(this, 27, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(28) 
	public int BrokerOrderSeq() {
		return this.io.getIntField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(28) 
	public CThostFtdcTradeField BrokerOrderSeq(int BrokerOrderSeq) {
		this.io.setIntField(this, 28, BrokerOrderSeq);
		return this;
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcTradeSourceType
	 */
	@Field(29) 
	public byte TradeSource() {
		return this.io.getByteField(this, 29);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcTradeSourceType
	 */
	@Field(29) 
	public CThostFtdcTradeField TradeSource(byte TradeSource) {
		this.io.setByteField(this, 29, TradeSource);
		return this;
	}
	public CThostFtdcTradeField(Pointer pointer) {
		super(pointer);
	}
}
