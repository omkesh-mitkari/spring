
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
 * <p>Java class for BillInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PresAcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillSummAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CloseDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtInst" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NotifyReqd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ViewDtlPref" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StmtImage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillRefInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EarliestPmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillInfo_Type", propOrder = {
    "billType",
    "custId",
    "presAcctId",
    "memo",
    "billSummAmt",
    "dueDt",
    "billDt",
    "openDt",
    "closeDt",
    "pmtInst",
    "notifyReqd",
    "viewDtlPref",
    "stmtImage",
    "billRefInfo",
    "earliestPmtDt",
    "pmtPeriod"
})
public class BillInfoType {

    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "PresAcctId")
    protected PresAcctIdType presAcctId;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "BillSummAmt")
    protected List<BillSummAmtType> billSummAmt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "BillDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDt;
    @XmlElement(name = "OpenDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openDt;
    @XmlElement(name = "CloseDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDt;
    @XmlElement(name = "PmtInst")
    protected List<PmtInst> pmtInst;
    @XmlElement(name = "NotifyReqd")
    protected Boolean notifyReqd;
    @XmlElement(name = "ViewDtlPref")
    protected String viewDtlPref;
    @XmlElement(name = "StmtImage")
    protected StmtImageType stmtImage;
    @XmlElement(name = "BillRefInfo")
    protected String billRefInfo;
    @XmlElement(name = "EarliestPmtDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestPmtDt;
    @XmlElement(name = "PmtPeriod")
    protected String pmtPeriod;

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
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
     * Gets the value of the presAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link PresAcctIdType }
     *     
     */
    public PresAcctIdType getPresAcctId() {
        return presAcctId;
    }

    /**
     * Sets the value of the presAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresAcctIdType }
     *     
     */
    public void setPresAcctId(PresAcctIdType value) {
        this.presAcctId = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the billSummAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billSummAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillSummAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillSummAmtType }
     * 
     * 
     */
    public List<BillSummAmtType> getBillSummAmt() {
        if (billSummAmt == null) {
            billSummAmt = new ArrayList<BillSummAmtType>();
        }
        return this.billSummAmt;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the billDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDt() {
        return billDt;
    }

    /**
     * Sets the value of the billDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDt(XMLGregorianCalendar value) {
        this.billDt = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDt(XMLGregorianCalendar value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the closeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDt() {
        return closeDt;
    }

    /**
     * Sets the value of the closeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDt(XMLGregorianCalendar value) {
        this.closeDt = value;
    }

    /**
     * Gets the value of the pmtInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtInst }
     * 
     * 
     */
    public List<PmtInst> getPmtInst() {
        if (pmtInst == null) {
            pmtInst = new ArrayList<PmtInst>();
        }
        return this.pmtInst;
    }

    /**
     * Gets the value of the notifyReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyReqd() {
        return notifyReqd;
    }

    /**
     * Sets the value of the notifyReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyReqd(Boolean value) {
        this.notifyReqd = value;
    }

    /**
     * Gets the value of the viewDtlPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewDtlPref() {
        return viewDtlPref;
    }

    /**
     * Sets the value of the viewDtlPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewDtlPref(String value) {
        this.viewDtlPref = value;
    }

    /**
     * Gets the value of the stmtImage property.
     * 
     * @return
     *     possible object is
     *     {@link StmtImageType }
     *     
     */
    public StmtImageType getStmtImage() {
        return stmtImage;
    }

    /**
     * Sets the value of the stmtImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtImageType }
     *     
     */
    public void setStmtImage(StmtImageType value) {
        this.stmtImage = value;
    }

    /**
     * Gets the value of the billRefInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRefInfo() {
        return billRefInfo;
    }

    /**
     * Sets the value of the billRefInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRefInfo(String value) {
        this.billRefInfo = value;
    }

    /**
     * Gets the value of the earliestPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestPmtDt() {
        return earliestPmtDt;
    }

    /**
     * Sets the value of the earliestPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestPmtDt(XMLGregorianCalendar value) {
        this.earliestPmtDt = value;
    }

    /**
     * Gets the value of the pmtPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtPeriod() {
        return pmtPeriod;
    }

    /**
     * Sets the value of the pmtPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtPeriod(String value) {
        this.pmtPeriod = value;
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
