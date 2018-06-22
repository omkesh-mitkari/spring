
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StopChkInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PostedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StopChkStatusCode"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StatusDesc" minOccurs="0"/&gt;
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
    "stopChkInfo",
    "postedDt",
    "stopChkStatusCode",
    "statusDesc"
})
@XmlRootElement(name = "StopChkRec")
public class StopChkRec {

    @XmlElement(name = "StopChkInfo", required = true)
    protected StopChkInfo stopChkInfo;
    @XmlElement(name = "PostedDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "StopChkStatusCode", required = true)
    protected String stopChkStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;

    /**
     * Gets the value of the stopChkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StopChkInfo }
     *     
     */
    public StopChkInfo getStopChkInfo() {
        return stopChkInfo;
    }

    /**
     * Sets the value of the stopChkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChkInfo }
     *     
     */
    public void setStopChkInfo(StopChkInfo value) {
        this.stopChkInfo = value;
    }

    /**
     * Gets the value of the postedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDt() {
        return postedDt;
    }

    /**
     * Sets the value of the postedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDt(XMLGregorianCalendar value) {
        this.postedDt = value;
    }

    /**
     * Gets the value of the stopChkStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopChkStatusCode() {
        return stopChkStatusCode;
    }

    /**
     * Sets the value of the stopChkStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopChkStatusCode(String value) {
        this.stopChkStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
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
