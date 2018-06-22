
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
 * <p>Java class for XferInqRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferInqRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Status" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RqUID"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}MsgRqHdr" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}MsgRsHdr" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}AsyncRqUID" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RouteInfo"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RecCtrlOut" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}XferId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RecXferId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CSPRefId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SPRefId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctIdFrom"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctIdFrom"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctIdFrom"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctIdTo"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctIdTo"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctIdTo"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}XferStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeDueDt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeCurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DeliveryMethod" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}XferRec" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Token" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}TunneledData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferInqRs_Type", propOrder = {
    "status",
    "rqUID",
    "msgRqHdr",
    "msgRsHdr",
    "asyncRqUID",
    "routeInfo",
    "custId",
    "recCtrlOut",
    "xferId",
    "recXferId",
    "cspRefId",
    "spRefId",
    "depAcctIdFrom",
    "cardAcctIdFrom",
    "loanAcctIdFrom",
    "depAcctIdTo",
    "cardAcctIdTo",
    "loanAcctIdTo",
    "xferStatusCode",
    "selRangeDueDt",
    "selRangeCurAmt",
    "deliveryMethod",
    "xferRec",
    "token",
    "tunneledData"
})
public class XferInqRsType {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MsgRqHdr")
    protected MsgRqHdrType msgRqHdr;
    @XmlElement(name = "MsgRsHdr")
    protected MsgRsHdrType msgRsHdr;
    @XmlElement(name = "AsyncRqUID")
    protected String asyncRqUID;
    @XmlElement(name = "RouteInfo", required = true)
    protected RouteInfo routeInfo;
    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "RecCtrlOut")
    protected RecCtrlOut recCtrlOut;
    @XmlElement(name = "XferId")
    protected List<String> xferId;
    @XmlElement(name = "RecXferId")
    protected List<String> recXferId;
    @XmlElement(name = "CSPRefId")
    protected List<String> cspRefId;
    @XmlElement(name = "SPRefId")
    protected List<String> spRefId;
    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdFrom depAcctIdFrom;
    @XmlElement(name = "CardAcctIdFrom")
    protected CardAcctIdFrom cardAcctIdFrom;
    @XmlElement(name = "LoanAcctIdFrom")
    protected LoanAcctIdFrom loanAcctIdFrom;
    @XmlElement(name = "DepAcctIdTo")
    protected DepAcctIdTo depAcctIdTo;
    @XmlElement(name = "CardAcctIdTo")
    protected CardAcctIdTo cardAcctIdTo;
    @XmlElement(name = "LoanAcctIdTo")
    protected LoanAcctIdTo loanAcctIdTo;
    @XmlElement(name = "XferStatusCode")
    protected List<String> xferStatusCode;
    @XmlElement(name = "SelRangeDueDt")
    protected SelRangeDtType selRangeDueDt;
    @XmlElement(name = "SelRangeCurAmt")
    protected SelRangeCurAmt selRangeCurAmt;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "XferRec")
    protected List<XferRec> xferRec;
    @XmlElement(name = "Token")
    protected String token;
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
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrType }
     *     
     */
    public MsgRqHdrType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrType }
     *     
     */
    public MsgRsHdrType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrType value) {
        this.msgRsHdr = value;
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
     * Gets the value of the recCtrlOut property.
     * 
     * @return
     *     possible object is
     *     {@link RecCtrlOut }
     *     
     */
    public RecCtrlOut getRecCtrlOut() {
        return recCtrlOut;
    }

    /**
     * Sets the value of the recCtrlOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCtrlOut }
     *     
     */
    public void setRecCtrlOut(RecCtrlOut value) {
        this.recCtrlOut = value;
    }

    /**
     * Gets the value of the xferId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getXferId() {
        if (xferId == null) {
            xferId = new ArrayList<String>();
        }
        return this.xferId;
    }

    /**
     * Gets the value of the recXferId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recXferId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecXferId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecXferId() {
        if (recXferId == null) {
            recXferId = new ArrayList<String>();
        }
        return this.recXferId;
    }

    /**
     * Gets the value of the cspRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cspRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSPRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCSPRefId() {
        if (cspRefId == null) {
            cspRefId = new ArrayList<String>();
        }
        return this.cspRefId;
    }

    /**
     * Gets the value of the spRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSPRefId() {
        if (spRefId == null) {
            spRefId = new ArrayList<String>();
        }
        return this.spRefId;
    }

    /**
     * Gets the value of the depAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdFrom }
     *     
     */
    public DepAcctIdFrom getDepAcctIdFrom() {
        return depAcctIdFrom;
    }

    /**
     * Sets the value of the depAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdFrom }
     *     
     */
    public void setDepAcctIdFrom(DepAcctIdFrom value) {
        this.depAcctIdFrom = value;
    }

    /**
     * Gets the value of the cardAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdFrom }
     *     
     */
    public CardAcctIdFrom getCardAcctIdFrom() {
        return cardAcctIdFrom;
    }

    /**
     * Sets the value of the cardAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdFrom }
     *     
     */
    public void setCardAcctIdFrom(CardAcctIdFrom value) {
        this.cardAcctIdFrom = value;
    }

    /**
     * Gets the value of the loanAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctIdFrom }
     *     
     */
    public LoanAcctIdFrom getLoanAcctIdFrom() {
        return loanAcctIdFrom;
    }

    /**
     * Sets the value of the loanAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctIdFrom }
     *     
     */
    public void setLoanAcctIdFrom(LoanAcctIdFrom value) {
        this.loanAcctIdFrom = value;
    }

    /**
     * Gets the value of the depAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdTo }
     *     
     */
    public DepAcctIdTo getDepAcctIdTo() {
        return depAcctIdTo;
    }

    /**
     * Sets the value of the depAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdTo }
     *     
     */
    public void setDepAcctIdTo(DepAcctIdTo value) {
        this.depAcctIdTo = value;
    }

    /**
     * Gets the value of the cardAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdTo }
     *     
     */
    public CardAcctIdTo getCardAcctIdTo() {
        return cardAcctIdTo;
    }

    /**
     * Sets the value of the cardAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdTo }
     *     
     */
    public void setCardAcctIdTo(CardAcctIdTo value) {
        this.cardAcctIdTo = value;
    }

    /**
     * Gets the value of the loanAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctIdTo }
     *     
     */
    public LoanAcctIdTo getLoanAcctIdTo() {
        return loanAcctIdTo;
    }

    /**
     * Sets the value of the loanAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctIdTo }
     *     
     */
    public void setLoanAcctIdTo(LoanAcctIdTo value) {
        this.loanAcctIdTo = value;
    }

    /**
     * Gets the value of the xferStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getXferStatusCode() {
        if (xferStatusCode == null) {
            xferStatusCode = new ArrayList<String>();
        }
        return this.xferStatusCode;
    }

    /**
     * Gets the value of the selRangeDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link SelRangeDtType }
     *     
     */
    public SelRangeDtType getSelRangeDueDt() {
        return selRangeDueDt;
    }

    /**
     * Sets the value of the selRangeDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeDtType }
     *     
     */
    public void setSelRangeDueDt(SelRangeDtType value) {
        this.selRangeDueDt = value;
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
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the xferRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XferRec }
     * 
     * 
     */
    public List<XferRec> getXferRec() {
        if (xferRec == null) {
            xferRec = new ArrayList<XferRec>();
        }
        return this.xferRec;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
