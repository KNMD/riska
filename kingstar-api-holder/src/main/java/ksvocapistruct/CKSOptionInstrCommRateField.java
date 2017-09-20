package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u01f0\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\u0475\ufffd\ufffd\ufffd\u03f8\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:1917</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSOptionInstrCommRateField extends StructObject {
	public CKSOptionInstrCommRateField() {
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
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CKSOptionInstrCommRateField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({16}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\udabe\udeb2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public double BuyOpenRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\udabe\udeb2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public CKSOptionInstrCommRateField BuyOpenRatioByMoney(double BuyOpenRatioByMoney) {
		this.io.setDoubleField(this, 4, BuyOpenRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\udabe\udeb2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public double BuyOpenRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\udabe\udeb2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public CKSOptionInstrCommRateField BuyOpenRatioByVolume(double BuyOpenRatioByVolume) {
		this.io.setDoubleField(this, 5, BuyOpenRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public double BuyCloseRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public CKSOptionInstrCommRateField BuyCloseRatioByMoney(double BuyCloseRatioByMoney) {
		this.io.setDoubleField(this, 6, BuyCloseRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public double BuyCloseRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public CKSOptionInstrCommRateField BuyCloseRatioByVolume(double BuyCloseRatioByVolume) {
		this.io.setDoubleField(this, 7, BuyCloseRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double StrikeRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CKSOptionInstrCommRateField StrikeRatioByMoney(double StrikeRatioByMoney) {
		this.io.setDoubleField(this, 8, StrikeRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public double StrikeRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public CKSOptionInstrCommRateField StrikeRatioByVolume(double StrikeRatioByVolume) {
		this.io.setDoubleField(this, 9, StrikeRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(10) 
	public double SellOpenRatioByMoney() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(10) 
	public CKSOptionInstrCommRateField SellOpenRatioByMoney(double SellOpenRatioByMoney) {
		this.io.setDoubleField(this, 10, SellOpenRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public double SellOpenRatioByVolume() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public CKSOptionInstrCommRateField SellOpenRatioByVolume(double SellOpenRatioByVolume) {
		this.io.setDoubleField(this, 11, SellOpenRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(12) 
	public double SellCloseRatioByMoney() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(12) 
	public CKSOptionInstrCommRateField SellCloseRatioByMoney(double SellCloseRatioByMoney) {
		this.io.setDoubleField(this, 12, SellCloseRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(13) 
	public double SellCloseRatioByVolume() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(13) 
	public CKSOptionInstrCommRateField SellCloseRatioByVolume(double SellCloseRatioByVolume) {
		this.io.setDoubleField(this, 13, SellCloseRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u04bf\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(14) 
	public double CoveredOpenRatioByMoney() {
		return this.io.getDoubleField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\u04bf\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(14) 
	public CKSOptionInstrCommRateField CoveredOpenRatioByMoney(double CoveredOpenRatioByMoney) {
		this.io.setDoubleField(this, 14, CoveredOpenRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u04bf\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(15) 
	public double CoveredOpenRatioByVolume() {
		return this.io.getDoubleField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\u04bf\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(15) 
	public CKSOptionInstrCommRateField CoveredOpenRatioByVolume(double CoveredOpenRatioByVolume) {
		this.io.setDoubleField(this, 15, CoveredOpenRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(16) 
	public double CoveredCloseRatioByMoney() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(16) 
	public CKSOptionInstrCommRateField CoveredCloseRatioByMoney(double CoveredCloseRatioByMoney) {
		this.io.setDoubleField(this, 16, CoveredCloseRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(17) 
	public double CoveredCloseRatioByVolume() {
		return this.io.getDoubleField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(17) 
	public CKSOptionInstrCommRateField CoveredCloseRatioByVolume(double CoveredCloseRatioByVolume) {
		this.io.setDoubleField(this, 17, CoveredCloseRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 18);
	}
	public CKSOptionInstrCommRateField(Pointer pointer) {
		super(pointer);
	}
}
