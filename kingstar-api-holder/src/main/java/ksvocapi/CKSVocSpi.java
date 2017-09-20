package ksvocapi;
import ksuserapistructex.CThostFtdcInvestorPositionCombineDetailField;
import ksuserapistructex.CThostFtdcInvestorPositionDetailField;
import ksuserapistructex.CThostFtdcRspInfoField;
import ksvocapistruct.CKSCloseStrategyResultField;
import ksvocapistruct.CKSCombStrategyResultField;
import ksvocapistruct.CKSInputFundOutCreditApplyField;
import ksvocapistruct.CKSInstrumentMarginRateField;
import ksvocapistruct.CKSLargeFundOutApplyField;
import ksvocapistruct.CKSMaxCombActionVolumeField;
import ksvocapistruct.CKSOptionCombStrategyResultField;
import ksvocapistruct.CKSOptionInstrCommRateField;
import ksvocapistruct.CKSOptionMarginField;
import ksvocapistruct.CKSRspLargeFundOutApplyField;
import ksvocapistruct.CKSRspQryFundOutCreditApplyField;
import ksvocapistruct.CKSRspQryFundOutCreditField;
import ksvocapistruct.CKSTradingNoticeField;
import ksvocapistruct.CKSTradingParamsField;
import ksvocapistruct.CKSTransferInfoResultField;
import ksvocapistruct.CKSUserProductUrlField;
import ksvocapistruct.CThostFtdcBulkCancelOrderField;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : KSVocApi.h:20</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocApi") 
public class CKSVocSpi extends CPPObject {
	public CKSVocSpi() {
		super();
	}
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u01f0\ufffd\u0133\u05b2\ufffd\ufffd\ufffd\u03f8\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspQryInvestorOpenPosition(CThostFtdcInvestorPositionDetailField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:24</i>
	 */
	@Virtual(0) 
	public native void OnRspQryInvestorOpenPosition(Pointer<CThostFtdcInvestorPositionDetailField > pInvestorPositionDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u01f0\ufffd\ufffd\ufffd\ufffd\u03f3\u05b2\ufffd\ufffd\ufffd\u03f8\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspQryInvestorOpenCombinePosition(CThostFtdcInvestorPositionCombineDetailField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:27</i>
	 */
	@Virtual(1) 
	public native void OnRspQryInvestorOpenCombinePosition(Pointer<CThostFtdcInvestorPositionCombineDetailField > pInvestorPositionCombineDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspBulkCancelOrder(CThostFtdcBulkCancelOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:30</i>
	 */
	@Virtual(2) 
	public native void OnRspBulkCancelOrder(Pointer<CThostFtdcBulkCancelOrderField > pBulkCancelOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u01bd\ufffd\u05b2\ufffd\ufffd\u0532\ufffd\u046f\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryCloseStrategy(CKSCloseStrategyResultField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:33</i>
	 */
	@Virtual(3) 
	public native void OnRspQryCloseStrategy(Pointer<CKSCloseStrategyResultField > pCloseStrategy, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u03f2\ufffd\ufffd\u0532\ufffd\u046f\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryCombStrategy(CKSCombStrategyResultField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:36</i>
	 */
	@Virtual(4) 
	public native void OnRspQryCombStrategy(Pointer<CKSCombStrategyResultField > pCombStrategy, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u03f2\ufffd\ufffd\u0532\ufffd\u046f\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryOptionCombStrategy(CKSOptionCombStrategyResultField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:39</i>
	 */
	@Virtual(5) 
	public native void OnRspQryOptionCombStrategy(Pointer<CKSOptionCombStrategyResultField > pOptionCombStrategy, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u037b\ufffd\u05ea\ufffd\ufffd\ufffd\ufffd\u03e2\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryTransferInfo(CKSTransferInfoResultField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:42</i>
	 */
	@Virtual(6) 
	public native void OnRspQryTransferInfo(Pointer<CKSTransferInfoResultField > pResultField, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u0368\u05aa\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryKSTradingNotice(CKSTradingNoticeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:45</i>
	 */
	@Virtual(7) 
	public native void OnRspQryKSTradingNotice(Pointer<CKSTradingNoticeField > pTradingNotice, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u0534\ufffd\ufffd\u046f\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspQryUserProductUrl(CKSUserProductUrlField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:48</i>
	 */
	@Virtual(8) 
	public native void OnRspQryUserProductUrl(Pointer<CKSUserProductUrlField > pUserProductUrl, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u03f2\ufffd\u05b5\ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryMaxCombActionVolume(CKSMaxCombActionVolumeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:51</i>
	 */
	@Virtual(9) 
	public native void OnRspQryMaxCombActionVolume(Pointer<CKSMaxCombActionVolumeField > pMaxCombActionVolume, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>void OnRtnKSTradingNotice(CKSTradingNoticeField*)</code><br>
	 * <i>native declaration : KSVocApi.h:54</i>
	 */
	@Virtual(10) 
	public native void OnRtnKSTradingNotice(Pointer<CKSTradingNoticeField > pTradingNoticeInfo);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryKSOptionInstrCommRate(CKSOptionInstrCommRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:57</i>
	 */
	@Virtual(11) 
	public native void OnRspQryKSOptionInstrCommRate(Pointer<CKSOptionInstrCommRateField > pOptionInstrCommRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryKSInstrumentMarginRate(CKSInstrumentMarginRateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:60</i>
	 */
	@Virtual(12) 
	public native void OnRspQryKSInstrumentMarginRate(Pointer<CKSInstrumentMarginRateField > pInstrumentMarginRate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u037b\ufffd\u00ff\ufffd\u0573\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspFundOutCreditApply(CKSInputFundOutCreditApplyField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:63</i>
	 */
	@Virtual(13) 
	public native void OnRspFundOutCreditApply(Pointer<CKSInputFundOutCreditApplyField > pFundOutCreditApply, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u037b\ufffd\u00ff\ufffd\u0573\ufffd\ufffd\ufffd\ufffd\u0232\ufffd\u046f\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryFundOutCredit(CKSRspQryFundOutCreditField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:66</i>
	 */
	@Virtual(14) 
	public native void OnRspQryFundOutCredit(Pointer<CKSRspQryFundOutCreditField > pRspQryFundOutCredit, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u037b\ufffd\u00ff\ufffd\u0573\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryFundOutCreditApply(CKSRspQryFundOutCreditApplyField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:69</i>
	 */
	@Virtual(15) 
	public native void OnRspQryFundOutCreditApply(Pointer<CKSRspQryFundOutCreditApplyField > pRspQryFundOutCreditApply, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0524\u053c\ufffd\ufffd\u0221\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspLargeFundOutApply(CKSLargeFundOutApplyField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:72</i>
	 */
	@Virtual(16) 
	public native void OnRspLargeFundOutApply(Pointer<CKSLargeFundOutApplyField > pLargeFundOutApply, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0524\u053c\ufffd\ufffd\u046f\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryLargeFundOutApply(CKSRspLargeFundOutApplyField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:75</i>
	 */
	@Virtual(17) 
	public native void OnRspQryLargeFundOutApply(Pointer<CKSRspLargeFundOutApplyField > pRspLargeFundOutApply, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u0275\ufffd\ufffd\u0171\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryKSOptionMargin(CKSOptionMarginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:78</i>
	 */
	@Virtual(18) 
	public native void OnRspQryKSOptionMargin(Pointer<CKSOptionMarginField > pOptionMargin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046fKS\ufffd\ufffd\ufffd\u05f2\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryKSTradingParams(CKSTradingParamsField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSVocApi.h:81</i>
	 */
	@Virtual(19) 
	public native void OnRspQryKSTradingParams(Pointer<CKSTradingParamsField > pTradingParams, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	public CKSVocSpi(Pointer pointer) {
		super(pointer);
	}
}
