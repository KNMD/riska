package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Fens\ufffd\u00fb\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : KSUserApiStructEx.h:8765</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcFensUserInfoField extends StructObject {
	public CThostFtdcFensUserInfoField() {
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
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u00bc\u0123\u02bd<br>
	 * C type : TThostFtdcLoginModeType
	 */
	@Field(2) 
	public byte LoginMode() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u00bc\u0123\u02bd<br>
	 * C type : TThostFtdcLoginModeType
	 */
	@Field(2) 
	public CThostFtdcFensUserInfoField LoginMode(byte LoginMode) {
		this.io.setByteField(this, 2, LoginMode);
		return this;
	}
	public CThostFtdcFensUserInfoField(Pointer pointer) {
		super(pointer);
	}
}
