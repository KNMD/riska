package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f3\u05b2\ufffd\ufffd\ufffd\u03f8<br>
 * <i>native declaration : KSVocApiStruct.h:1665</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSInvestorPositionCombineDetailField extends StructObject {
	public CKSInvestorPositionCombineDetailField() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(4) 
	public Pointer<Byte > ComTradeID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0534\ufffd\ufffd\ufffd<br>
	 * C type : TKSCombStrategyIDType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > StrategyID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd1<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(6) 
	public Pointer<Byte > InstrumentID1() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd2<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(7) 
	public Pointer<Byte > InstrumentID2() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd3<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(8) 
	public Pointer<Byte > InstrumentID3() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd4<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(9) 
	public Pointer<Byte > InstrumentID4() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \u057c\ufffd\u00f1\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public double Margin() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \u057c\ufffd\u00f1\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public CKSInvestorPositionCombineDetailField Margin(double Margin) {
		this.io.setDoubleField(this, 10, Margin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0536\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int CombActionVolume() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0536\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CKSInvestorPositionCombineDetailField CombActionVolume(int CombActionVolume) {
		this.io.setIntField(this, 11, CombActionVolume);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(12) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(12) 
	public CKSInvestorPositionCombineDetailField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 12, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(13) 
	public int TotalAmt() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(13) 
	public CKSInvestorPositionCombineDetailField TotalAmt(int TotalAmt) {
		this.io.setIntField(this, 13, TotalAmt);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd1<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(14) 
	public byte Direction1() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd1<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(14) 
	public CKSInvestorPositionCombineDetailField Direction1(byte Direction1) {
		this.io.setByteField(this, 14, Direction1);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd2<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(15) 
	public byte Direction2() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd2<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(15) 
	public CKSInvestorPositionCombineDetailField Direction2(byte Direction2) {
		this.io.setByteField(this, 15, Direction2);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(16) 
	public byte Direction3() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(16) 
	public CKSInvestorPositionCombineDetailField Direction3(byte Direction3) {
		this.io.setByteField(this, 16, Direction3);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(17) 
	public byte Direction4() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(17) 
	public CKSInvestorPositionCombineDetailField Direction4(byte Direction4) {
		this.io.setByteField(this, 17, Direction4);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(18) 
	public byte CombDirection() {
		return this.io.getByteField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(18) 
	public CKSInvestorPositionCombineDetailField CombDirection(byte CombDirection) {
		this.io.setByteField(this, 18, CombDirection);
		return this;
	}
	public CKSInvestorPositionCombineDetailField(Pointer pointer) {
		super(pointer);
	}
}