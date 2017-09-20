package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\u01b2\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:4328</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcBrokerLimitPosiParamField extends StructObject {
	public CThostFtdcBrokerLimitPosiParamField() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	@Field(3) 
	public double TotalVolume() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	@Field(3) 
	public CThostFtdcBrokerLimitPosiParamField TotalVolume(double TotalVolume) {
		this.io.setDoubleField(this, 3, TotalVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	@Field(4) 
	public double LongVolume() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLargeVolumeType
	 */
	@Field(4) 
	public CThostFtdcBrokerLimitPosiParamField LongVolume(double LongVolume) {
		this.io.setDoubleField(this, 4, LongVolume);
		return this;
	}
	public CThostFtdcBrokerLimitPosiParamField(Pointer pointer) {
		super(pointer);
	}
}
