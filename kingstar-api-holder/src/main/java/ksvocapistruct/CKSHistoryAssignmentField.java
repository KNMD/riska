package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u0228\u05b8\ufffd\ufffd\ufffd\ufffd\u03f8<br>
 * <i>native declaration : KSVocApiStruct.h:1389</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSHistoryAssignmentField extends StructObject {
	public CKSHistoryAssignmentField() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(3) 
	public Pointer<Byte > ProductID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(4) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(5) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05a4\u022f\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(6) 
	public Pointer<Byte > StockInstr() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(7) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(7) 
	public CKSHistoryAssignmentField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 7, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(8) 
	public byte OptionsType() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(8) 
	public CKSHistoryAssignmentField OptionsType(byte OptionsType) {
		this.io.setByteField(this, 8, OptionsType);
		return this;
	}
	/**
	 * \ufffd\u05b2\u05b7\ufffd\ufffd\ufffd<br>
	 * C type : TKSSOPosiDirectionType
	 */
	@Field(9) 
	public byte PosiDirection() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \ufffd\u05b2\u05b7\ufffd\ufffd\ufffd<br>
	 * C type : TKSSOPosiDirectionType
	 */
	@Field(9) 
	public CKSHistoryAssignmentField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 9, PosiDirection);
		return this;
	}
	/**
	 * \u05b4\ufffd\u043c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public double StrikePrice() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \u05b4\ufffd\u043c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(10) 
	public CKSHistoryAssignmentField StrikePrice(double StrikePrice) {
		this.io.setDoubleField(this, 10, StrikePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int ExecVol() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\u0228\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CKSHistoryAssignmentField ExecVol(int ExecVol) {
		this.io.setIntField(this, 11, ExecVol);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05a4\u022f\u04e6\ufffd\u0578\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(12) 
	public int IOVol() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05a4\u022f\u04e6\ufffd\u0578\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(12) 
	public CKSHistoryAssignmentField IOVol(int IOVol) {
		this.io.setIntField(this, 12, IOVol);
		return this;
	}
	/**
	 * \u04e6\ufffd\u0578\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public double IOAmt() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \u04e6\ufffd\u0578\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(13) 
	public CKSHistoryAssignmentField IOAmt(double IOAmt) {
		this.io.setDoubleField(this, 13, IOAmt);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(14) 
	public Pointer<Byte > DelivDate() {
		return this.io.getPointerField(this, 14);
	}
	public CKSHistoryAssignmentField(Pointer pointer) {
		super(pointer);
	}
}
