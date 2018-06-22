
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DebitAuthId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DebitAuthInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DebitAuthStatus"/&gt;
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
    "debitAuthId",
    "debitAuthInfo",
    "debitAuthStatus"
})
@XmlRootElement(name = "DebitAuthRec")
public class DebitAuthRec {

    @XmlElement(name = "DebitAuthId", required = true)
    protected String debitAuthId;
    @XmlElement(name = "DebitAuthInfo", required = true)
    protected DebitAuthInfo debitAuthInfo;
    @XmlElement(name = "DebitAuthStatus", required = true)
    protected DebitAuthStatus debitAuthStatus;

    /**
     * Gets the value of the debitAuthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAuthId() {
        return debitAuthId;
    }

    /**
     * Sets the value of the debitAuthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAuthId(String value) {
        this.debitAuthId = value;
    }

    /**
     * Gets the value of the debitAuthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthInfo }
     *     
     */
    public DebitAuthInfo getDebitAuthInfo() {
        return debitAuthInfo;
    }

    /**
     * Sets the value of the debitAuthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthInfo }
     *     
     */
    public void setDebitAuthInfo(DebitAuthInfo value) {
        this.debitAuthInfo = value;
    }

    /**
     * Gets the value of the debitAuthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthStatus }
     *     
     */
    public DebitAuthStatus getDebitAuthStatus() {
        return debitAuthStatus;
    }

    /**
     * Sets the value of the debitAuthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthStatus }
     *     
     */
    public void setDebitAuthStatus(DebitAuthStatus value) {
        this.debitAuthStatus = value;
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
