
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for SecretPrompt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecretPrompt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SecretId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Prompt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SecretOptional" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SecretFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SecretMask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecretPrompt_Type", propOrder = {
    "secretId",
    "prompt",
    "memo",
    "secretOptional",
    "secretFormat",
    "secretMask"
})
public class SecretPromptType {

    @XmlElement(name = "SecretId", required = true)
    protected String secretId;
    @XmlElement(name = "Prompt", required = true)
    protected String prompt;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "SecretOptional")
    protected Boolean secretOptional;
    @XmlElement(name = "SecretFormat")
    protected String secretFormat;
    @XmlElement(name = "SecretMask")
    protected String secretMask;

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
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the secretOptional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecretOptional() {
        return secretOptional;
    }

    /**
     * Sets the value of the secretOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecretOptional(Boolean value) {
        this.secretOptional = value;
    }

    /**
     * Gets the value of the secretFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretFormat() {
        return secretFormat;
    }

    /**
     * Sets the value of the secretFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretFormat(String value) {
        this.secretFormat = value;
    }

    /**
     * Gets the value of the secretMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretMask() {
        return secretMask;
    }

    /**
     * Sets the value of the secretMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretMask(String value) {
        this.secretMask = value;
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
