
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
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Status" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RqUID"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}AsyncRqUID" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RouteInfo"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExDealId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ValueDt"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PartnerRefId" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExDealInfo" minOccurs="0"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExOffsetRateInfo" minOccurs="0"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}OffsetAmt"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateId" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
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
    "status",
    "rqUID",
    "asyncRqUID",
    "routeInfo",
    "custId",
    "forExDealId",
    "depAcctId",
    "valueDt",
    "partnerRefId",
    "forExDealInfo",
    "forExOffsetRateInfo",
    "offsetAmt",
    "forExRateId",
    "tunneledData"
})
@XmlRootElement(name = "ForExDealAuthCanRs")
public class ForExDealAuthCanRs {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsyncRqUID")
    protected String asyncRqUID;
    @XmlElement(name = "RouteInfo", required = true)
    protected RouteInfo routeInfo;
    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "ForExDealId", required = true)
    protected String forExDealId;
    @XmlElement(name = "DepAcctId", required = true)
    protected DepAcctId depAcctId;
    @XmlElement(name = "ValueDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valueDt;
    @XmlElement(name = "PartnerRefId")
    protected String partnerRefId;
    @XmlElement(name = "ForExDealInfo")
    protected ForExDealInfoType forExDealInfo;
    @XmlElement(name = "ForExOffsetRateInfo")
    protected ForExOffsetRateInfoType forExOffsetRateInfo;
    @XmlElement(name = "OffsetAmt")
    protected CurrencyAmount offsetAmt;
    @XmlElement(name = "ForExRateId")
    protected String forExRateId;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the asyncRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncRqUID() {
        return asyncRqUID;
    }

    /**
     * Sets the value of the asyncRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncRqUID(String value) {
        this.asyncRqUID = value;
    }

    /**
     * Gets the value of the routeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInfo }
     *     
     */
    public RouteInfo getRouteInfo() {
        return routeInfo;
    }

    /**
     * Sets the value of the routeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInfo }
     *     
     */
    public void setRouteInfo(RouteInfo value) {
        this.routeInfo = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustId }
     *     
     */
    public CustId getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustId }
     *     
     */
    public void setCustId(CustId value) {
        this.custId = value;
    }

    /**
     * Gets the value of the forExDealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExDealId() {
        return forExDealId;
    }

    /**
     * Sets the value of the forExDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExDealId(String value) {
        this.forExDealId = value;
    }

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctId }
     *     
     */
    public DepAcctId getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctId }
     *     
     */
    public void setDepAcctId(DepAcctId value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the valueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDt() {
        return valueDt;
    }

    /**
     * Sets the value of the valueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDt(XMLGregorianCalendar value) {
        this.valueDt = value;
    }

    /**
     * Gets the value of the partnerRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRefId() {
        return partnerRefId;
    }

    /**
     * Sets the value of the partnerRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRefId(String value) {
        this.partnerRefId = value;
    }

    /**
     * Gets the value of the forExDealInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealInfoType }
     *     
     */
    public ForExDealInfoType getForExDealInfo() {
        return forExDealInfo;
    }

    /**
     * Sets the value of the forExDealInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealInfoType }
     *     
     */
    public void setForExDealInfo(ForExDealInfoType value) {
        this.forExDealInfo = value;
    }

    /**
     * Gets the value of the forExOffsetRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExOffsetRateInfoType }
     *     
     */
    public ForExOffsetRateInfoType getForExOffsetRateInfo() {
        return forExOffsetRateInfo;
    }

    /**
     * Sets the value of the forExOffsetRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExOffsetRateInfoType }
     *     
     */
    public void setForExOffsetRateInfo(ForExOffsetRateInfoType value) {
        this.forExOffsetRateInfo = value;
    }

    /**
     * Gets the value of the offsetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getOffsetAmt() {
        return offsetAmt;
    }

    /**
     * Sets the value of the offsetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setOffsetAmt(CurrencyAmount value) {
        this.offsetAmt = value;
    }

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
