
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPswd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ExternalPswd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ATMPswd" minOccurs="0"/&gt;
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
    "custPswd",
    "externalPswd",
    "atmPswd"
})
@XmlRootElement(name = "AuthInfo")
public class AuthInfo {

    @XmlElement(name = "CustPswd")
    protected CustPswd custPswd;
    @XmlElement(name = "ExternalPswd")
    protected ExternalPswd externalPswd;
    @XmlElement(name = "ATMPswd")
    protected ATMPswd atmPswd;

    /**
     * Gets the value of the custPswd property.
     * 
     * @return
     *     possible object is
     *     {@link CustPswd }
     *     
     */
    public CustPswd getCustPswd() {
        return custPswd;
    }

    /**
     * Sets the value of the custPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPswd }
     *     
     */
    public void setCustPswd(CustPswd value) {
        this.custPswd = value;
    }

    /**
     * Gets the value of the externalPswd property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPswd }
     *     
     */
    public ExternalPswd getExternalPswd() {
        return externalPswd;
    }

    /**
     * Sets the value of the externalPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPswd }
     *     
     */
    public void setExternalPswd(ExternalPswd value) {
        this.externalPswd = value;
    }

    /**
     * Gets the value of the atmPswd property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPswd }
     *     
     */
    public ATMPswd getATMPswd() {
        return atmPswd;
    }

    /**
     * Sets the value of the atmPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPswd }
     *     
     */
    public void setATMPswd(ATMPswd value) {
        this.atmPswd = value;
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
