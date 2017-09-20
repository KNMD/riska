package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u0275\ufffd\ufffd\u0171\ufffd\u05a4\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:2029</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSOptionMarginField extends StructObject {
	public CKSOptionMarginField() {
		super();
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
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
	 * \ufffd\ufffd\ufffd\u0275\ufffd\ufffd\u0171\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public double OptionMargin() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0275\ufffd\ufffd\u0171\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public CKSOptionMarginField OptionMargin(double OptionMargin) {
		this.io.setDoubleField(this, 2, OptionMargin);
		return this;
	}
	public CKSOptionMarginField(Pointer pointer) {
		super(pointer);
	}
}
