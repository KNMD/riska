package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd\ufffd\u07b9\ufffd\ufffd\ufffd\ufffd/\ufffd\ufffd\ufffd\ufffd\ufffd\u07b9\ufffd\ufffd\ufffd\u0231\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:1053</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSPurchaseLimitAmtField extends StructObject {
	public CKSPurchaseLimitAmtField() {
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
	 * \ufffd\u07b9\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double PurLimitAmt() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\u07b9\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CKSPurchaseLimitAmtField PurLimitAmt(double PurLimitAmt) {
		this.io.setDoubleField(this, 3, PurLimitAmt);
		return this;
	}
	public CKSPurchaseLimitAmtField(Pointer pointer) {
		super(pointer);
	}
}