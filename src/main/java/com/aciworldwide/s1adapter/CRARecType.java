
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for CRARec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRARec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CRAStateCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CRACountyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CRACensusTract" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CRASMSACode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CRALoc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CRAIncomeLvl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRARec_Type", propOrder = {
    "craStateCode",
    "craCountyCode",
    "craCensusTract",
    "crasmsaCode",
    "craLoc",
    "craIncomeLvl"
})
@XmlSeeAlso({
    CRARec.class
})
public class CRARecType {

    @XmlElement(name = "CRAStateCode")
    protected String craStateCode;
    @XmlElement(name = "CRACountyCode")
    protected String craCountyCode;
    @XmlElement(name = "CRACensusTract")
    protected String craCensusTract;
    @XmlElement(name = "CRASMSACode")
    protected String crasmsaCode;
    @XmlElement(name = "CRALoc")
    protected String craLoc;
    @XmlElement(name = "CRAIncomeLvl")
    protected String craIncomeLvl;

    /**
     * Gets the value of the craStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRAStateCode() {
        return craStateCode;
    }

    /**
     * Sets the value of the craStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRAStateCode(String value) {
        this.craStateCode = value;
    }

    /**
     * Gets the value of the craCountyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRACountyCode() {
        return craCountyCode;
    }

    /**
     * Sets the value of the craCountyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRACountyCode(String value) {
        this.craCountyCode = value;
    }

    /**
     * Gets the value of the craCensusTract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRACensusTract() {
        return craCensusTract;
    }

    /**
     * Sets the value of the craCensusTract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRACensusTract(String value) {
        this.craCensusTract = value;
    }

    /**
     * Gets the value of the crasmsaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRASMSACode() {
        return crasmsaCode;
    }

    /**
     * Sets the value of the crasmsaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRASMSACode(String value) {
        this.crasmsaCode = value;
    }

    /**
     * Gets the value of the craLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRALoc() {
        return craLoc;
    }

    /**
     * Sets the value of the craLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRALoc(String value) {
        this.craLoc = value;
    }

    /**
     * Gets the value of the craIncomeLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRAIncomeLvl() {
        return craIncomeLvl;
    }

    /**
     * Sets the value of the craIncomeLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRAIncomeLvl(String value) {
        this.craIncomeLvl = value;
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
