package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u03f5\ufffd\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:5606</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcLinkManField extends StructObject {
	public CThostFtdcLinkManField() {
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
	 * \ufffd\ufffd\u03f5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPersonTypeType
	 */
	@Field(2) 
	public byte PersonType() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u03f5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPersonTypeType
	 */
	@Field(2) 
	public CThostFtdcLinkManField PersonType(byte PersonType) {
		this.io.setByteField(this, 2, PersonType);
		return this;
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(3) 
	public byte IdentifiedCardType() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(3) 
	public CThostFtdcLinkManField IdentifiedCardType(byte IdentifiedCardType) {
		this.io.setByteField(this, 3, IdentifiedCardType);
		return this;
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(4) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPartyNameType
	 */
	@Array({81}) 
	@Field(5) 
	public Pointer<Byte > PersonName() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u03f5\ufffd\u7ef0<br>
	 * C type : TThostFtdcTelephoneType
	 */
	@Array({41}) 
	@Field(6) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u0368\u0476\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcAddressType
	 */
	@Array({101}) 
	@Field(7) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcZipCodeType
	 */
	@Array({7}) 
	@Field(8) 
	public Pointer<Byte > ZipCode() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\u023c\ufffd<br>
	 * C type : TThostFtdcPriorityType
	 */
	@Field(9) 
	public int Priority() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\u023c\ufffd<br>
	 * C type : TThostFtdcPriorityType
	 */
	@Field(9) 
	public CThostFtdcLinkManField Priority(int Priority) {
		this.io.setIntField(this, 9, Priority);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUOAZipCodeType
	 */
	@Array({11}) 
	@Field(10) 
	public Pointer<Byte > UOAZipCode() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u022b\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorFullNameType
	 */
	@Array({101}) 
	@Field(11) 
	public Pointer<Byte > PersonFullName() {
		return this.io.getPointerField(this, 11);
	}
	public CThostFtdcLinkManField(Pointer pointer) {
		super(pointer);
	}
}
