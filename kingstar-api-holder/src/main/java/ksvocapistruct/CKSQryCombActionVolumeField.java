package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u027f\ufffd\ufffd\ufffd\u03ff\u0272\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:1708</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSQryCombActionVolumeField extends StructObject {
	public CKSQryCombActionVolumeField() {
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
	 * \ufffd\ufffd\ufffd\u0534\ufffd\ufffd\ufffd<br>
	 * C type : TKSCombStrategyIDType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > StrategyID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd1<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(4) 
	public Pointer<Byte > InstrumentID1() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd2<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(5) 
	public Pointer<Byte > InstrumentID2() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd3<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(6) 
	public Pointer<Byte > InstrumentID3() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd4<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(7) 
	public Pointer<Byte > InstrumentID4() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public CKSQryCombActionVolumeField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 8, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f2\ufffd\u05b1\ufffd\ufffd<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(9) 
	public byte CombDirection() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u03f2\ufffd\u05b1\ufffd\ufffd<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(9) 
	public CKSQryCombActionVolumeField CombDirection(byte CombDirection) {
		this.io.setByteField(this, 9, CombDirection);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd1<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(10) 
	public byte Direction1() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd1<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(10) 
	public CKSQryCombActionVolumeField Direction1(byte Direction1) {
		this.io.setByteField(this, 10, Direction1);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd2<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(11) 
	public byte Direction2() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd2<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(11) 
	public CKSQryCombActionVolumeField Direction2(byte Direction2) {
		this.io.setByteField(this, 11, Direction2);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(12) 
	public byte Direction3() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(12) 
	public CKSQryCombActionVolumeField Direction3(byte Direction3) {
		this.io.setByteField(this, 12, Direction3);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(13) 
	public byte Direction4() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(13) 
	public CKSQryCombActionVolumeField Direction4(byte Direction4) {
		this.io.setByteField(this, 13, Direction4);
		return this;
	}
	/**
	 * \u01ff\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSCombActionType
	 */
	@Field(14) 
	public byte CombActionFlag() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \u01ff\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSCombActionType
	 */
	@Field(14) 
	public CKSQryCombActionVolumeField CombActionFlag(byte CombActionFlag) {
		this.io.setByteField(this, 14, CombActionFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(15) 
	public Pointer<Byte > ComTradeID() {
		return this.io.getPointerField(this, 15);
	}
	public CKSQryCombActionVolumeField(Pointer pointer) {
		super(pointer);
	}
}