
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CryptType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Pswd"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CryptPswd"/&gt;
 *         &lt;/choice&gt;
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
    "cryptType",
    "pswd",
    "cryptPswd"
})
@XmlRootElement(name = "ExternalPswd")
public class ExternalPswd {

    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "Pswd")
    protected String pswd;
    @XmlElement(name = "CryptPswd")
    protected CryptPswd cryptPswd;

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the cryptPswd property.
     * 
     * @return
     *     possible object is
     *     {@link CryptPswd }
     *     
     */
    public CryptPswd getCryptPswd() {
        return cryptPswd;
    }

    /**
     * Sets the value of the cryptPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptPswd }
     *     
     */
    public void setCryptPswd(CryptPswd value) {
        this.cryptPswd = value;
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
