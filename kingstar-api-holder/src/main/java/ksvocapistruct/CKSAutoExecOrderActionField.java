package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u0536\ufffd\ufffd\ufffd\u0228\u05b4\ufffd\u0432\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:1378</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSAutoExecOrderActionField extends StructObject {
	public CKSAutoExecOrderActionField() {
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
	 * \ufffd\u0536\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\u05b5(0-\ufffd\ufffd\ufffd\u0536\ufffd\ufffd\ufffd\u0228,\ufffd\ufffd0-\ufffd\ufffd\udcec\ufffd\ufffd\u05b5\ufffd\ufffd\ufffd\u0536\ufffd\ufffd\ufffd\u0228(20\ufffd\ufffd\ufffd20%))<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(2) 
	public int RangeVol() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \ufffd\u0536\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\u05b5(0-\ufffd\ufffd\ufffd\u0536\ufffd\ufffd\ufffd\u0228,\ufffd\ufffd0-\ufffd\ufffd\udcec\ufffd\ufffd\u05b5\ufffd\ufffd\ufffd\u0536\ufffd\ufffd\ufffd\u0228(20\ufffd\ufffd\ufffd20%))<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(2) 
	public CKSAutoExecOrderActionField RangeVol(int RangeVol) {
		this.io.setIntField(this, 2, RangeVol);
		return this;
	}
	public CKSAutoExecOrderActionField(Pointer pointer) {
		super(pointer);
	}
}
