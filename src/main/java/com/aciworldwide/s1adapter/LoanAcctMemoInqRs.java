
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
 * S1 added element - Loan Account Memo Inquiry Response
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RqUID"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AsyncRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RouteInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TrnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctTrnRec" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "loanAcctId",
    "selRangeDt",
    "selRangeCurAmt",
    "trnType",
    "loanAcctTrnRec",
    "tunneledData"
})
@XmlRootElement(name = "LoanAcctMemoInqRs")
public class LoanAcctMemoInqRs {

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
    @XmlElement(name = "LoanAcctId", required = true)
    protected LoanAcctId loanAcctId;
    @XmlElement(name = "SelRangeDt")
    protected SelRangeDtType selRangeDt;
    @XmlElement(name = "SelRangeCurAmt")
    protected SelRangeCurAmt selRangeCurAmt;
    @XmlElement(name = "TrnType")
    protected List<String> trnType;
    @XmlElement(name = "LoanAcctTrnRec")
    protected List<LoanAcctTrnRec> loanAcctTrnRec;
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
     * Gets the value of the trnType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrnType() {
        if (trnType == null) {
            trnType = new ArrayList<String>();
        }
        return this.trnType;
    }

    /**
     * Gets the value of the loanAcctTrnRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanAcctTrnRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanAcctTrnRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanAcctTrnRec }
     * 
     * 
     */
    public List<LoanAcctTrnRec> getLoanAcctTrnRec() {
        if (loanAcctTrnRec == null) {
            loanAcctTrnRec = new ArrayList<LoanAcctTrnRec>();
        }
        return this.loanAcctTrnRec;
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
