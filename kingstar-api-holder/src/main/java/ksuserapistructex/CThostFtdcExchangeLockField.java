package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:4025</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcExchangeLockField extends StructObject {
	public CThostFtdcExchangeLockField() {
		super();
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(0) 
	public int Volume() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(0) 
	public CThostFtdcExchangeLockField Volume(int Volume) {
		this.io.setIntField(this, 0, Volume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(1) 
	public int RequestID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(1) 
	public CThostFtdcExchangeLockField RequestID(int RequestID) {
		this.io.setIntField(this, 1, RequestID);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLockTypeType
	 */
	@Field(3) 
	public byte LockType() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLockTypeType
	 */
	@Field(3) 
	public CThostFtdcExchangeLockField LockType(byte LockType) {
		this.io.setByteField(this, 3, LockType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(4) 
	public Pointer<Byte > LockLocalID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(6) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(8) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(9) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(10) 
	public int InstallID() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(10) 
	public CThostFtdcExchangeLockField InstallID(int InstallID) {
		this.io.setIntField(this, 10, InstallID);
		return this;
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(11) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(11) 
	public CThostFtdcExchangeLockField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 11, OrderSubmitStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(12) 
	public int NotifySequence() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(12) 
	public CThostFtdcExchangeLockField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 12, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(14) 
	public int SettlementID() {
		return this.io.getIntField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(14) 
	public CThostFtdcExchangeLockField SettlementID(int SettlementID) {
		this.io.setIntField(this, 14, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(15) 
	public Pointer<Byte > LockSysID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(16) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(17) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(19) 
	public byte LockStatus() {
		return this.io.getByteField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(19) 
	public CThostFtdcExchangeLockField LockStatus(byte LockStatus) {
		this.io.setByteField(this, 19, LockStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(20) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(21) 
	public int SequenceNo() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(21) 
	public CThostFtdcExchangeLockField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 21, SequenceNo);
		return this;
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 22);
	}
	public CThostFtdcExchangeLockField(Pointer pointer) {
		super(pointer);
	}
}