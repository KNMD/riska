package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\u3de8\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:5500</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcBrokerWithdrawAlgorithmField extends StructObject {
	public CThostFtdcBrokerWithdrawAlgorithmField() {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(1) 
	public byte WithdrawAlgorithm() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(1) 
	public CThostFtdcBrokerWithdrawAlgorithmField WithdrawAlgorithm(byte WithdrawAlgorithm) {
		this.io.setByteField(this, 1, WithdrawAlgorithm);
		return this;
	}
	/**
	 * \ufffd\u02bd\ufffd\u02b9\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(2) 
	public double UsingRatio() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \ufffd\u02bd\ufffd\u02b9\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(2) 
	public CThostFtdcBrokerWithdrawAlgorithmField UsingRatio(double UsingRatio) {
		this.io.setDoubleField(this, 2, UsingRatio);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(3) 
	public byte IncludeCloseProfit() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(3) 
	public CThostFtdcBrokerWithdrawAlgorithmField IncludeCloseProfit(byte IncludeCloseProfit) {
		this.io.setByteField(this, 3, IncludeCloseProfit);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u07b2\ufffd\ufffd\ufffd\ufffd\u07b3\u027d\ufffd\ufffd\u037b\ufffd\ufffd\u01f7\ufffd\ufffd\u073f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcAllWithoutTradeType
	 */
	@Field(4) 
	public byte AllWithoutTrade() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u07b2\ufffd\ufffd\ufffd\ufffd\u07b3\u027d\ufffd\ufffd\u037b\ufffd\ufffd\u01f7\ufffd\ufffd\u073f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcAllWithoutTradeType
	 */
	@Field(4) 
	public CThostFtdcBrokerWithdrawAlgorithmField AllWithoutTrade(byte AllWithoutTrade) {
		this.io.setByteField(this, 4, AllWithoutTrade);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(5) 
	public byte AvailIncludeCloseProfit() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(5) 
	public CThostFtdcBrokerWithdrawAlgorithmField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
		this.io.setByteField(this, 5, AvailIncludeCloseProfit);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd\ufffd\u00bc\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public int IsBrokerUserEvent() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd\ufffd\u00bc\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public CThostFtdcBrokerWithdrawAlgorithmField IsBrokerUserEvent(int IsBrokerUserEvent) {
		this.io.setIntField(this, 6, IsBrokerUserEvent);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(7) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u047a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double FundMortgageRatio() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u047a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CThostFtdcBrokerWithdrawAlgorithmField FundMortgageRatio(double FundMortgageRatio) {
		this.io.setDoubleField(this, 8, FundMortgageRatio);
		return this;
	}
	/**
	 * \u0228\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcBalanceAlgorithmType
	 */
	@Field(9) 
	public byte BalanceAlgorithm() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u0228\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcBalanceAlgorithmType
	 */
	@Field(9) 
	public CThostFtdcBrokerWithdrawAlgorithmField BalanceAlgorithm(byte BalanceAlgorithm) {
		this.io.setByteField(this, 9, BalanceAlgorithm);
		return this;
	}
	public CThostFtdcBrokerWithdrawAlgorithmField(Pointer pointer) {
		super(pointer);
	}
}
