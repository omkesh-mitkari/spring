
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for EMVRqData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMVRqData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AppID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Trk2EquivData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AppPAN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AppPANSeq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CryptoInfoData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AuthRqCrypto" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssAppData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AppICProf" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AppTrnCounter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AuthAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SecAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TerminalCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TerminalVrfyRslt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TrnDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EMVTrnType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}UnpredictNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TerminalCaps" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CVMRslts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TrnStatInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AppVersionNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMVRqData_Type", propOrder = {
    "appID",
    "trk2EquivData",
    "appPAN",
    "appPANSeq",
    "cryptoInfoData",
    "authRqCrypto",
    "issAppData",
    "appICProf",
    "appTrnCounter",
    "authAmt",
    "secAmt",
    "terminalCountryCode",
    "terminalVrfyRslt",
    "curCode",
    "trnDt",
    "emvTrnType",
    "unpredictNum",
    "terminalCaps",
    "cvmRslts",
    "trnStatInfo",
    "appVersionNum"
})
public class EMVRqDataType {

    @XmlElement(name = "AppID", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appID;
    @XmlElement(name = "Trk2EquivData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] trk2EquivData;
    @XmlElement(name = "AppPAN", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPAN;
    @XmlElement(name = "AppPANSeq", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPANSeq;
    @XmlElement(name = "CryptoInfoData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cryptoInfoData;
    @XmlElement(name = "AuthRqCrypto", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] authRqCrypto;
    @XmlElement(name = "IssAppData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] issAppData;
    @XmlElement(name = "AppICProf", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appICProf;
    @XmlElement(name = "AppTrnCounter", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appTrnCounter;
    @XmlElement(name = "AuthAmt")
    protected CurrencyAmount authAmt;
    @XmlElement(name = "SecAmt")
    protected CurrencyAmount secAmt;
    @XmlElement(name = "TerminalCountryCode")
    protected String terminalCountryCode;
    @XmlElement(name = "TerminalVrfyRslt", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] terminalVrfyRslt;
    @XmlElement(name = "CurCode")
    protected String curCode;
    @XmlElement(name = "TrnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnDt;
    @XmlElement(name = "EMVTrnType")
    protected String emvTrnType;
    @XmlElement(name = "UnpredictNum", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] unpredictNum;
    @XmlElement(name = "TerminalCaps", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] terminalCaps;
    @XmlElement(name = "CVMRslts", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cvmRslts;
    @XmlElement(name = "TrnStatInfo", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] trnStatInfo;
    @XmlElement(name = "AppVersionNum", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appVersionNum;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(byte[] value) {
        this.appID = value;
    }

    /**
     * Gets the value of the trk2EquivData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTrk2EquivData() {
        return trk2EquivData;
    }

    /**
     * Sets the value of the trk2EquivData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrk2EquivData(byte[] value) {
        this.trk2EquivData = value;
    }

    /**
     * Gets the value of the appPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppPAN() {
        return appPAN;
    }

    /**
     * Sets the value of the appPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPAN(byte[] value) {
        this.appPAN = value;
    }

    /**
     * Gets the value of the appPANSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppPANSeq() {
        return appPANSeq;
    }

    /**
     * Sets the value of the appPANSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPANSeq(byte[] value) {
        this.appPANSeq = value;
    }

    /**
     * Gets the value of the cryptoInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCryptoInfoData() {
        return cryptoInfoData;
    }

    /**
     * Sets the value of the cryptoInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptoInfoData(byte[] value) {
        this.cryptoInfoData = value;
    }

    /**
     * Gets the value of the authRqCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAuthRqCrypto() {
        return authRqCrypto;
    }

    /**
     * Sets the value of the authRqCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRqCrypto(byte[] value) {
        this.authRqCrypto = value;
    }

    /**
     * Gets the value of the issAppData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIssAppData() {
        return issAppData;
    }

    /**
     * Sets the value of the issAppData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssAppData(byte[] value) {
        this.issAppData = value;
    }

    /**
     * Gets the value of the appICProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppICProf() {
        return appICProf;
    }

    /**
     * Sets the value of the appICProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppICProf(byte[] value) {
        this.appICProf = value;
    }

    /**
     * Gets the value of the appTrnCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppTrnCounter() {
        return appTrnCounter;
    }

    /**
     * Sets the value of the appTrnCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTrnCounter(byte[] value) {
        this.appTrnCounter = value;
    }

    /**
     * Gets the value of the authAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getAuthAmt() {
        return authAmt;
    }

    /**
     * Sets the value of the authAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setAuthAmt(CurrencyAmount value) {
        this.authAmt = value;
    }

    /**
     * Gets the value of the secAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getSecAmt() {
        return secAmt;
    }

    /**
     * Sets the value of the secAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setSecAmt(CurrencyAmount value) {
        this.secAmt = value;
    }

    /**
     * Gets the value of the terminalCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCountryCode() {
        return terminalCountryCode;
    }

    /**
     * Sets the value of the terminalCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCountryCode(String value) {
        this.terminalCountryCode = value;
    }

    /**
     * Gets the value of the terminalVrfyRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTerminalVrfyRslt() {
        return terminalVrfyRslt;
    }

    /**
     * Sets the value of the terminalVrfyRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalVrfyRslt(byte[] value) {
        this.terminalVrfyRslt = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the trnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnDt() {
        return trnDt;
    }

    /**
     * Sets the value of the trnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnDt(XMLGregorianCalendar value) {
        this.trnDt = value;
    }

    /**
     * Gets the value of the emvTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMVTrnType() {
        return emvTrnType;
    }

    /**
     * Sets the value of the emvTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMVTrnType(String value) {
        this.emvTrnType = value;
    }

    /**
     * Gets the value of the unpredictNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUnpredictNum() {
        return unpredictNum;
    }

    /**
     * Sets the value of the unpredictNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnpredictNum(byte[] value) {
        this.unpredictNum = value;
    }

    /**
     * Gets the value of the terminalCaps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTerminalCaps() {
        return terminalCaps;
    }

    /**
     * Sets the value of the terminalCaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCaps(byte[] value) {
        this.terminalCaps = value;
    }

    /**
     * Gets the value of the cvmRslts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCVMRslts() {
        return cvmRslts;
    }

    /**
     * Sets the value of the cvmRslts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVMRslts(byte[] value) {
        this.cvmRslts = value;
    }

    /**
     * Gets the value of the trnStatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTrnStatInfo() {
        return trnStatInfo;
    }

    /**
     * Sets the value of the trnStatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnStatInfo(byte[] value) {
        this.trnStatInfo = value;
    }

    /**
     * Gets the value of the appVersionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppVersionNum() {
        return appVersionNum;
    }

    /**
     * Sets the value of the appVersionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVersionNum(byte[] value) {
        this.appVersionNum = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
