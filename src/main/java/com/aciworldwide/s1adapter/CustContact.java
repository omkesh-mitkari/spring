
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DayPhone" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EvePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DayFax" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EmailAddr" minOccurs="0"/&gt;
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
    "dayPhone",
    "evePhone",
    "dayFax",
    "emailAddr"
})
@XmlRootElement(name = "CustContact")
public class CustContact {

    @XmlElement(name = "DayPhone")
    protected String dayPhone;
    @XmlElement(name = "EvePhone")
    protected String evePhone;
    @XmlElement(name = "DayFax")
    protected String dayFax;
    @XmlElement(name = "EmailAddr")
    protected String emailAddr;

    /**
     * Gets the value of the dayPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayPhone() {
        return dayPhone;
    }

    /**
     * Sets the value of the dayPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayPhone(String value) {
        this.dayPhone = value;
    }

    /**
     * Gets the value of the evePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvePhone() {
        return evePhone;
    }

    /**
     * Sets the value of the evePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvePhone(String value) {
        this.evePhone = value;
    }

    /**
     * Gets the value of the dayFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayFax() {
        return dayFax;
    }

    /**
     * Sets the value of the dayFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayFax(String value) {
        this.dayFax = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
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
