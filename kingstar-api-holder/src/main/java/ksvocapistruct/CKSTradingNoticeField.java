package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u00fb\ufffd\ufffd\u00bc\ufffd\u0368\u05aa<br>
 * <i>native declaration : KSVocApiStruct.h:959</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSTradingNoticeField extends StructObject {
	public CKSTradingNoticeField() {
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
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSInfoTypeType
	 */
	@Field(2) 
	public byte InfoType() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSInfoTypeType
	 */
	@Field(2) 
	public CKSTradingNoticeField InfoType(byte InfoType) {
		this.io.setByteField(this, 2, InfoType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03e2\u056a\u04aa<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({36}) 
	@Field(3) 
	public Pointer<Byte > InfoDigest() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContentType
	 */
	@Array({501}) 
	@Field(4) 
	public Pointer<Byte > FieldContent() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > SendDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > SendTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(7) 
	public int SequenceNo() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(7) 
	public CKSTradingNoticeField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 7, SequenceNo);
		return this;
	}
	/**
	 * \u0237\ufffd\u03f1\ufffd\u05be<br>
	 * C type : TKSConfirmFlagType
	 */
	@Field(8) 
	public byte ConfirmFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u0237\ufffd\u03f1\ufffd\u05be<br>
	 * C type : TKSConfirmFlagType
	 */
	@Field(8) 
	public CKSTradingNoticeField ConfirmFlag(byte ConfirmFlag) {
		this.io.setByteField(this, 8, ConfirmFlag);
		return this;
	}
	public CKSTradingNoticeField(Pointer pointer) {
		super(pointer);
	}
}