package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u9c68\ufffd\u033b\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:5397</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcMDTraderOfferField extends StructObject {
	public CThostFtdcMDTraderOfferField() {
		super();
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > TraderID() {
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
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(3) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(4) 
	public int InstallID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(4) 
	public CThostFtdcMDTraderOfferField InstallID(int InstallID) {
		this.io.setIntField(this, 4, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcTraderConnectStatusType
	 */
	@Field(6) 
	public byte TraderConnectStatus() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcTraderConnectStatusType
	 */
	@Field(6) 
	public CThostFtdcMDTraderOfferField TraderConnectStatus(byte TraderConnectStatus) {
		this.io.setByteField(this, 6, TraderConnectStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ConnectRequestDate() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > ConnectRequestTime() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\u03f4\u03b1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(9) 
	public Pointer<Byte > LastReportDate() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\u03f4\u03b1\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(10) 
	public Pointer<Byte > LastReportTime() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(11) 
	public Pointer<Byte > ConnectDate() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > ConnectTime() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > StartDate() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(14) 
	public Pointer<Byte > StartTime() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(16) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\u03ef\u03bb\ufffd\ufffd\ufffd\u027d\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(17) 
	public Pointer<Byte > MaxTradeID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\u03ef\u03bb\ufffd\ufffd\udb86\ude35\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcReturnCodeType
	 */
	@Array({7}) 
	@Field(18) 
	public Pointer<Byte > MaxOrderMessageReference() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBizTypeType
	 */
	@Field(19) 
	public byte BizType() {
		return this.io.getByteField(this, 19);
	}
	/**
	 * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBizTypeType
	 */
	@Field(19) 
	public CThostFtdcMDTraderOfferField BizType(byte BizType) {
		this.io.setByteField(this, 19, BizType);
		return this;
	}
	public CThostFtdcMDTraderOfferField(Pointer pointer) {
		super(pointer);
	}
}
