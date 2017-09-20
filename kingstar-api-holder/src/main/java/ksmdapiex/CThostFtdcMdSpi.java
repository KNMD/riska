package ksmdapiex;
import ksuserapistructex.CThostFtdcDepthMarketDataField;
import ksuserapistructex.CThostFtdcForQuoteRspField;
import ksuserapistructex.CThostFtdcRspInfoField;
import ksuserapistructex.CThostFtdcRspUserLoginField;
import ksuserapistructex.CThostFtdcSpecificInstrumentField;
import ksuserapistructex.CThostFtdcUserLogoutField;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : KSMdApiEx.h:19</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("libksmarketdataapi")
public class CThostFtdcMdSpi extends CPPObject {
	public CThostFtdcMdSpi() {
		super();
	}
	/**
	 * \ufffd\ufffd\ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ubf7b\ufffd\u05fa\ufffd\u0328\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\u03b4\ufffd\ufffd\u00bc\u01f0\ufffd\ufffd\ufffd\ufffd\ufffd\u00f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00e1\ufffd<br>
	 * Original signature : <code>void OnFrontConnected()</code><br>
	 * <i>native declaration : KSMdApiEx.h:23</i>
	 */
	@Virtual(0) 
	public native void OnFrontConnected();
	/**
	 * 0x2003 \ufffd\u0575\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>void OnFrontDisconnected(int)</code><br>
	 * <i>native declaration : KSMdApiEx.h:32</i>
	 */
	@Virtual(1) 
	public native void OnFrontDisconnected(int nReason);
	/**
	 * @param nTimeLapse \ufffd\ufffd\ufffd\ufffd\ufffd\u03f4\u03bd\ufffd\ufffd\u0571\ufffd\ufffd\u0135\ufffd\u02b1\ufffd\ufffd<br>
	 * Original signature : <code>void OnHeartBeatWarning(int)</code><br>
	 * <i>native declaration : KSMdApiEx.h:36</i>
	 */
	@Virtual(2) 
	public native void OnHeartBeatWarning(int nTimeLapse);
	/**
	 * \ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:40</i>
	 */
	@Virtual(3) 
	public native void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u01f3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:43</i>
	 */
	@Virtual(4) 
	public native void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:46</i>
	 */
	@Virtual(5) 
	public native void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:49</i>
	 */
	@Virtual(6) 
	public native void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u0221\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:52</i>
	 */
	@Virtual(7) 
	public native void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:55</i>
	 */
	@Virtual(8) 
	public native void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u0221\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : KSMdApiEx.h:58</i>
	 */
	@Virtual(9) 
	public native void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code><br>
	 * <i>native declaration : KSMdApiEx.h:61</i>
	 */
	@Virtual(10) 
	public native void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData);
	/**
	 * \u046f\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField*)</code><br>
	 * <i>native declaration : KSMdApiEx.h:64</i>
	 */
	@Virtual(11) 
	public native void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField > pForQuoteRsp);
	public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
}