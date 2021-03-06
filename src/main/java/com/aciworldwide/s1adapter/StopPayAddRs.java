
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
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Status"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RqUID"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}AsyncRqUID" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RouteInfo"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctId"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctId"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctId"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}SerialRange"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}QualifiedAmt"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}StopPayInfo"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}StopPayRec" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ACHPmtInfo" minOccurs="0"/&gt;
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
    "cardAcctId",
    "loanAcctId",
    "serialRange",
    "qualifiedAmt",
    "stopPayInfo",
    "stopPayRec",
    "achPmtInfo",
    "tunneledData"
})
@XmlRootElement(name = "StopPayAddRs")
public class StopPayAddRs {

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsyncRqUID")
    protected String asyncRqUID;
    @XmlElement(name = "RouteInfo", required = true)
    protected RouteInfo routeInfo;
    @XmlElement(name = "CustId", required = true)
    protected CustId custId;
    @XmlElement(name = "DepAcctId")
    protected DepAcctId depAcctId;
    @XmlElement(name = "CardAcctId")
    protected CardAcctId cardAcctId;
    @XmlElement(name = "LoanAcctId")
    protected LoanAcctId loanAcctId;
    @XmlElement(name = "SerialRange")
    protected SerialRangeType serialRange;
    @XmlElement(name = "QualifiedAmt")
    protected QualifiedAmtType qualifiedAmt;
    @XmlElement(name = "StopPayInfo")
    protected StopPayInfoType stopPayInfo;
    @XmlElement(name = "StopPayRec")
    protected List<StopPayRecType> stopPayRec;
    @XmlElement(name = "ACHPmtInfo")
    protected ACHPmtInfo achPmtInfo;
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
     * Gets the value of the cardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctId }
     *     
     */
    public CardAcctId getCardAcctId() {
        return cardAcctId;
    }

    /**
     * Sets the value of the cardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctId }
     *     
     */
    public void setCardAcctId(CardAcctId value) {
        this.cardAcctId = value;
    }

    /**
     * Gets the value of the loanAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctId }
     *     
     */
    public LoanAcctId getLoanAcctId() {
        return loanAcctId;
    }

    /**
     * Sets the value of the loanAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctId }
     *     
     */
    public void setLoanAcctId(LoanAcctId value) {
        this.loanAcctId = value;
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
     * Gets the value of the stopPayRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPayRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPayRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopPayRecType }
     * 
     * 
     */
    public List<StopPayRecType> getStopPayRec() {
        if (stopPayRec == null) {
            stopPayRec = new ArrayList<StopPayRecType>();
        }
        return this.stopPayRec;
    }

    /**
     * Gets the value of the achPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ACHPmtInfo }
     *     
     */
    public ACHPmtInfo getACHPmtInfo() {
        return achPmtInfo;
    }

    /**
     * Sets the value of the achPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHPmtInfo }
     *     
     */
    public void setACHPmtInfo(ACHPmtInfo value) {
        this.achPmtInfo = value;
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
