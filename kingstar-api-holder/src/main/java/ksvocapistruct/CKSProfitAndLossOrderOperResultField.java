package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:324</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSProfitAndLossOrderOperResultField extends StructObject {
	public CKSProfitAndLossOrderOperResultField() {
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
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSProfitAndLossOrderIDType
	 */
	@Field(2) 
	public int ProfitAndLossOrderID() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSProfitAndLossOrderIDType
	 */
	@Field(2) 
	public CKSProfitAndLossOrderOperResultField ProfitAndLossOrderID(int ProfitAndLossOrderID) {
		this.io.setIntField(this, 2, ProfitAndLossOrderID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0531<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(3) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPartyNameType
	 */
	@Array({81}) 
	@Field(4) 
	public Pointer<Byte > InvestorName() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(6) 
	public double StopLossPrice() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(6) 
	public CKSProfitAndLossOrderOperResultField StopLossPrice(double StopLossPrice) {
		this.io.setDoubleField(this, 6, StopLossPrice);
		return this;
	}
	/**
	 * \u05b9\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(7) 
	public double TakeProfitPrice() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \u05b9\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(7) 
	public CKSProfitAndLossOrderOperResultField TakeProfitPrice(double TakeProfitPrice) {
		this.io.setDoubleField(this, 7, TakeProfitPrice);
		return this;
	}
	/**
	 * \u01bd\ufffd\u05b7\ufffd\u02bd<br>
	 * C type : TKSCloseModeType
	 */
	@Field(8) 
	public byte CloseMode() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u01bd\ufffd\u05b7\ufffd\u02bd<br>
	 * C type : TKSCloseModeType
	 */
	@Field(8) 
	public CKSProfitAndLossOrderOperResultField CloseMode(byte CloseMode) {
		this.io.setByteField(this, 8, CloseMode);
		return this;
	}
	/**
	 * \u01bd\ufffd\u05b7\ufffd\ufffd\ufffd\u04fc\ufffd\ufffd\ufffd\u03bb\ufffd\ufffd\u01bd\ufffd\u05b7\ufffd\u02bd=1\ufffd\ufffd2\u02b1\ufffd\ufffd\u0427\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public double Figures() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \u01bd\ufffd\u05b7\ufffd\ufffd\ufffd\u04fc\ufffd\ufffd\ufffd\u03bb\ufffd\ufffd\u01bd\ufffd\u05b7\ufffd\u02bd=1\ufffd\ufffd2\u02b1\ufffd\ufffd\u0427\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public CKSProfitAndLossOrderOperResultField Figures(double Figures) {
		this.io.setDoubleField(this, 9, Figures);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u9d25\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\ufffd\u00bc\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public double LastPrice() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\u9d25\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\ufffd\u00bc\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public CKSProfitAndLossOrderOperResultField LastPrice(double LastPrice) {
		this.io.setDoubleField(this, 10, LastPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(11) 
	public Pointer<Byte > ProfitAndLossOrderFormTime() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > ConditionalOrderFormTime() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\u03af\ufffd\u0435\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > OrderFormTime() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TKSConditionalOrderStatusType
	 */
	@Field(14) 
	public byte ProfitAndLossOrderStatus() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TKSConditionalOrderStatusType
	 */
	@Field(14) 
	public CKSProfitAndLossOrderOperResultField ProfitAndLossOrderStatus(byte ProfitAndLossOrderStatus) {
		this.io.setByteField(this, 14, ProfitAndLossOrderStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(15) 
	public int ConditionalOrderID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSConditionalOrderIDType
	 */
	@Field(15) 
	public CKSProfitAndLossOrderOperResultField ConditionalOrderID(int ConditionalOrderID) {
		this.io.setIntField(this, 15, ConditionalOrderID);
		return this;
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
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(17) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(18) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(19) 
	public byte CombOffsetFlag() {
		return this.io.getByteField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(19) 
	public CKSProfitAndLossOrderOperResultField CombOffsetFlag(byte CombOffsetFlag) {
		this.io.setByteField(this, 19, CombOffsetFlag);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(20) 
	public byte CombHedgeFlag() {
		return this.io.getByteField(this, 20);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(20) 
	public CKSProfitAndLossOrderOperResultField CombHedgeFlag(byte CombHedgeFlag) {
		this.io.setByteField(this, 20, CombHedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(21) 
	public byte Direction() {
		return this.io.getByteField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(21) 
	public CKSProfitAndLossOrderOperResultField Direction(byte Direction) {
		this.io.setByteField(this, 21, Direction);
		return this;
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(22) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 22);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(22) 
	public CKSProfitAndLossOrderOperResultField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 22, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(23) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(23) 
	public CKSProfitAndLossOrderOperResultField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 23, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u04ef\ufffd\ufffd\u06f5\u0137\ufffd\u02bd<br>
	 * C type : TKSOffsetValueType
	 */
	@Field(24) 
	public byte OffsetValue() {
		return this.io.getByteField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\u04ef\ufffd\ufffd\u06f5\u0137\ufffd\u02bd<br>
	 * C type : TKSOffsetValueType
	 */
	@Field(24) 
	public CKSProfitAndLossOrderOperResultField OffsetValue(byte OffsetValue) {
		this.io.setByteField(this, 24, OffsetValue);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(25) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSSpringTypeType
	 */
	@Field(26) 
	public byte SpringType() {
		return this.io.getByteField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSSpringTypeType
	 */
	@Field(26) 
	public CKSProfitAndLossOrderOperResultField SpringType(byte SpringType) {
		this.io.setByteField(this, 26, SpringType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27) 
	public double FloatLimitPrice() {
		return this.io.getDoubleField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27) 
	public CKSProfitAndLossOrderOperResultField FloatLimitPrice(double FloatLimitPrice) {
		this.io.setDoubleField(this, 27, FloatLimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b3\u027d\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(28) 
	public double OpenTradePrice() {
		return this.io.getDoubleField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b3\u027d\ufffd\ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(28) 
	public CKSProfitAndLossOrderOperResultField OpenTradePrice(double OpenTradePrice) {
		this.io.setDoubleField(this, 28, OpenTradePrice);
		return this;
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u05be<br>
	 * C type : TKSProfitAndLossFlagType
	 */
	@Field(29) 
	public byte ProfitAndLossFlag() {
		return this.io.getByteField(this, 29);
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u05be<br>
	 * C type : TKSProfitAndLossFlagType
	 */
	@Field(29) 
	public CKSProfitAndLossOrderOperResultField ProfitAndLossFlag(byte ProfitAndLossFlag) {
		this.io.setByteField(this, 29, ProfitAndLossFlag);
		return this;
	}
	public CKSProfitAndLossOrderOperResultField(Pointer pointer) {
		super(pointer);
	}
}
