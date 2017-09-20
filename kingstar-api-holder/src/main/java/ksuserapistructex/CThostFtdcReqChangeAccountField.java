package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:6864</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcReqChangeAccountField extends StructObject {
	public CThostFtdcReqChangeAccountField() {
		super();
	}
	/**
	 * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0434\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0437\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0334\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0337\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public CThostFtdcReqChangeAccountField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public CThostFtdcReqChangeAccountField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public CThostFtdcReqChangeAccountField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({51}) 
	@Field(12) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public byte IdCardType() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public CThostFtdcReqChangeAccountField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(14) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\u0531\ufffd<br>
	 * C type : TThostFtdcGenderType
	 */
	@Field(15) 
	public byte Gender() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\u0531\ufffd<br>
	 * C type : TThostFtdcGenderType
	 */
	@Field(15) 
	public CThostFtdcReqChangeAccountField Gender(byte Gender) {
		this.io.setByteField(this, 15, Gender);
		return this;
	}
	/**
	 * \ufffd\ufffd\u04b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCountryCodeType
	 */
	@Array({21}) 
	@Field(16) 
	public Pointer<Byte > CountryCode() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(17) 
	public byte CustType() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(17) 
	public CThostFtdcReqChangeAccountField CustType(byte CustType) {
		this.io.setByteField(this, 17, CustType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcAddressType
	 */
	@Array({101}) 
	@Field(18) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\u02b1\ufffd<br>
	 * C type : TThostFtdcZipCodeType
	 */
	@Array({7}) 
	@Field(19) 
	public Pointer<Byte > ZipCode() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\u7ef0\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTelephoneType
	 */
	@Array({41}) 
	@Field(20) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \ufffd\u05bb\ufffd<br>
	 * C type : TThostFtdcMobilePhoneType
	 */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > MobilePhone() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFaxType
	 */
	@Array({41}) 
	@Field(22) 
	public Pointer<Byte > Fax() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bc\ufffd<br>
	 * C type : TThostFtdcEMailType
	 */
	@Array({41}) 
	@Field(23) 
	public Pointer<Byte > EMail() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcMoneyAccountStatusType
	 */
	@Field(24) 
	public byte MoneyAccountStatus() {
		return this.io.getByteField(this, 24);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcMoneyAccountStatusType
	 */
	@Field(24) 
	public CThostFtdcReqChangeAccountField MoneyAccountStatus(byte MoneyAccountStatus) {
		this.io.setByteField(this, 24, MoneyAccountStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(25) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(26) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(27) 
	public Pointer<Byte > NewBankAccount() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(28) 
	public Pointer<Byte > NewBankPassWord() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({16}) 
	@Field(29) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(30) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(31) 
	public byte BankAccType() {
		return this.io.getByteField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(31) 
	public CThostFtdcReqChangeAccountField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 31, BankAccType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(32) 
	public int InstallID() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(32) 
	public CThostFtdcReqChangeAccountField InstallID(int InstallID) {
		this.io.setIntField(this, 32, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\u037b\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(33) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 33);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\u037b\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(33) 
	public CThostFtdcReqChangeAccountField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 33, VerifyCertNoFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(34) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\u0431\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(35) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(36) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 36);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(36) 
	public CThostFtdcReqChangeAccountField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 36, BankPwdFlag);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u02f6\u0531\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(37) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 37);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u02f6\u0531\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(37) 
	public CThostFtdcReqChangeAccountField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 37, SecuPwdFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(38) 
	public int TID() {
		return this.io.getIntField(this, 38);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(38) 
	public CThostFtdcReqChangeAccountField TID(int TID) {
		this.io.setIntField(this, 38, TID);
		return this;
	}
	/**
	 * \u056a\u04aa<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({36}) 
	@Field(39) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 39);
	}
	public CThostFtdcReqChangeAccountField(Pointer pointer) {
		super(pointer);
	}
}
