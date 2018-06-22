
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SignonRole" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPswd"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GenSessKey" minOccurs="0"/&gt;
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
    "signonRole",
    "custId",
    "custPswd",
    "genSessKey"
})
@XmlRootElement(name = "SignonPswd")
public class SignonPswd {

    @XmlElement(name = "SignonRole")
    protected String signonRole;
    @XmlElement(name = "CustId", required = true)
    protected CustId custId;
    @XmlElement(name = "CustPswd", required = true)
    protected CustPswd custPswd;
    @XmlElement(name = "GenSessKey")
    protected Boolean genSessKey;

    /**
     * Gets the value of the signonRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignonRole() {
        return signonRole;
    }

    /**
     * Sets the value of the signonRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignonRole(String value) {
        this.signonRole = value;
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
     * Gets the value of the genSessKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenSessKey() {
        return genSessKey;
    }

    /**
     * Sets the value of the genSessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenSessKey(Boolean value) {
        this.genSessKey = value;
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
