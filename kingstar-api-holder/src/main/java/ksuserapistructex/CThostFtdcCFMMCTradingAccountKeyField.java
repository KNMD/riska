package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u02bd\ufffd\ufffd\u02fb\ufffd\ufffd\ufffd\u053f<br>
 * <i>native declaration : KSUserApiStructEx.h:6428</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcCFMMCTradingAccountKeyField extends StructObject {
	public CThostFtdcCFMMCTradingAccountKeyField() {
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
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\u0373\u04bb\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({16}) 
	@Field(2) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u053f\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public int KeyID() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u053f\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public CThostFtdcCFMMCTradingAccountKeyField KeyID(int KeyID) {
		this.io.setIntField(this, 3, KeyID);
		return this;
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\u053f<br>
	 * C type : TThostFtdcCFMMCKeyType
	 */
	@Array({21}) 
	@Field(4) 
	public Pointer<Byte > CurrentKey() {
		return this.io.getPointerField(this, 4);
	}
	public CThostFtdcCFMMCTradingAccountKeyField(Pointer pointer) {
		super(pointer);
	}
}
