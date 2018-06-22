
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
 * <p>Java class for PmtInqRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtInqRs_Type"&gt;
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
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctIdFrom"/&gt;
 *             &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctIdFrom"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Category" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkClrDt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FIDebitTrcNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FICreditTrcNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}BillingAcct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}StdPayeeId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Nickname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeDueDt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangePrcDt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeCurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DeliveryMethod" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CSPRefId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SPRefId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}IncToken" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}IncHistory" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtRec" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PmtInqRs_Type", propOrder = {
    "status",
    "rqUID",
    "msgRqHdr",
    "msgRsHdr",
    "asyncRqUID",
    "routeInfo",
    "custId",
    "recCtrlOut",
    "pmtType",
    "pmtId",
    "recPmtId",
    "depAcctIdFrom",
    "cardAcctIdFrom",
    "category",
    "memo",
    "chkNum",
    "chkClrDt",
    "fiDebitTrcNum",
    "fiCreditTrcNum",
    "pmtMethod",
    "custPayeeId",
    "billingAcct",
    "name",
    "stdPayeeId",
    "nickname",
    "pmtStatusCode",
    "selRangeDueDt",
    "selRangePrcDt",
    "selRangeCurAmt",
    "deliveryMethod",
    "cspRefId",
    "spRefId",
    "incToken",
    "incHistory",
    "pmtRec",
    "token",
    "tunneledData"
})
public class PmtInqRsType {

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
    @XmlElement(name = "PmtType")
    protected List<String> pmtType;
    @XmlElement(name = "PmtId")
    protected List<String> pmtId;
    @XmlElement(name = "RecPmtId")
    protected List<String> recPmtId;
    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdFrom depAcctIdFrom;
    @XmlElement(name = "CardAcctIdFrom")
    protected CardAcctIdFrom cardAcctIdFrom;
    @XmlElement(name = "Category")
    protected List<String> category;
    @XmlElement(name = "Memo")
    protected List<String> memo;
    @XmlElement(name = "ChkNum")
    protected List<String> chkNum;
    @XmlElement(name = "ChkClrDt")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> chkClrDt;
    @XmlElement(name = "FIDebitTrcNum")
    protected List<String> fiDebitTrcNum;
    @XmlElement(name = "FICreditTrcNum")
    protected List<String> fiCreditTrcNum;
    @XmlElement(name = "PmtMethod")
    protected List<String> pmtMethod;
    @XmlElement(name = "CustPayeeId")
    protected List<String> custPayeeId;
    @XmlElement(name = "BillingAcct")
    protected List<String> billingAcct;
    @XmlElement(name = "Name")
    protected List<String> name;
    @XmlElement(name = "StdPayeeId")
    protected List<StdPayeeId> stdPayeeId;
    @XmlElement(name = "Nickname")
    protected List<String> nickname;
    @XmlElement(name = "PmtStatusCode")
    protected List<String> pmtStatusCode;
    @XmlElement(name = "SelRangeDueDt")
    protected SelRangeDtType selRangeDueDt;
    @XmlElement(name = "SelRangePrcDt")
    protected SelRangeDtType selRangePrcDt;
    @XmlElement(name = "SelRangeCurAmt")
    protected SelRangeCurAmt selRangeCurAmt;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "CSPRefId")
    protected List<String> cspRefId;
    @XmlElement(name = "SPRefId")
    protected List<String> spRefId;
    @XmlElement(name = "IncToken")
    protected Boolean incToken;
    @XmlElement(name = "IncHistory")
    protected Boolean incHistory;
    @XmlElement(name = "PmtRec")
    protected List<PmtRec> pmtRec;
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
     * Gets the value of the pmtType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtType() {
        if (pmtType == null) {
            pmtType = new ArrayList<String>();
        }
        return this.pmtType;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtId() {
        if (pmtId == null) {
            pmtId = new ArrayList<String>();
        }
        return this.pmtId;
    }

    /**
     * Gets the value of the recPmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recPmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecPmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecPmtId() {
        if (recPmtId == null) {
            recPmtId = new ArrayList<String>();
        }
        return this.recPmtId;
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
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategory() {
        if (category == null) {
            category = new ArrayList<String>();
        }
        return this.category;
    }

    /**
     * Gets the value of the memo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMemo() {
        if (memo == null) {
            memo = new ArrayList<String>();
        }
        return this.memo;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChkNum() {
        if (chkNum == null) {
            chkNum = new ArrayList<String>();
        }
        return this.chkNum;
    }

    /**
     * Gets the value of the chkClrDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkClrDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkClrDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getChkClrDt() {
        if (chkClrDt == null) {
            chkClrDt = new ArrayList<XMLGregorianCalendar>();
        }
        return this.chkClrDt;
    }

    /**
     * Gets the value of the fiDebitTrcNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiDebitTrcNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIDebitTrcNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFIDebitTrcNum() {
        if (fiDebitTrcNum == null) {
            fiDebitTrcNum = new ArrayList<String>();
        }
        return this.fiDebitTrcNum;
    }

    /**
     * Gets the value of the fiCreditTrcNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiCreditTrcNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFICreditTrcNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFICreditTrcNum() {
        if (fiCreditTrcNum == null) {
            fiCreditTrcNum = new ArrayList<String>();
        }
        return this.fiCreditTrcNum;
    }

    /**
     * Gets the value of the pmtMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtMethod() {
        if (pmtMethod == null) {
            pmtMethod = new ArrayList<String>();
        }
        return this.pmtMethod;
    }

    /**
     * Gets the value of the custPayeeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custPayeeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustPayeeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustPayeeId() {
        if (custPayeeId == null) {
            custPayeeId = new ArrayList<String>();
        }
        return this.custPayeeId;
    }

    /**
     * Gets the value of the billingAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillingAcct() {
        if (billingAcct == null) {
            billingAcct = new ArrayList<String>();
        }
        return this.billingAcct;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Gets the value of the stdPayeeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdPayeeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdPayeeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StdPayeeId }
     * 
     * 
     */
    public List<StdPayeeId> getStdPayeeId() {
        if (stdPayeeId == null) {
            stdPayeeId = new ArrayList<StdPayeeId>();
        }
        return this.stdPayeeId;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nickname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNickname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNickname() {
        if (nickname == null) {
            nickname = new ArrayList<String>();
        }
        return this.nickname;
    }

    /**
     * Gets the value of the pmtStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtStatusCode() {
        if (pmtStatusCode == null) {
            pmtStatusCode = new ArrayList<String>();
        }
        return this.pmtStatusCode;
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
     * Gets the value of the selRangePrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link SelRangeDtType }
     *     
     */
    public SelRangeDtType getSelRangePrcDt() {
        return selRangePrcDt;
    }

    /**
     * Sets the value of the selRangePrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelRangeDtType }
     *     
     */
    public void setSelRangePrcDt(SelRangeDtType value) {
        this.selRangePrcDt = value;
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
     * Gets the value of the incToken property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncToken() {
        return incToken;
    }

    /**
     * Sets the value of the incToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncToken(Boolean value) {
        this.incToken = value;
    }

    /**
     * Gets the value of the incHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncHistory() {
        return incHistory;
    }

    /**
     * Sets the value of the incHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncHistory(Boolean value) {
        this.incHistory = value;
    }

    /**
     * Gets the value of the pmtRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtRec }
     * 
     * 
     */
    public List<PmtRec> getPmtRec() {
        if (pmtRec == null) {
            pmtRec = new ArrayList<PmtRec>();
        }
        return this.pmtRec;
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
