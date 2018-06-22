
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemitInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SettlementInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkInfo" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeInfo"/&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}BillRefInfo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}BillId" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtId" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}BillingAcct" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtSummAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RemitDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtLegalRpt" minOccurs="0"/&gt;
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
    "remitInstruction",
    "settlementInfo",
    "chkInfo",
    "custPayeeId",
    "custPayeeInfo",
    "billRefInfo",
    "billId",
    "pmtId",
    "memo",
    "billingAcct",
    "curAmt",
    "pmtSummAmt",
    "invoiceInfo",
    "remitDetail",
    "pmtLegalRpt"
})
@XmlRootElement(name = "RemitInfo")
public class RemitInfo {

    @XmlElement(name = "RemitInstruction")
    protected RemitInstruction remitInstruction;
    @XmlElement(name = "SettlementInfo")
    protected SettlementInfo settlementInfo;
    @XmlElement(name = "ChkInfo")
    protected ChkInfo chkInfo;
    @XmlElement(name = "CustPayeeId")
    protected String custPayeeId;
    @XmlElement(name = "CustPayeeInfo")
    protected CustPayeeInfo custPayeeInfo;
    @XmlElement(name = "BillRefInfo")
    protected String billRefInfo;
    @XmlElement(name = "BillId")
    protected String billId;
    @XmlElement(name = "PmtId")
    protected String pmtId;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "BillingAcct")
    protected String billingAcct;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmt curAmt;
    @XmlElement(name = "PmtSummAmt")
    protected List<PmtSummAmt> pmtSummAmt;
    @XmlElement(name = "InvoiceInfo")
    protected List<InvoiceInfo> invoiceInfo;
    @XmlElement(name = "RemitDetail")
    protected List<RemitDetail> remitDetail;
    @XmlElement(name = "PmtLegalRpt")
    protected PmtLegalRpt pmtLegalRpt;

    /**
     * Gets the value of the remitInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link RemitInstruction }
     *     
     */
    public RemitInstruction getRemitInstruction() {
        return remitInstruction;
    }

    /**
     * Sets the value of the remitInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitInstruction }
     *     
     */
    public void setRemitInstruction(RemitInstruction value) {
        this.remitInstruction = value;
    }

    /**
     * Gets the value of the settlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInfo }
     *     
     */
    public SettlementInfo getSettlementInfo() {
        return settlementInfo;
    }

    /**
     * Sets the value of the settlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInfo }
     *     
     */
    public void setSettlementInfo(SettlementInfo value) {
        this.settlementInfo = value;
    }

    /**
     * Gets the value of the chkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChkInfo }
     *     
     */
    public ChkInfo getChkInfo() {
        return chkInfo;
    }

    /**
     * Sets the value of the chkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkInfo }
     *     
     */
    public void setChkInfo(ChkInfo value) {
        this.chkInfo = value;
    }

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
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillId(String value) {
        this.billId = value;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtId(String value) {
        this.pmtId = value;
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
     * Gets the value of the billingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAcct() {
        return billingAcct;
    }

    /**
     * Sets the value of the billingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAcct(String value) {
        this.billingAcct = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmt }
     *     
     */
    public CurAmt getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmt }
     *     
     */
    public void setCurAmt(CurAmt value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the pmtSummAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtSummAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtSummAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtSummAmt }
     * 
     * 
     */
    public List<PmtSummAmt> getPmtSummAmt() {
        if (pmtSummAmt == null) {
            pmtSummAmt = new ArrayList<PmtSummAmt>();
        }
        return this.pmtSummAmt;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInfo }
     * 
     * 
     */
    public List<InvoiceInfo> getInvoiceInfo() {
        if (invoiceInfo == null) {
            invoiceInfo = new ArrayList<InvoiceInfo>();
        }
        return this.invoiceInfo;
    }

    /**
     * Gets the value of the remitDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remitDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemitDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemitDetail }
     * 
     * 
     */
    public List<RemitDetail> getRemitDetail() {
        if (remitDetail == null) {
            remitDetail = new ArrayList<RemitDetail>();
        }
        return this.remitDetail;
    }

    /**
     * Gets the value of the pmtLegalRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtLegalRpt }
     *     
     */
    public PmtLegalRpt getPmtLegalRpt() {
        return pmtLegalRpt;
    }

    /**
     * Sets the value of the pmtLegalRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtLegalRpt }
     *     
     */
    public void setPmtLegalRpt(PmtLegalRpt value) {
        this.pmtLegalRpt = value;
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
