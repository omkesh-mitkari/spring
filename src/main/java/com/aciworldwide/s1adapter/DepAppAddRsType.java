
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DepAppAddRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppAddRs_Type"&gt;
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
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAppInfo"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAppRec"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CSPRefId" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SPRefId" minOccurs="0"/&gt;
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
@XmlType(name = "DepAppAddRs_Type", propOrder = {
    "status",
    "rqUID",
    "asyncRqUID",
    "routeInfo",
    "custId",
    "depAppInfo",
    "depAppRec",
    "cspRefId",
    "spRefId",
    "tunneledData"
})
public class DepAppAddRsType {

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
    @XmlElement(name = "DepAppInfo")
    protected DepAppInfoType depAppInfo;
    @XmlElement(name = "DepAppRec")
    protected DepAppRecType depAppRec;
    @XmlElement(name = "CSPRefId")
    protected String cspRefId;
    @XmlElement(name = "SPRefId")
    protected String spRefId;
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
     * Gets the value of the depAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppInfoType }
     *     
     */
    public DepAppInfoType getDepAppInfo() {
        return depAppInfo;
    }

    /**
     * Sets the value of the depAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppInfoType }
     *     
     */
    public void setDepAppInfo(DepAppInfoType value) {
        this.depAppInfo = value;
    }

    /**
     * Gets the value of the depAppRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppRecType }
     *     
     */
    public DepAppRecType getDepAppRec() {
        return depAppRec;
    }

    /**
     * Sets the value of the depAppRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppRecType }
     *     
     */
    public void setDepAppRec(DepAppRecType value) {
        this.depAppRec = value;
    }

    /**
     * Gets the value of the cspRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPRefId() {
        return cspRefId;
    }

    /**
     * Sets the value of the cspRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPRefId(String value) {
        this.cspRefId = value;
    }

    /**
     * Gets the value of the spRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefId() {
        return spRefId;
    }

    /**
     * Sets the value of the spRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefId(String value) {
        this.spRefId = value;
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
