
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreditAuthId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreditAuthInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreditAuthStatus"/&gt;
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
    "creditAuthId",
    "creditAuthInfo",
    "creditAuthStatus"
})
@XmlRootElement(name = "CreditAuthRec")
public class CreditAuthRec {

    @XmlElement(name = "CreditAuthId", required = true)
    protected String creditAuthId;
    @XmlElement(name = "CreditAuthInfo", required = true)
    protected CreditAuthInfo creditAuthInfo;
    @XmlElement(name = "CreditAuthStatus", required = true)
    protected CreditAuthStatus creditAuthStatus;

    /**
     * Gets the value of the creditAuthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthId() {
        return creditAuthId;
    }

    /**
     * Sets the value of the creditAuthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthId(String value) {
        this.creditAuthId = value;
    }

    /**
     * Gets the value of the creditAuthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAuthInfo }
     *     
     */
    public CreditAuthInfo getCreditAuthInfo() {
        return creditAuthInfo;
    }

    /**
     * Sets the value of the creditAuthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAuthInfo }
     *     
     */
    public void setCreditAuthInfo(CreditAuthInfo value) {
        this.creditAuthInfo = value;
    }

    /**
     * Gets the value of the creditAuthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAuthStatus }
     *     
     */
    public CreditAuthStatus getCreditAuthStatus() {
        return creditAuthStatus;
    }

    /**
     * Sets the value of the creditAuthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAuthStatus }
     *     
     */
    public void setCreditAuthStatus(CreditAuthStatus value) {
        this.creditAuthStatus = value;
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
