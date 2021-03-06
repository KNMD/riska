package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u01f0\ufffd\ufffd\u05f4\u032c<br>
 * <i>native declaration : KSUserApiStructEx.h:1204</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcFrontStatusField extends StructObject {
	public CThostFtdcFrontStatusField() {
		super();
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0) 
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0) 
	public CThostFtdcFrontStatusField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	/**
	 * \ufffd\u03f4\u03b1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > LastReportDate() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\u03f4\u03b1\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > LastReportTime() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(3) 
	public int IsActive() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(3) 
	public CThostFtdcFrontStatusField IsActive(int IsActive) {
		this.io.setIntField(this, 3, IsActive);
		return this;
	}
	public CThostFtdcFrontStatusField(Pointer pointer) {
		super(pointer);
	}
}
