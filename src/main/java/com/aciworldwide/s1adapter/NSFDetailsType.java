
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
 * <p>Java class for NSFDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSFDetails_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NSFCountYTD" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastNSFDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastNSFAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NSFDetails_Type", propOrder = {
    "nsfCountYTD",
    "lastNSFDate",
    "lastNSFAmt"
})
public class NSFDetailsType {

    @XmlElement(name = "NSFCountYTD")
    protected String nsfCountYTD;
    @XmlElement(name = "LastNSFDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastNSFDate;
    @XmlElement(name = "LastNSFAmt")
    protected CurrencyAmount lastNSFAmt;

    /**
     * Gets the value of the nsfCountYTD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSFCountYTD() {
        return nsfCountYTD;
    }

    /**
     * Sets the value of the nsfCountYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSFCountYTD(String value) {
        this.nsfCountYTD = value;
    }

    /**
     * Gets the value of the lastNSFDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastNSFDate() {
        return lastNSFDate;
    }

    /**
     * Sets the value of the lastNSFDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastNSFDate(XMLGregorianCalendar value) {
        this.lastNSFDate = value;
    }

    /**
     * Gets the value of the lastNSFAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getLastNSFAmt() {
        return lastNSFAmt;
    }

    /**
     * Sets the value of the lastNSFAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setLastNSFAmt(CurrencyAmount value) {
        this.lastNSFAmt = value;
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
