
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ToCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FromCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateAction" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExValDtType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateDealType" minOccurs="0"/&gt;
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
    "forExRateId",
    "toCurCode",
    "fromCurCode",
    "forExRateType",
    "forExRateAction",
    "forExValDtType",
    "forExRateInfo",
    "forExRateDealType"
})
@XmlRootElement(name = "ForExRateRec")
public class ForExRateRec {

    @XmlElement(name = "ForExRateId")
    protected String forExRateId;
    @XmlElement(name = "ToCurCode")
    protected String toCurCode;
    @XmlElement(name = "FromCurCode")
    protected String fromCurCode;
    @XmlElement(name = "ForExRateType")
    protected String forExRateType;
    @XmlElement(name = "ForExRateAction")
    protected String forExRateAction;
    @XmlElement(name = "ForExValDtType")
    protected String forExValDtType;
    @XmlElement(name = "ForExRateInfo", required = true)
    protected ForExRateInfo forExRateInfo;
    @XmlElement(name = "ForExRateDealType")
    protected String forExRateDealType;

    /**
     * Gets the value of the forExRateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateId() {
        return forExRateId;
    }

    /**
     * Sets the value of the forExRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateId(String value) {
        this.forExRateId = value;
    }

    /**
     * Gets the value of the toCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCurCode() {
        return toCurCode;
    }

    /**
     * Sets the value of the toCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCurCode(String value) {
        this.toCurCode = value;
    }

    /**
     * Gets the value of the fromCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurCode() {
        return fromCurCode;
    }

    /**
     * Sets the value of the fromCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurCode(String value) {
        this.fromCurCode = value;
    }

    /**
     * Gets the value of the forExRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateType() {
        return forExRateType;
    }

    /**
     * Sets the value of the forExRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateType(String value) {
        this.forExRateType = value;
    }

    /**
     * Gets the value of the forExRateAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateAction() {
        return forExRateAction;
    }

    /**
     * Sets the value of the forExRateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateAction(String value) {
        this.forExRateAction = value;
    }

    /**
     * Gets the value of the forExValDtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExValDtType() {
        return forExValDtType;
    }

    /**
     * Sets the value of the forExValDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExValDtType(String value) {
        this.forExValDtType = value;
    }

    /**
     * Gets the value of the forExRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateInfo }
     *     
     */
    public ForExRateInfo getForExRateInfo() {
        return forExRateInfo;
    }

    /**
     * Sets the value of the forExRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateInfo }
     *     
     */
    public void setForExRateInfo(ForExRateInfo value) {
        this.forExRateInfo = value;
    }

    /**
     * Gets the value of the forExRateDealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateDealType() {
        return forExRateDealType;
    }

    /**
     * Sets the value of the forExRateDealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateDealType(String value) {
        this.forExRateDealType = value;
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
