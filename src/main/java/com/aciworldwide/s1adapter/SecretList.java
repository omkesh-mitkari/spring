
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SecretId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CryptType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Secret"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CryptSecret"/&gt;
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
    "secretId",
    "cryptType",
    "secret",
    "cryptSecret"
})
@XmlRootElement(name = "SecretList")
public class SecretList {

    @XmlElement(name = "SecretId", required = true)
    protected String secretId;
    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "Secret")
    protected String secret;
    @XmlElement(name = "CryptSecret")
    protected CryptSecret cryptSecret;

    /**
     * Gets the value of the secretId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * Sets the value of the secretId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretId(String value) {
        this.secretId = value;
    }

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
     * Gets the value of the secret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecret() {
        return secret;
    }

    /**
     * Sets the value of the secret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecret(String value) {
        this.secret = value;
    }

    /**
     * Gets the value of the cryptSecret property.
     * 
     * @return
     *     possible object is
     *     {@link CryptSecret }
     *     
     */
    public CryptSecret getCryptSecret() {
        return cryptSecret;
    }

    /**
     * Sets the value of the cryptSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptSecret }
     *     
     */
    public void setCryptSecret(CryptSecret value) {
        this.cryptSecret = value;
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
