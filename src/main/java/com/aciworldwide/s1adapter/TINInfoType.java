
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for TINInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TINInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TINType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TaxId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CertCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TINInfo_Type", propOrder = {
    "tinType",
    "taxId",
    "certCode"
})
public class TINInfoType {

    @XmlElement(name = "TINType")
    protected String tinType;
    @XmlElement(name = "TaxId", required = true)
    protected String taxId;
    @XmlElement(name = "CertCode")
    protected String certCode;

    /**
     * Gets the value of the tinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTINType() {
        return tinType;
    }

    /**
     * Sets the value of the tinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTINType(String value) {
        this.tinType = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the certCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertCode() {
        return certCode;
    }

    /**
     * Sets the value of the certCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertCode(String value) {
        this.certCode = value;
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
