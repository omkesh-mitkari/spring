
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * S1 added element - Deposit Account Transaction Status Inquiry Response
 * 
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
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeDt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeCurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkRange" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CheckStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FITID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctTrnStatRec" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "depAcctId",
    "selRangeDt",
    "selRangeCurAmt",
    "chkRange",
    "checkStatus",
    "fitid",
    "depAcctTrnStatRec",
    "tunneledData"
})
@XmlRootElement(name = "DepAcctTrnStatInqRs")
public class DepAcctTrnStatInqRs {

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
    @XmlElement(name = "DepAcctId")
    protected DepAcctId depAcctId;
    @XmlElement(name = "SelRangeDt")
    protected SelRangeDtType selRangeDt;
    @XmlElement(name = "SelRangeCurAmt")
    protected SelRangeCurAmt selRangeCurAmt;
    @XmlElement(name = "ChkRange")
    protected ChkRange chkRange;
    @XmlElement(name = "CheckStatus")
    protected List<String> checkStatus;
    @XmlElement(name = "FITID")
    protected List<String> fitid;
    @XmlElement(name = "DepAcctTrnStatRec")
    protected List<DepAcctTrnStatRec> depAcctTrnStatRec;
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
     * Gets the value of the selRangeDt property.
     * 
     * @return
     *     possible object is
     *     {@link SelRangeDtType }
     *     
     */
    public SelRangeDtType getSelRangeDt() {
        return selRangeDt;
    }

    /**
     * Sets the value of the selRangeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeDtType }
     *     
     */
    public void setSelRangeDt(SelRangeDtType value) {
        this.selRangeDt = value;
    }

    /**
     * Gets the value of the selRangeCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SelRangeCurAmt }
     *     
     */
    public SelRangeCurAmt getSelRangeCurAmt() {
        return selRangeCurAmt;
    }

    /**
     * Sets the value of the selRangeCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeCurAmt }
     *     
     */
    public void setSelRangeCurAmt(SelRangeCurAmt value) {
        this.selRangeCurAmt = value;
    }

    /**
     * Gets the value of the chkRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRange }
     *     
     */
    public ChkRange getChkRange() {
        return chkRange;
    }

    /**
     * Sets the value of the chkRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRange }
     *     
     */
    public void setChkRange(ChkRange value) {
        this.chkRange = value;
    }

    /**
     * S1 Added Aggregate - Check Status Gets the value of the checkStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCheckStatus() {
        if (checkStatus == null) {
            checkStatus = new ArrayList<String>();
        }
        return this.checkStatus;
    }

    /**
     * S1 added element - Financial Institution transaction identifier - a unique id for each transaction Gets the value of the fitid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFITID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFITID() {
        if (fitid == null) {
            fitid = new ArrayList<String>();
        }
        return this.fitid;
    }

    /**
     * Gets the value of the depAcctTrnStatRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depAcctTrnStatRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepAcctTrnStatRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepAcctTrnStatRec }
     * 
     * 
     */
    public List<DepAcctTrnStatRec> getDepAcctTrnStatRec() {
        if (depAcctTrnStatRec == null) {
            depAcctTrnStatRec = new ArrayList<DepAcctTrnStatRec>();
        }
        return this.depAcctTrnStatRec;
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
