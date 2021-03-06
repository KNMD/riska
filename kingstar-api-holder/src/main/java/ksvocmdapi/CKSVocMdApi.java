package ksvocmdapi;
import ksvocapistruct.CKSSpecificInstrumentField;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : KSVocMdApi.h:31</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("KSVocMdApi") 
public class CKSVocMdApi extends CPPObject {
	public CKSVocMdApi() {
		super();
	}
	/**
	 * @remark<br>
	 * Original signature : <code>int SubscribeKSMarketData(CKSSpecificInstrumentField*[], int)</code><br>
	 * <i>native declaration : KSVocMdApi.h:38</i>
	 */
	@Virtual(0) 
	public native int SubscribeKSMarketData(Pointer<Pointer<CKSSpecificInstrumentField > > ppInstrumentID, int nCount);
	/**
	 * @remark<br>
	 * Original signature : <code>int UnSubscribeKSMarketData(CKSSpecificInstrumentField*[], int)</code><br>
	 * <i>native declaration : KSVocMdApi.h:44</i>
	 */
	@Virtual(1) 
	public native int UnSubscribeKSMarketData(Pointer<Pointer<CKSSpecificInstrumentField > > ppInstrumentID, int nCount);
	public CKSVocMdApi(Pointer pointer) {
		super(pointer);
	}
}
