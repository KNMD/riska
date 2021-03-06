package ksuserapistructex;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\u07f3\u05b2\ufffd<br>
 * <i>native declaration : KSUserApiStructEx.h:659</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSUserApiStructEx") 
public class CThostFtdcInvestorPositionField extends StructObject {
	public CThostFtdcInvestorPositionField() {
		super();
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({81}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({16}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u05b2\u05b6\ufffd\u0577\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(3) 
	public byte PosiDirection() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\u05b2\u05b6\ufffd\u0577\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(3) 
	public CThostFtdcInvestorPositionField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 3, PosiDirection);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4) 
	public CThostFtdcInvestorPositionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateType
	 */
	@Field(5) 
	public byte PositionDate() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateType
	 */
	@Field(5) 
	public CThostFtdcInvestorPositionField PositionDate(byte PositionDate) {
		this.io.setByteField(this, 5, PositionDate);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6) 
	public int YdPosition() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6) 
	public CThostFtdcInvestorPositionField YdPosition(int YdPosition) {
		this.io.setIntField(this, 6, YdPosition);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public int Position() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public CThostFtdcInvestorPositionField Position(int Position) {
		this.io.setIntField(this, 7, Position);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public int LongFrozen() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public CThostFtdcInvestorPositionField LongFrozen(int LongFrozen) {
		this.io.setIntField(this, 8, LongFrozen);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public int ShortFrozen() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public CThostFtdcInvestorPositionField ShortFrozen(int ShortFrozen) {
		this.io.setIntField(this, 9, ShortFrozen);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public double LongFrozenAmount() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public CThostFtdcInvestorPositionField LongFrozenAmount(double LongFrozenAmount) {
		this.io.setDoubleField(this, 10, LongFrozenAmount);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public double ShortFrozenAmount() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public CThostFtdcInvestorPositionField ShortFrozenAmount(double ShortFrozenAmount) {
		this.io.setDoubleField(this, 11, ShortFrozenAmount);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(12) 
	public int OpenVolume() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(12) 
	public CThostFtdcInvestorPositionField OpenVolume(int OpenVolume) {
		this.io.setIntField(this, 12, OpenVolume);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(13) 
	public int CloseVolume() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(13) 
	public CThostFtdcInvestorPositionField CloseVolume(int CloseVolume) {
		this.io.setIntField(this, 13, CloseVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public double OpenAmount() {
		return this.io.getDoubleField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14) 
	public CThostFtdcInvestorPositionField OpenAmount(double OpenAmount) {
		this.io.setDoubleField(this, 14, OpenAmount);
		return this;
	}
	/**
	 * \u01bd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15) 
	public double CloseAmount() {
		return this.io.getDoubleField(this, 15);
	}
	/**
	 * \u01bd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15) 
	public CThostFtdcInvestorPositionField CloseAmount(double CloseAmount) {
		this.io.setDoubleField(this, 15, CloseAmount);
		return this;
	}
	/**
	 * \ufffd\u05b2\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16) 
	public double PositionCost() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \ufffd\u05b2\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16) 
	public CThostFtdcInvestorPositionField PositionCost(double PositionCost) {
		this.io.setDoubleField(this, 16, PositionCost);
		return this;
	}
	/**
	 * \ufffd\u03f4\ufffd\u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17) 
	public double PreMargin() {
		return this.io.getDoubleField(this, 17);
	}
	/**
	 * \ufffd\u03f4\ufffd\u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17) 
	public CThostFtdcInvestorPositionField PreMargin(double PreMargin) {
		this.io.setDoubleField(this, 17, PreMargin);
		return this;
	}
	/**
	 * \u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18) 
	public double UseMargin() {
		return this.io.getDoubleField(this, 18);
	}
	/**
	 * \u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18) 
	public CThostFtdcInvestorPositionField UseMargin(double UseMargin) {
		this.io.setDoubleField(this, 18, UseMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19) 
	public double FrozenMargin() {
		return this.io.getDoubleField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19) 
	public CThostFtdcInvestorPositionField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 19, FrozenMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20) 
	public double FrozenCash() {
		return this.io.getDoubleField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20) 
	public CThostFtdcInvestorPositionField FrozenCash(double FrozenCash) {
		this.io.setDoubleField(this, 20, FrozenCash);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21) 
	public double FrozenCommission() {
		return this.io.getDoubleField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21) 
	public CThostFtdcInvestorPositionField FrozenCommission(double FrozenCommission) {
		this.io.setDoubleField(this, 21, FrozenCommission);
		return this;
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22) 
	public double CashIn() {
		return this.io.getDoubleField(this, 22);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22) 
	public CThostFtdcInvestorPositionField CashIn(double CashIn) {
		this.io.setDoubleField(this, 22, CashIn);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(23) 
	public double Commission() {
		return this.io.getDoubleField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(23) 
	public CThostFtdcInvestorPositionField Commission(double Commission) {
		this.io.setDoubleField(this, 23, Commission);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(24) 
	public double CloseProfit() {
		return this.io.getDoubleField(this, 24);
	}
	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(24) 
	public CThostFtdcInvestorPositionField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 24, CloseProfit);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25) 
	public double PositionProfit() {
		return this.io.getDoubleField(this, 25);
	}
	/**
	 * \ufffd\u05b2\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25) 
	public CThostFtdcInvestorPositionField PositionProfit(double PositionProfit) {
		this.io.setDoubleField(this, 25, PositionProfit);
		return this;
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(26) 
	public double PreSettlementPrice() {
		return this.io.getDoubleField(this, 26);
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(26) 
	public CThostFtdcInvestorPositionField PreSettlementPrice(double PreSettlementPrice) {
		this.io.setDoubleField(this, 26, PreSettlementPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27) 
	public double SettlementPrice() {
		return this.io.getDoubleField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27) 
	public CThostFtdcInvestorPositionField SettlementPrice(double SettlementPrice) {
		this.io.setDoubleField(this, 27, SettlementPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(28) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(29) 
	public int SettlementID() {
		return this.io.getIntField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(29) 
	public CThostFtdcInvestorPositionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 29, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(30) 
	public double OpenCost() {
		return this.io.getDoubleField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(30) 
	public CThostFtdcInvestorPositionField OpenCost(double OpenCost) {
		this.io.setDoubleField(this, 30, OpenCost);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(31) 
	public double ExchangeMargin() {
		return this.io.getDoubleField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(31) 
	public CThostFtdcInvestorPositionField ExchangeMargin(double ExchangeMargin) {
		this.io.setDoubleField(this, 31, ExchangeMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f3\u027d\ufffd\ufffd\u03b3\u0275\u0133\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32) 
	public int CombPosition() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * \ufffd\ufffd\u03f3\u027d\ufffd\ufffd\u03b3\u0275\u0133\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32) 
	public CThostFtdcInvestorPositionField CombPosition(int CombPosition) {
		this.io.setIntField(this, 32, CombPosition);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f6\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(33) 
	public int CombLongFrozen() {
		return this.io.getIntField(this, 33);
	}
	/**
	 * \ufffd\ufffd\u03f6\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(33) 
	public CThostFtdcInvestorPositionField CombLongFrozen(int CombLongFrozen) {
		this.io.setIntField(this, 33, CombLongFrozen);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03ff\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(34) 
	public int CombShortFrozen() {
		return this.io.getIntField(this, 34);
	}
	/**
	 * \ufffd\ufffd\u03ff\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(34) 
	public CThostFtdcInvestorPositionField CombShortFrozen(int CombShortFrozen) {
		this.io.setIntField(this, 34, CombShortFrozen);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0576\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(35) 
	public double CloseProfitByDate() {
		return this.io.getDoubleField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0576\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(35) 
	public CThostFtdcInvestorPositionField CloseProfitByDate(double CloseProfitByDate) {
		this.io.setDoubleField(this, 35, CloseProfitByDate);
		return this;
	}
	/**
	 * \ufffd\ufffd\u02b6\u0533\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(36) 
	public double CloseProfitByTrade() {
		return this.io.getDoubleField(this, 36);
	}
	/**
	 * \ufffd\ufffd\u02b6\u0533\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(36) 
	public CThostFtdcInvestorPositionField CloseProfitByTrade(double CloseProfitByTrade) {
		this.io.setDoubleField(this, 36, CloseProfitByTrade);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(37) 
	public int TodayPosition() {
		return this.io.getIntField(this, 37);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(37) 
	public CThostFtdcInvestorPositionField TodayPosition(int TodayPosition) {
		this.io.setIntField(this, 37, TodayPosition);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(38) 
	public double MarginRateByMoney() {
		return this.io.getDoubleField(this, 38);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(38) 
	public CThostFtdcInvestorPositionField MarginRateByMoney(double MarginRateByMoney) {
		this.io.setDoubleField(this, 38, MarginRateByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(39) 
	public double MarginRateByVolume() {
		return this.io.getDoubleField(this, 39);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(39) 
	public CThostFtdcInvestorPositionField MarginRateByVolume(double MarginRateByVolume) {
		this.io.setDoubleField(this, 39, MarginRateByVolume);
		return this;
	}
	/**
	 * \u05b4\ufffd\u0436\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(40) 
	public int StrikeFrozen() {
		return this.io.getIntField(this, 40);
	}
	/**
	 * \u05b4\ufffd\u0436\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(40) 
	public CThostFtdcInvestorPositionField StrikeFrozen(int StrikeFrozen) {
		this.io.setIntField(this, 40, StrikeFrozen);
		return this;
	}
	/**
	 * \u05b4\ufffd\u0436\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(41) 
	public double StrikeFrozenAmount() {
		return this.io.getDoubleField(this, 41);
	}
	/**
	 * \u05b4\ufffd\u0436\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(41) 
	public CThostFtdcInvestorPositionField StrikeFrozenAmount(double StrikeFrozenAmount) {
		this.io.setDoubleField(this, 41, StrikeFrozenAmount);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05b4\ufffd\u0436\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(42) 
	public int AbandonFrozen() {
		return this.io.getIntField(this, 42);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05b4\ufffd\u0436\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(42) 
	public CThostFtdcInvestorPositionField AbandonFrozen(int AbandonFrozen) {
		this.io.setIntField(this, 42, AbandonFrozen);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(43) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 43);
	}
	public CThostFtdcInvestorPositionField(Pointer pointer) {
		super(pointer);
	}
}
