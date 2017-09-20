package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f2\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:1573</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSCombActionField extends StructObject {
	public CKSCombActionField() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(8) 
	public Pointer<Byte > CombActionRef() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(9) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 9);
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
	public CKSCombActionField Direction1(byte Direction1) {
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
	public CKSCombActionField Direction2(byte Direction2) {
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
	public CKSCombActionField Direction3(byte Direction3) {
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
	public CKSCombActionField Direction4(byte Direction4) {
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
	public CKSCombActionField CombActionFlag(byte CombActionFlag) {
		this.io.setByteField(this, 14, CombActionFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(15) 
	public int Volume() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(15) 
	public CKSCombActionField Volume(int Volume) {
		this.io.setIntField(this, 15, Volume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f2\ufffd\u05b1\ufffd\ufffd<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(16) 
	public byte CombDirection() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \ufffd\ufffd\u03f2\ufffd\u05b1\ufffd\ufffd<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(16) 
	public CKSCombActionField CombDirection(byte CombDirection) {
		this.io.setByteField(this, 16, CombDirection);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(17) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(17) 
	public CKSCombActionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 17, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(18) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(19) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(20) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(21) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(22) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(23) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(24) 
	public int InstallID() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(24) 
	public CKSCombActionField InstallID(int InstallID) {
		this.io.setIntField(this, 24, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(25) 
	public byte ActionStatus() {
		return this.io.getByteField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(25) 
	public CKSCombActionField ActionStatus(byte ActionStatus) {
		this.io.setByteField(this, 25, ActionStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(26) 
	public int NotifySequence() {
		return this.io.getIntField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(26) 
	public CKSCombActionField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 26, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(27) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(28) 
	public int SettlementID() {
		return this.io.getIntField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(28) 
	public CKSCombActionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 28, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(29) 
	public int SequenceNo() {
		return this.io.getIntField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(29) 
	public CKSCombActionField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 29, SequenceNo);
		return this;
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(30) 
	public int FrontID() {
		return this.io.getIntField(this, 30);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(30) 
	public CKSCombActionField FrontID(int FrontID) {
		this.io.setIntField(this, 30, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(31) 
	public int SessionID() {
		return this.io.getIntField(this, 31);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(31) 
	public CKSCombActionField SessionID(int SessionID) {
		this.io.setIntField(this, 31, SessionID);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(32) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 32);
	}
	/**
	 * \u05f4\u032c\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({256}) 
	@Field(33) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(34) 
	public Pointer<Byte > ComTradeID() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(35) 
	public byte OrderSource() {
		return this.io.getByteField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(35) 
	public CKSCombActionField OrderSource(byte OrderSource) {
		this.io.setByteField(this, 35, OrderSource);
		return this;
	}
	public CKSCombActionField(Pointer pointer) {
		super(pointer);
	}
}
