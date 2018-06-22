
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Merchant" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}StdPayeeId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FSPayee"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}XferPayee"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerPayee"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillingAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctPayAcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DfltPmtInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "nickname",
    "merchant",
    "stdPayeeId",
    "fsPayee",
    "xferPayee",
    "billerPayee",
    "billingAcct",
    "acctPayAcctId",
    "dfltPmtInfo"
})
@XmlRootElement(name = "CustPayeeInfo")
public class CustPayeeInfo {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "Merchant")
    protected Merchant merchant;
    @XmlElement(name = "StdPayeeId")
    protected StdPayeeId stdPayeeId;
    @XmlElement(name = "FSPayee")
    protected FSPayee fsPayee;
    @XmlElement(name = "XferPayee")
    protected XferPayee xferPayee;
    @XmlElement(name = "BillerPayee")
    protected BillerPayee billerPayee;
    @XmlElement(name = "BillingAcct")
    protected String billingAcct;
    @XmlElement(name = "AcctPayAcctId")
    protected String acctPayAcctId;
    @XmlElement(name = "DfltPmtInfo")
    protected DfltPmtInfo dfltPmtInfo;

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
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link Merchant }
     *     
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Merchant }
     *     
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the stdPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeId }
     *     
     */
    public StdPayeeId getStdPayeeId() {
        return stdPayeeId;
    }

    /**
     * Sets the value of the stdPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeId }
     *     
     */
    public void setStdPayeeId(StdPayeeId value) {
        this.stdPayeeId = value;
    }

    /**
     * Gets the value of the fsPayee property.
     * 
     * @return
     *     possible object is
     *     {@link FSPayee }
     *     
     */
    public FSPayee getFSPayee() {
        return fsPayee;
    }

    /**
     * Sets the value of the fsPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FSPayee }
     *     
     */
    public void setFSPayee(FSPayee value) {
        this.fsPayee = value;
    }

    /**
     * Gets the value of the xferPayee property.
     * 
     * @return
     *     possible object is
     *     {@link XferPayee }
     *     
     */
    public XferPayee getXferPayee() {
        return xferPayee;
    }

    /**
     * Sets the value of the xferPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferPayee }
     *     
     */
    public void setXferPayee(XferPayee value) {
        this.xferPayee = value;
    }

    /**
     * Gets the value of the billerPayee property.
     * 
     * @return
     *     possible object is
     *     {@link BillerPayee }
     *     
     */
    public BillerPayee getBillerPayee() {
        return billerPayee;
    }

    /**
     * Sets the value of the billerPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerPayee }
     *     
     */
    public void setBillerPayee(BillerPayee value) {
        this.billerPayee = value;
    }

    /**
     * Gets the value of the billingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAcct() {
        return billingAcct;
    }

    /**
     * Sets the value of the billingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAcct(String value) {
        this.billingAcct = value;
    }

    /**
     * Gets the value of the acctPayAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPayAcctId() {
        return acctPayAcctId;
    }

    /**
     * Sets the value of the acctPayAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPayAcctId(String value) {
        this.acctPayAcctId = value;
    }

    /**
     * Gets the value of the dfltPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DfltPmtInfo }
     *     
     */
    public DfltPmtInfo getDfltPmtInfo() {
        return dfltPmtInfo;
    }

    /**
     * Sets the value of the dfltPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfltPmtInfo }
     *     
     */
    public void setDfltPmtInfo(DfltPmtInfo value) {
        this.dfltPmtInfo = value;
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
