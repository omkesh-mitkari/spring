
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerContact" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}HistRetentionDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerPayInfo" minOccurs="0"/&gt;
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
    "billerId",
    "billerContact",
    "histRetentionDays",
    "billerPayInfo"
})
@XmlRootElement(name = "BillerPayee")
public class BillerPayee {

    @XmlElement(name = "BillerId")
    protected BillerId billerId;
    @XmlElement(name = "BillerContact")
    protected BillerContact billerContact;
    @XmlElement(name = "HistRetentionDays")
    protected Long histRetentionDays;
    @XmlElement(name = "BillerPayInfo")
    protected BillerPayInfo billerPayInfo;

    /**
     * Gets the value of the billerId property.
     * 
     * @return
     *     possible object is
     *     {@link BillerId }
     *     
     */
    public BillerId getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerId }
     *     
     */
    public void setBillerId(BillerId value) {
        this.billerId = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
