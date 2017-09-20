package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u05f4\u032c\ufffd\ufffd\u03e2<br>
 * <i>native declaration : KSVocApiStruct.h:469</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSPLStatusField extends StructObject {
	public CKSPLStatusField() {
		super();
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0531<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({16}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public int SequenceNo() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public CKSPLStatusField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 3, SequenceNo);
		return this;
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSProfitAndLossOrderIDType
	 */
	@Field(4) 
	public int ProfitAndLossOrderID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSProfitAndLossOrderIDType
	 */
	@Field(4) 
	public CKSPLStatusField ProfitAndLossOrderID(int ProfitAndLossOrderID) {
		this.io.setIntField(this, 4, ProfitAndLossOrderID);
		return this;
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(5) 
	public int StopLossOrderID() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(5) 
	public CKSPLStatusField StopLossOrderID(int StopLossOrderID) {
		this.io.setIntField(this, 5, StopLossOrderID);
		return this;
	}
	/**
	 * \u05b9\u04ef\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(6) 
	public int TakeProfitOrderID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u05b9\u04ef\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(6) 
	public CKSPLStatusField TakeProfitOrderID(int TakeProfitOrderID) {
		this.io.setIntField(this, 6, TakeProfitOrderID);
		return this;
	}
	/**
	 * \u04ef\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TKSConditionalOrderStatusType
	 */
	@Field(7) 
	public byte ProfitAndLossOrderStatus() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u04ef\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TKSConditionalOrderStatusType
	 */
	@Field(7) 
	public CKSPLStatusField ProfitAndLossOrderStatus(byte ProfitAndLossOrderStatus) {
		this.io.setByteField(this, 7, ProfitAndLossOrderStatus);
		return this;
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(8) 
	public double StopLossPrice() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(8) 
	public CKSPLStatusField StopLossPrice(double StopLossPrice) {
		this.io.setDoubleField(this, 8, StopLossPrice);
		return this;
	}
	/**
	 * \u05b9\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public double TakeProfitPrice() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \u05b9\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public CKSPLStatusField TakeProfitPrice(double TakeProfitPrice) {
		this.io.setDoubleField(this, 9, TakeProfitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u04ef\ufffd\ufffd\u06f5\u0137\ufffd\u02bd<br>
	 * C type : TKSOffsetValueType
	 */
	@Field(10) 
	public byte OffsetValue() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\u04ef\ufffd\ufffd\u06f5\u0137\ufffd\u02bd<br>
	 * C type : TKSOffsetValueType
	 */
	@Field(10) 
	public CKSPLStatusField OffsetValue(byte OffsetValue) {
		this.io.setByteField(this, 10, OffsetValue);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b3\u027d\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(11) 
	public double OpenTradePrice() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b3\u027d\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(11) 
	public CKSPLStatusField OpenTradePrice(double OpenTradePrice) {
		this.io.setDoubleField(this, 11, OpenTradePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05e2<br>
	 * C type : TThostFtdcMemoType
	 */
	@Array({161}) 
	@Field(12) 
	public Pointer<Byte > Memo() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(13) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(14) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(15) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(16) 
	public byte OrderStatus() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(16) 
	public CKSPLStatusField OrderStatus(byte OrderStatus) {
		this.io.setByteField(this, 16, OrderStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(17) 
	public byte CombOffsetFlag() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(17) 
	public CKSPLStatusField CombOffsetFlag(byte CombOffsetFlag) {
		this.io.setByteField(this, 17, CombOffsetFlag);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(18) 
	public byte CombHedgeFlag() {
		return this.io.getByteField(this, 18);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(18) 
	public CKSPLStatusField CombHedgeFlag(byte CombHedgeFlag) {
		this.io.setByteField(this, 18, CombHedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(19) 
	public byte Direction() {
		return this.io.getByteField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(19) 
	public CKSPLStatusField Direction(byte Direction) {
		this.io.setByteField(this, 19, Direction);
		return this;
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(20) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 20);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(20) 
	public CKSPLStatusField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 20, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(21) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(21) 
	public CKSPLStatusField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 21, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(23) 
	public Pointer<Byte > CancelUserID() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(24) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(25) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(26) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(27) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(28) 
	public int VolumeTraded() {
		return this.io.getIntField(this, 28);
	}
	/**
	 * \ufffd\ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(28) 
	public CKSPLStatusField VolumeTraded(int VolumeTraded) {
		this.io.setIntField(this, 28, VolumeTraded);
		return this;
	}
	/**
	 * \u02a3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(29) 
	public int VolumeTotal() {
		return this.io.getIntField(this, 29);
	}
	/**
	 * \u02a3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(29) 
	public CKSPLStatusField VolumeTotal(int VolumeTotal) {
		this.io.setIntField(this, 29, VolumeTotal);
		return this;
	}
	/**
	 * \u03af\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(30) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(31) 
	public Pointer<Byte > ActiveTime() {
		return this.io.getPointerField(this, 31);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(32) 
	public double TradePrice() {
		return this.io.getDoubleField(this, 32);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(32) 
	public CKSPLStatusField TradePrice(double TradePrice) {
		this.io.setDoubleField(this, 32, TradePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u04b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(33) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 33);
	}
	public CKSPLStatusField(Pointer pointer) {
		super(pointer);
	}
}