package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
 * <i>native declaration : KSVocApiStruct.h:156</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSConditionalOrderOperResultField extends StructObject {
	public CKSConditionalOrderOperResultField() {
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
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(2) 
	public int ConditionalOrderID() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(2) 
	public CKSConditionalOrderOperResultField ConditionalOrderID(int ConditionalOrderID) {
		this.io.setIntField(this, 2, ConditionalOrderID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(5) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(6) 
	public byte OrderStatus() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(6) 
	public CKSConditionalOrderOperResultField OrderStatus(byte OrderStatus) {
		this.io.setByteField(this, 6, OrderStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(7) 
	public byte CombOffsetFlag() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(7) 
	public CKSConditionalOrderOperResultField CombOffsetFlag(byte CombOffsetFlag) {
		this.io.setByteField(this, 7, CombOffsetFlag);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public byte CombHedgeFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public CKSConditionalOrderOperResultField CombHedgeFlag(byte CombHedgeFlag) {
		this.io.setByteField(this, 8, CombHedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(9) 
	public byte Direction() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(9) 
	public CKSConditionalOrderOperResultField Direction(byte Direction) {
		this.io.setByteField(this, 9, Direction);
		return this;
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public CKSConditionalOrderOperResultField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 10, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CKSConditionalOrderOperResultField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 11, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(13) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(14) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(15) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TKSConditionalOrderStatusType
	 */
	@Field(16) 
	public byte ConditionalOrderStatus() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TKSConditionalOrderStatusType
	 */
	@Field(16) 
	public CKSConditionalOrderOperResultField ConditionalOrderStatus(byte ConditionalOrderStatus) {
		this.io.setByteField(this, 16, ConditionalOrderStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({256}) 
	@Field(17) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\u06f8\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(18) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 18);
	}
	/**
	 * \ufffd\u06f8\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(18) 
	public CKSConditionalOrderOperResultField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 18, OrderPriceType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(19) 
	public int TriggeredTimes() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(19) 
	public CKSConditionalOrderOperResultField TriggeredTimes(int TriggeredTimes) {
		this.io.setIntField(this, 19, TriggeredTimes);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderType
	 */
	@Field(20) 
	public byte OrderType() {
		return this.io.getByteField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderType
	 */
	@Field(20) 
	public CKSConditionalOrderOperResultField OrderType(byte OrderType) {
		this.io.setByteField(this, 20, OrderType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05e2<br>
	 * C type : TThostFtdcMemoType
	 */
	@Array({161}) 
	@Field(21) 
	public Pointer<Byte > Memo() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\u0427\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > ActiveTime() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \u02a7\u0427\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > InActiveTime() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalTypeType
	 */
	@Field(24) 
	public byte ConditionalType() {
		return this.io.getByteField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalTypeType
	 */
	@Field(24) 
	public CKSConditionalOrderOperResultField ConditionalType(byte ConditionalType) {
		this.io.setByteField(this, 24, ConditionalType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(25) 
	public double ConditionalPrice() {
		return this.io.getDoubleField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(25) 
	public CKSConditionalOrderOperResultField ConditionalPrice(double ConditionalPrice) {
		this.io.setDoubleField(this, 25, ConditionalPrice);
		return this;
	}
	public CKSConditionalOrderOperResultField(Pointer pointer) {
		super(pointer);
	}
}
