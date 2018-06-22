
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerContact" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CutOffTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DaysToPay"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TunneledData" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "custPayeeId",
    "custPayeeInfo",
    "billerContact",
    "cutOffTime",
    "daysToPay",
    "tunneledData"
})
@XmlRootElement(name = "CustPayeeRec")
public class CustPayeeRec {

    @XmlElement(name = "CustPayeeId")
    protected String custPayeeId;
    @XmlElement(name = "CustPayeeInfo", required = true)
    protected CustPayeeInfo custPayeeInfo;
    @XmlElement(name = "BillerContact")
    protected BillerContact billerContact;
    @XmlElement(name = "CutOffTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutOffTime;
    @XmlElement(name = "DaysToPay")
    protected long daysToPay;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the custPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPayeeId() {
        return custPayeeId;
    }

    /**
     * Sets the value of the custPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPayeeId(String value) {
        this.custPayeeId = value;
    }

    /**
     * Gets the value of the custPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeInfo }
     *     
     */
    public CustPayeeInfo getCustPayeeInfo() {
        return custPayeeInfo;
    }

    /**
     * Sets the value of the custPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeInfo }
     *     
     */
    public void setCustPayeeInfo(CustPayeeInfo value) {
        this.custPayeeInfo = value;
    }

    /**
     * Gets the value of the billerContact property.
     * 
     * @return
     *     possible object is
     *     {@link BillerContact }
     *     
     */
    public BillerContact getBillerContact() {
        return billerContact;
    }

    /**
     * Sets the value of the billerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerContact }
     *     
     */
    public void setBillerContact(BillerContact value) {
        this.billerContact = value;
    }

    /**
     * Gets the value of the cutOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutOffTime() {
        return cutOffTime;
    }

    /**
     * Sets the value of the cutOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutOffTime(XMLGregorianCalendar value) {
        this.cutOffTime = value;
    }

    /**
     * Gets the value of the daysToPay property.
     * 
     */
    public long getDaysToPay() {
        return daysToPay;
    }

    /**
     * Sets the value of the daysToPay property.
     * 
     */
    public void setDaysToPay(long value) {
        this.daysToPay = value;
    }

    /**
     * Gets the value of the tunneledData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunneledData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunneledData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapElement }
     * 
     * 
     */
    public List<MapElement> getTunneledData() {
        if (tunneledData == null) {
            tunneledData = new ArrayList<MapElement>();
        }
        return this.tunneledData;
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
