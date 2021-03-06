package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:5078</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcMarketDataBaseField extends StructObject {
	public CThostFtdcMarketDataBaseField() {
		super();
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(1) 
	public double PreSettlementPrice() {
		return this.io.getDoubleField(this, 1);
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(1) 
	public CThostFtdcMarketDataBaseField PreSettlementPrice(double PreSettlementPrice) {
		this.io.setDoubleField(this, 1, PreSettlementPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public double PreClosePrice() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(2) 
	public CThostFtdcMarketDataBaseField PreClosePrice(double PreClosePrice) {
		this.io.setDoubleField(this, 2, PreClosePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05b2\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	@Field(3) 
	public double PreOpenInterest() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u05b2\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	@Field(3) 
	public CThostFtdcMarketDataBaseField PreOpenInterest(double PreOpenInterest) {
		this.io.setDoubleField(this, 3, PreOpenInterest);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public double PreDelta() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public CThostFtdcMarketDataBaseField PreDelta(double PreDelta) {
		this.io.setDoubleField(this, 4, PreDelta);
		return this;
	}
	public CThostFtdcMarketDataBaseField(Pointer pointer) {
		super(pointer);
	}
}
