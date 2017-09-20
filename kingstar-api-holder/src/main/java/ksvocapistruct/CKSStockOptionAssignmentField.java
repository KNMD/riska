package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\u05b8\ufffd\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : KSVocApiStruct.h:655</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSStockOptionAssignmentField extends StructObject {
	public CKSStockOptionAssignmentField() {
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
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(3) 
	public byte Direction() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(3) 
	public CKSStockOptionAssignmentField Direction(byte Direction) {
		this.io.setByteField(this, 3, Direction);
		return this;
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
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentNameType
	 */
	@Array({21}) 
	@Field(5) 
	public Pointer<Byte > InstrumentName() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(6) 
	public Pointer<Byte > ProductID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(7) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(7) 
	public CKSStockOptionAssignmentField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 7, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public int YdPosition() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public CKSStockOptionAssignmentField YdPosition(int YdPosition) {
		this.io.setIntField(this, 8, YdPosition);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\u05b8\ufffd\u027a\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public int AssInsVo() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u0228\u05b8\ufffd\u027a\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public CKSStockOptionAssignmentField AssInsVo(int AssInsVo) {
		this.io.setIntField(this, 9, AssInsVo);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\u05a4\u022f\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public int AssProVol() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\u05a4\u022f\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public CKSStockOptionAssignmentField AssProVol(int AssProVol) {
		this.io.setIntField(this, 10, AssProVol);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\u05b8\ufffd\ufffd\u04e6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public double FeePay() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\u0228\u05b8\ufffd\ufffd\u04e6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public CKSStockOptionAssignmentField FeePay(double FeePay) {
		this.io.setDoubleField(this, 11, FeePay);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228C/P\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(12) 
	public byte OptionsType() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u0228C/P\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(12) 
	public CKSStockOptionAssignmentField OptionsType(byte OptionsType) {
		this.io.setByteField(this, 12, OptionsType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > DeliveryDay() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\u027a\ufffd\u053c\ufffd\ufffd\u02b6\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(14) 
	public Pointer<Byte > StockID() {
		return this.io.getPointerField(this, 14);
	}
	public CKSStockOptionAssignmentField(Pointer pointer) {
		super(pointer);
	}
}