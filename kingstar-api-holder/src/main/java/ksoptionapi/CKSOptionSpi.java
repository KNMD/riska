package ksoptionapi;
import ksuserapistructex.CThostFtdcRspInfoField;
import ksvocapistruct.CKSAutoExecOrderActionField;
import ksvocapistruct.CKSCombActionField;
import ksvocapistruct.CKSCombActionVolumeField;
import ksvocapistruct.CKSExecOrderVolumeField;
import ksvocapistruct.CKSHistoryAssignmentField;
import ksvocapistruct.CKSHistoryOrderField;
import ksvocapistruct.CKSHistoryTradeField;
import ksvocapistruct.CKSIndexPriceField;
import ksvocapistruct.CKSInputCombActionField;
import ksvocapistruct.CKSInputQuoteUpdateField;
import ksvocapistruct.CKSInvestorPositionCombineDetailField;
import ksvocapistruct.CKSInvestorTradeLevelField;
import ksvocapistruct.CKSOptionInstrGuardField;
import ksvocapistruct.CKSPositionLimitVolField;
import ksvocapistruct.CKSPositionLimitVolSField;
import ksvocapistruct.CKSPositionLimitVolTField;
import ksvocapistruct.CKSPurchaseLimitAmtField;
import ksvocapistruct.CKSPurchaseLimitAmtSField;
import ksvocapistruct.CKSSODelivDetailField;
import ksvocapistruct.CKSStockOptionAssignmentField;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : KSOptionApi.h:20</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSOptionApi") 
public class CKSOptionSpi extends CPPObject {
	public CKSOptionSpi() {
		super();
	}
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\u05b8\ufffd\u05bb\ufffd\u05b8\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspQryIndexPrice(CKSIndexPriceField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:24</i>
	 */
	@Virtual(0) 
	public native void OnRspQryIndexPrice(Pointer<CKSIndexPriceField > pIndexPrice, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\u05b8\ufffd\u05bb\ufffd\u05b8\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspQryOptionInstrGuard(CKSOptionInstrGuardField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:27</i>
	 */
	@Virtual(1) 
	public native void OnRspQryOptionInstrGuard(Pointer<CKSOptionInstrGuardField > pOptionInstrGuard, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryExecOrderVolume(CKSExecOrderVolumeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:30</i>
	 */
	@Virtual(2) 
	public native void OnRspQryExecOrderVolume(Pointer<CKSExecOrderVolumeField > pExecOrderVolume, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\u05b8\ufffd\ufffd\ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryStockOptionAssignment(CKSStockOptionAssignmentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:33</i>
	 */
	@Virtual(3) 
	public native void OnRspQryStockOptionAssignment(Pointer<CKSStockOptionAssignmentField > pStockOptionAssignment, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\u037b\ufffd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryInvestorTradeLevel(CKSInvestorTradeLevelField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:36</i>
	 */
	@Virtual(4) 
	public native void OnRspQryInvestorTradeLevel(Pointer<CKSInvestorTradeLevelField > pInvestorTradeLevel, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd\ufffd\u07b9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryPurchaseLimitAmtT(CKSPurchaseLimitAmtField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:39</i>
	 */
	@Virtual(5) 
	public native void OnRspQryPurchaseLimitAmtT(Pointer<CKSPurchaseLimitAmtField > pPurchaseLimitAmt, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd\ufffd\u07b2\u05b6\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryPositionLimitVolT(CKSPositionLimitVolTField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:42</i>
	 */
	@Virtual(6) 
	public native void OnRspQryPositionLimitVolT(Pointer<CKSPositionLimitVolTField > pPositionLimitVol, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd\ufffd\u07b9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryPurchaseLimitAmtS(CKSPurchaseLimitAmtSField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:45</i>
	 */
	@Virtual(7) 
	public native void OnRspQryPurchaseLimitAmtS(Pointer<CKSPurchaseLimitAmtSField > pPurchaseLimitAmt, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd\ufffd\u07b2\u05b6\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryPositionLimitVolS(CKSPositionLimitVolSField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:48</i>
	 */
	@Virtual(8) 
	public native void OnRspQryPositionLimitVolS(Pointer<CKSPositionLimitVolSField > pPositionLimitVol, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u07b9\ufffd\ufffd\ufffd\u0231\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspPurchaseLimitAmtUpdate(CKSPurchaseLimitAmtField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:51</i>
	 */
	@Virtual(9) 
	public native void OnRspPurchaseLimitAmtUpdate(Pointer<CKSPurchaseLimitAmtField > pPurchaseLimitAmt, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u07b2\u05b6\ufffd\u0231\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspPositionLimitVolUpdate(CKSPositionLimitVolField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:54</i>
	 */
	@Virtual(10) 
	public native void OnRspPositionLimitVolUpdate(Pointer<CKSPositionLimitVolField > pPositionLimitVol, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryHistoryOrder(CKSHistoryOrderField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:57</i>
	 */
	@Virtual(11) 
	public native void OnRspQryHistoryOrder(Pointer<CKSHistoryOrderField > pOrder, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b7\ufffd\u027d\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryHistoryTrade(CKSHistoryTradeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:60</i>
	 */
	@Virtual(12) 
	public native void OnRspQryHistoryTrade(Pointer<CKSHistoryTradeField > pTrade, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b7\ufffd\ufffd\u0228\u05b8\ufffd\ufffd\ufffd\ufffd\u03f8\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryStockOptionHistoryAssignment(CKSHistoryAssignmentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:63</i>
	 */
	@Virtual(13) 
	public native void OnRspQryStockOptionHistoryAssignment(Pointer<CKSHistoryAssignmentField > pHistoryAssignment, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f8\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryStockOptionDelivDetail(CKSSODelivDetailField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:66</i>
	 */
	@Virtual(14) 
	public native void OnRspQryStockOptionDelivDetail(Pointer<CKSSODelivDetailField > pSODelivDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u0536\ufffd\ufffd\ufffd\u0228\u05b4\ufffd\u0432\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspAutoExecOrderAction(CKSAutoExecOrderActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:69</i>
	 */
	@Virtual(15) 
	public native void OnRspAutoExecOrderAction(Pointer<CKSAutoExecOrderActionField > pAutoExecOrderAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspCombActionInsert(CKSInputCombActionField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:72</i>
	 */
	@Virtual(16) 
	public native void OnRspCombActionInsert(Pointer<CKSInputCombActionField > pInputCombAction, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f3\u05b2\ufffd\ufffd\ufffd\u03f8\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspQryInvestorCombinePosition(CKSInvestorPositionCombineDetailField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:75</i>
	 */
	@Virtual(17) 
	public native void OnRspQryInvestorCombinePosition(Pointer<CKSInvestorPositionCombineDetailField > pInvestorPositionCombineDetail, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\u027f\ufffd\ufffd\ufffd\u03ff\u0272\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQryCombActionVolume(CKSCombActionVolumeField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:78</i>
	 */
	@Virtual(18) 
	public native void OnRspQryCombActionVolume(Pointer<CKSCombActionVolumeField > pCombActionVolume, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u0331\ufffd\ufffd\u06f5\ufffd\ufffd\u07b8\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspQuoteUpdate(CKSInputQuoteUpdateField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSOptionApi.h:81</i>
	 */
	@Virtual(19) 
	public native void OnRspQuoteUpdate(Pointer<CKSInputQuoteUpdateField > pInputQuoteUpdate, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f2\ufffd\ufffd\u03af\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>void OnRtnCombAction(CKSCombActionField*)</code><br>
	 * <i>native declaration : KSOptionApi.h:84</i>
	 */
	@Virtual(20) 
	public native void OnRtnCombAction(Pointer<CKSCombActionField > pCombAction);
	public CKSOptionSpi(Pointer pointer) {
		super(pointer);
	}
}
