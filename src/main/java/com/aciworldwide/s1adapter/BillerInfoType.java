
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BillerInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Name"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerContact" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IndustId" minOccurs="0"/&gt;
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SecretPrompt"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CryptType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}HistRetentionDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CSPCustInfoReq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerPayInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LogoURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Logo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerEnrollURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerAcctIdInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DiscReqd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DiscId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DiscDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerInfo_Type", propOrder = {
    "name",
    "billerContact",
    "industId",
    "secretPromptAndCryptType",
    "histRetentionDays",
    "cspCustInfoReq",
    "billerPayInfo",
    "logoURL",
    "logo",
    "billerEnrollURL",
    "billerAcctIdInfo",
    "discReqd",
    "discId",
    "discDt"
})
public class BillerInfoType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BillerContact")
    protected BillerContact billerContact;
    @XmlElement(name = "IndustId")
    protected IndustId industId;
    @XmlElements({
        @XmlElement(name = "SecretPrompt", type = SecretPromptType.class),
        @XmlElement(name = "CryptType", type = String.class)
    })
    protected List<Object> secretPromptAndCryptType;
    @XmlElement(name = "HistRetentionDays")
    protected Long histRetentionDays;
    @XmlElement(name = "CSPCustInfoReq")
    protected Boolean cspCustInfoReq;
    @XmlElement(name = "BillerPayInfo")
    protected BillerPayInfo billerPayInfo;
    @XmlElement(name = "LogoURL")
    protected String logoURL;
    @XmlElement(name = "Logo")
    protected LogoType logo;
    @XmlElement(name = "BillerEnrollURL")
    protected String billerEnrollURL;
    @XmlElement(name = "BillerAcctIdInfo")
    protected BillerAcctIdInfoType billerAcctIdInfo;
    @XmlElement(name = "DiscReqd")
    protected Boolean discReqd;
    @XmlElement(name = "DiscId")
    protected String discId;
    @XmlElement(name = "DiscDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discDt;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the billerContact property.
     * 
     * @return
     *     possible object is
     *     {@link BillerContact }
     *     
     */
    public BillerContact getBillerContact() {
        return billerContact;
    }

    /**
     * Sets the value of the billerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerContact }
     *     
     */
    public void setBillerContact(BillerContact value) {
        this.billerContact = value;
    }

    /**
     * Gets the value of the industId property.
     * 
     * @return
     *     possible object is
     *     {@link IndustId }
     *     
     */
    public IndustId getIndustId() {
        return industId;
    }

    /**
     * Sets the value of the industId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustId }
     *     
     */
    public void setIndustId(IndustId value) {
        this.industId = value;
    }

    /**
     * Gets the value of the secretPromptAndCryptType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secretPromptAndCryptType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecretPromptAndCryptType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecretPromptType }
     * {@link String }
     * 
     * 
     */
    public List<Object> getSecretPromptAndCryptType() {
        if (secretPromptAndCryptType == null) {
            secretPromptAndCryptType = new ArrayList<Object>();
        }
        return this.secretPromptAndCryptType;
    }

    /**
     * Gets the value of the histRetentionDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistRetentionDays() {
        return histRetentionDays;
    }

    /**
     * Sets the value of the histRetentionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistRetentionDays(Long value) {
        this.histRetentionDays = value;
    }

    /**
     * Gets the value of the cspCustInfoReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCSPCustInfoReq() {
        return cspCustInfoReq;
    }

    /**
     * Sets the value of the cspCustInfoReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCSPCustInfoReq(Boolean value) {
        this.cspCustInfoReq = value;
    }

    /**
     * Gets the value of the billerPayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillerPayInfo }
     *     
     */
    public BillerPayInfo getBillerPayInfo() {
        return billerPayInfo;
    }

    /**
     * Sets the value of the billerPayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerPayInfo }
     *     
     */
    public void setBillerPayInfo(BillerPayInfo value) {
        this.billerPayInfo = value;
    }

    /**
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link LogoType }
     *     
     */
    public LogoType getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoType }
     *     
     */
    public void setLogo(LogoType value) {
        this.logo = value;
    }

    /**
     * Gets the value of the billerEnrollURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerEnrollURL() {
        return billerEnrollURL;
    }

    /**
     * Sets the value of the billerEnrollURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerEnrollURL(String value) {
        this.billerEnrollURL = value;
    }

    /**
     * Gets the value of the billerAcctIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillerAcctIdInfoType }
     *     
     */
    public BillerAcctIdInfoType getBillerAcctIdInfo() {
        return billerAcctIdInfo;
    }

    /**
     * Sets the value of the billerAcctIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerAcctIdInfoType }
     *     
     */
    public void setBillerAcctIdInfo(BillerAcctIdInfoType value) {
        this.billerAcctIdInfo = value;
    }

    /**
     * Gets the value of the discReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscReqd() {
        return discReqd;
    }

    /**
     * Sets the value of the discReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscReqd(Boolean value) {
        this.discReqd = value;
    }

    /**
     * Gets the value of the discId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscId() {
        return discId;
    }

    /**
     * Sets the value of the discId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscId(String value) {
        this.discId = value;
    }

    /**
     * Gets the value of the discDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscDt() {
        return discDt;
    }

    /**
     * Sets the value of the discDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscDt(XMLGregorianCalendar value) {
        this.discDt = value;
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
