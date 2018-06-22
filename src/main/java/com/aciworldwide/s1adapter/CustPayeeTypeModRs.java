
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
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Status" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RqUID"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}AsyncRqUID" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PayeeType"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CSPRefId" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SPRefId" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
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
    "status",
    "rqUID",
    "asyncRqUID",
    "custId",
    "custPayeeId",
    "payeeType",
    "cspRefId",
    "spRefId"
})
@XmlRootElement(name = "CustPayeeTypeModRs")
public class CustPayeeTypeModRs {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsyncRqUID")
    protected String asyncRqUID;
    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "CustPayeeId")
    protected String custPayeeId;
    @XmlElement(name = "PayeeType")
    protected String payeeType;
    @XmlElement(name = "CSPRefId")
    protected String cspRefId;
    @XmlElement(name = "SPRefId")
    protected String spRefId;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the asyncRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncRqUID() {
        return asyncRqUID;
    }

    /**
     * Sets the value of the asyncRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncRqUID(String value) {
        this.asyncRqUID = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustId }
     *     
     */
    public CustId getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustId }
     *     
     */
    public void setCustId(CustId value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPayeeId() {
        return custPayeeId;
    }

    /**
     * Sets the value of the custPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPayeeId(String value) {
        this.custPayeeId = value;
    }

    /**
     * Gets the value of the payeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeType() {
        return payeeType;
    }

    /**
     * Sets the value of the payeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeType(String value) {
        this.payeeType = value;
    }

    /**
     * Gets the value of the cspRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPRefId() {
        return cspRefId;
    }

    /**
     * Sets the value of the cspRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPRefId(String value) {
        this.cspRefId = value;
    }

    /**
     * Gets the value of the spRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefId() {
        return spRefId;
    }

    /**
     * Sets the value of the spRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefId(String value) {
        this.spRefId = value;
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
