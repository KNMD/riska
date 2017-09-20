package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd\ufffd\u07b2\u05b6\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:1066</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSPositionLimitVolTField extends StructObject {
	public CKSPositionLimitVolTField() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
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
	 * \ufffd\u07b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSLimitFlagType
	 */
	@Field(4) 
	public byte LimitFlag() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \ufffd\u07b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSLimitFlagType
	 */
	@Field(4) 
	public CKSPositionLimitVolTField LimitFlag(byte LimitFlag) {
		this.io.setByteField(this, 4, LimitFlag);
		return this;
	}
	/**
	 * \ufffd\u05b2\u05b7\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(5) 
	public byte OptionsType() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\u05b2\u05b7\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(5) 
	public CKSPositionLimitVolTField OptionsType(byte OptionsType) {
		this.io.setByteField(this, 5, OptionsType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u01b7\ufffd\u03a7<br>
	 * C type : TKSControlRangeType
	 */
	@Field(6) 
	public byte ControlRange() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\u01b7\ufffd\u03a7<br>
	 * C type : TKSControlRangeType
	 */
	@Field(6) 
	public CKSPositionLimitVolTField ControlRange(byte ControlRange) {
		this.io.setByteField(this, 6, ControlRange);
		return this;
	}
	/**
	 * \ufffd\u07b2\u05b6\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public int PosiLimitVol() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * \ufffd\u07b2\u05b6\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public CKSPositionLimitVolTField PosiLimitVol(int PosiLimitVol) {
		this.io.setIntField(this, 7, PosiLimitVol);
		return this;
	}
	public CKSPositionLimitVolTField(Pointer pointer) {
		super(pointer);
	}
}