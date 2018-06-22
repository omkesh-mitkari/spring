
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for StopPayRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPayRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StopPayStatusCode"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StopPayUID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PostedDt" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}StopPayInfo"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SerialRange"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}QualifiedAmt"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OriginatingChannel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OriginatingApplication" minOccurs="0"/&gt;
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
@XmlType(name = "StopPayRec_Type", propOrder = {
    "stopPayStatusCode",
    "statusDesc",
    "stopPayUID",
    "postedDt",
    "stopPayInfo",
    "serialRange",
    "qualifiedAmt",
    "originatingChannel",
    "originatingApplication",
    "tunneledData"
})
public class StopPayRecType {

    @XmlElement(name = "StopPayStatusCode", required = true)
    protected String stopPayStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "StopPayUID")
    protected String stopPayUID;
    @XmlElement(name = "PostedDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "StopPayInfo")
    protected StopPayInfoType stopPayInfo;
    @XmlElement(name = "SerialRange")
    protected SerialRangeType serialRange;
    @XmlElement(name = "QualifiedAmt")
    protected QualifiedAmtType qualifiedAmt;
    @XmlElement(name = "OriginatingChannel")
    protected String originatingChannel;
    @XmlElement(name = "OriginatingApplication")
    protected String originatingApplication;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the stopPayStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPayStatusCode() {
        return stopPayStatusCode;
    }

    /**
     * Sets the value of the stopPayStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPayStatusCode(String value) {
        this.stopPayStatusCode = value;
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
     * Gets the value of the stopPayUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPayUID() {
        return stopPayUID;
    }

    /**
     * Sets the value of the stopPayUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPayUID(String value) {
        this.stopPayUID = value;
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
     * Gets the value of the stopPayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StopPayInfoType }
     *     
     */
    public StopPayInfoType getStopPayInfo() {
        return stopPayInfo;
    }

    /**
     * Sets the value of the stopPayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPayInfoType }
     *     
     */
    public void setStopPayInfo(StopPayInfoType value) {
        this.stopPayInfo = value;
    }

    /**
     * Gets the value of the serialRange property.
     * 
     * @return
     *     possible object is
     *     {@link SerialRangeType }
     *     
     */
    public SerialRangeType getSerialRange() {
        return serialRange;
    }

    /**
     * Sets the value of the serialRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialRangeType }
     *     
     */
    public void setSerialRange(SerialRangeType value) {
        this.serialRange = value;
    }

    /**
     * Gets the value of the qualifiedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAmtType }
     *     
     */
    public QualifiedAmtType getQualifiedAmt() {
        return qualifiedAmt;
    }

    /**
     * Sets the value of the qualifiedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAmtType }
     *     
     */
    public void setQualifiedAmt(QualifiedAmtType value) {
        this.qualifiedAmt = value;
    }

    /**
     * Gets the value of the originatingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingChannel() {
        return originatingChannel;
    }

    /**
     * Sets the value of the originatingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingChannel(String value) {
        this.originatingChannel = value;
    }

    /**
     * Gets the value of the originatingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingApplication() {
        return originatingApplication;
    }

    /**
     * Sets the value of the originatingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingApplication(String value) {
        this.originatingApplication = value;
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
