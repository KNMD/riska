package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u05b8\ufffd\u05bb\ufffd\u05b8\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:2730</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcIndexPriceField extends StructObject {
	public CThostFtdcIndexPriceField() {
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
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u05b8\ufffd\ufffd\ufffd\u05bb\ufffd\ufffd\ufffd\ufffd\u033c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public double ClosePrice() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u05b8\ufffd\ufffd\ufffd\u05bb\ufffd\ufffd\ufffd\ufffd\u033c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public CThostFtdcIndexPriceField ClosePrice(double ClosePrice) {
		this.io.setDoubleField(this, 2, ClosePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcIndexPriceField(Pointer pointer) {
		super(pointer);
	}
}
