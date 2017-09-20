package ksvocapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\u027e\ufffd\ufffd<br>
 * <i>native declaration : KSVocApiStruct.h:313</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApiStruct") 
public class CKSProfitAndLossOrderRemoveField extends StructObject {
	public CKSProfitAndLossOrderRemoveField() {
		super();
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
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
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSProfitAndLossOrderIDType
	 */
	@Field(2) 
	public int ProfitAndLossOrderID() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \u05b9\ufffd\ufffd\u05b9\u04ef\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TKSProfitAndLossOrderIDType
	 */
	@Field(2) 
	public CKSProfitAndLossOrderRemoveField ProfitAndLossOrderID(int ProfitAndLossOrderID) {
		this.io.setIntField(this, 2, ProfitAndLossOrderID);
		return this;
	}
	public CKSProfitAndLossOrderRemoveField(Pointer pointer) {
		super(pointer);
	}
}
