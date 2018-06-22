
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
 * <p>Java class for StateId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateId_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StateNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssueLoc" minOccurs="0"/&gt;
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
@XmlType(name = "StateId_Type", propOrder = {
    "stateNumber",
    "issueLoc",
    "issDt",
    "expDt"
})
public class StateIdType {

    @XmlElement(name = "StateNumber")
    protected String stateNumber;
    @XmlElement(name = "IssueLoc")
    protected String issueLoc;
    @XmlElement(name = "IssDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issDt;
    @XmlElement(name = "ExpDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDt;

    /**
     * Gets the value of the stateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateNumber() {
        return stateNumber;
    }

    /**
     * Sets the value of the stateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateNumber(String value) {
        this.stateNumber = value;
    }

    /**
     * Gets the value of the issueLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueLoc() {
        return issueLoc;
    }

    /**
     * Sets the value of the issueLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueLoc(String value) {
        this.issueLoc = value;
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
