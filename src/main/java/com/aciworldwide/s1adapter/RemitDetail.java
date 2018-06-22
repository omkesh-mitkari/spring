
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceReceiver" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceSender" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtSummAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillRefInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillingAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "invoiceReceiver",
    "invoiceSender",
    "curAmt",
    "pmtSummAmt",
    "billRefInfo",
    "billId",
    "memo",
    "billingAcct",
    "invoiceInfo"
})
@XmlRootElement(name = "RemitDetail")
public class RemitDetail {

    @XmlElement(name = "InvoiceReceiver")
    protected InvoiceReceiver invoiceReceiver;
    @XmlElement(name = "InvoiceSender")
    protected InvoiceSender invoiceSender;
    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;
    @XmlElement(name = "PmtSummAmt")
    protected List<PmtSummAmt> pmtSummAmt;
    @XmlElement(name = "BillRefInfo")
    protected String billRefInfo;
    @XmlElement(name = "BillId")
    protected String billId;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "BillingAcct")
    protected String billingAcct;
    @XmlElement(name = "InvoiceInfo")
    protected List<InvoiceInfo> invoiceInfo;

    /**
     * Gets the value of the invoiceReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReceiver }
     *     
     */
    public InvoiceReceiver getInvoiceReceiver() {
        return invoiceReceiver;
    }

    /**
     * Sets the value of the invoiceReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReceiver }
     *     
     */
    public void setInvoiceReceiver(InvoiceReceiver value) {
        this.invoiceReceiver = value;
    }

    /**
     * Gets the value of the invoiceSender property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSender }
     *     
     */
    public InvoiceSender getInvoiceSender() {
        return invoiceSender;
    }

    /**
     * Sets the value of the invoiceSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSender }
     *     
     */
    public void setInvoiceSender(InvoiceSender value) {
        this.invoiceSender = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
