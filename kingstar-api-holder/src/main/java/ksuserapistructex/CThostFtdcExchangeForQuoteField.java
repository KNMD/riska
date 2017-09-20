package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : KSUserApiStructEx.h:3306</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcExchangeForQuoteField extends StructObject {
	public CThostFtdcExchangeForQuoteField() {
		super();
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > ForQuoteLocalID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(5) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(6) 
	public int InstallID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(6) 
	public CThostFtdcExchangeForQuoteField InstallID(int InstallID) {
		this.io.setIntField(this, 6, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u046f\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcForQuoteStatusType
	 */
	@Field(9) 
	public byte ForQuoteStatus() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u046f\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcForQuoteStatusType
	 */
	@Field(9) 
	public CThostFtdcExchangeForQuoteField ForQuoteStatus(byte ForQuoteStatus) {
		this.io.setByteField(this, 9, ForQuoteStatus);
		return this;
	}
	public CThostFtdcExchangeForQuoteField(Pointer pointer) {
		super(pointer);
	}
}
