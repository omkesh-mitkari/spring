
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for GovIssueIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GovIssueIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GovIssueIdentType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentSerialNum"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GovOrg"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GovOrgName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GovRank" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StateProv" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ExpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovIssueIdent_Type", propOrder = {
    "govIssueIdentType",
    "identSerialNum",
    "govOrg",
    "govOrgName",
    "govRank",
    "stateProv",
    "country",
    "desc",
    "issDt",
    "expDt"
})
public class GovIssueIdentType {

    @XmlElement(name = "GovIssueIdentType", required = true)
    protected String govIssueIdentType;
    @XmlElement(name = "IdentSerialNum", required = true)
    protected String identSerialNum;
    @XmlElement(name = "GovOrg", required = true)
    protected String govOrg;
    @XmlElement(name = "GovOrgName")
    protected String govOrgName;
    @XmlElement(name = "GovRank")
    protected String govRank;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "IssDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issDt;
    @XmlElement(name = "ExpDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDt;

    /**
     * Gets the value of the govIssueIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovIssueIdentType() {
        return govIssueIdentType;
    }

    /**
     * Sets the value of the govIssueIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovIssueIdentType(String value) {
        this.govIssueIdentType = value;
    }

    /**
     * Gets the value of the identSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentSerialNum() {
        return identSerialNum;
    }

    /**
     * Sets the value of the identSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentSerialNum(String value) {
        this.identSerialNum = value;
    }

    /**
     * Gets the value of the govOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovOrg() {
        return govOrg;
    }

    /**
     * Sets the value of the govOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovOrg(String value) {
        this.govOrg = value;
    }

    /**
     * Gets the value of the govOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovOrgName() {
        return govOrgName;
    }

    /**
     * Sets the value of the govOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovOrgName(String value) {
        this.govOrgName = value;
    }

    /**
     * Gets the value of the govRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovRank() {
        return govRank;
    }

    /**
     * Sets the value of the govRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovRank(String value) {
        this.govRank = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the issDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssDt() {
        return issDt;
    }

    /**
     * Sets the value of the issDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssDt(XMLGregorianCalendar value) {
        this.issDt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDt(XMLGregorianCalendar value) {
        this.expDt = value;
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
