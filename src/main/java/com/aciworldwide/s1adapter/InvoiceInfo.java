
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceNum"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RefInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TotalCurAmt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PaidCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EffDt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceVouchNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Fee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoicePremium" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Discount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TaxInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceAdj" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "invoiceType",
    "invoiceNum",
    "refInfo",
    "totalCurAmt",
    "paidCurAmt",
    "effDt",
    "desc",
    "invoiceVouchNum",
    "fee",
    "invoicePremium",
    "discount",
    "taxInfo",
    "invoiceAdj",
    "invoiceLineItem"
})
@XmlRootElement(name = "InvoiceInfo")
public class InvoiceInfo {

    @XmlElement(name = "InvoiceType")
    protected String invoiceType;
    @XmlElement(name = "InvoiceNum", required = true)
    protected String invoiceNum;
    @XmlElement(name = "RefInfo")
    protected List<RefInfo> refInfo;
    @XmlElement(name = "TotalCurAmt", required = true)
    protected TotalCurAmt totalCurAmt;
    @XmlElement(name = "PaidCurAmt")
    protected PaidCurAmt paidCurAmt;
    @XmlElement(name = "EffDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "InvoiceVouchNum")
    protected String invoiceVouchNum;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    @XmlElement(name = "InvoicePremium")
    protected InvoicePremium invoicePremium;
    @XmlElement(name = "Discount")
    protected Discount discount;
    @XmlElement(name = "TaxInfo")
    protected TaxInfo taxInfo;
    @XmlElement(name = "InvoiceAdj")
    protected InvoiceAdj invoiceAdj;
    @XmlElement(name = "InvoiceLineItem")
    protected List<InvoiceLineItem> invoiceLineItem;

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNum(String value) {
        this.invoiceNum = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfo }
     * 
     * 
     */
    public List<RefInfo> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<RefInfo>();
        }
        return this.refInfo;
    }

    /**
     * Gets the value of the totalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmt }
     *     
     */
    public TotalCurAmt getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Sets the value of the totalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmt }
     *     
     */
    public void setTotalCurAmt(TotalCurAmt value) {
        this.totalCurAmt = value;
    }

    /**
     * Gets the value of the paidCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaidCurAmt }
     *     
     */
    public PaidCurAmt getPaidCurAmt() {
        return paidCurAmt;
    }

    /**
     * Sets the value of the paidCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidCurAmt }
     *     
     */
    public void setPaidCurAmt(PaidCurAmt value) {
        this.paidCurAmt = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDt(XMLGregorianCalendar value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the invoiceVouchNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceVouchNum() {
        return invoiceVouchNum;
    }

    /**
     * Sets the value of the invoiceVouchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceVouchNum(String value) {
        this.invoiceVouchNum = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<Fee>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the invoicePremium property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePremium }
     *     
     */
    public InvoicePremium getInvoicePremium() {
        return invoicePremium;
    }

    /**
     * Sets the value of the invoicePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePremium }
     *     
     */
    public void setInvoicePremium(InvoicePremium value) {
        this.invoicePremium = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setDiscount(Discount value) {
        this.discount = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfo }
     *     
     */
    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Sets the value of the taxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfo }
     *     
     */
    public void setTaxInfo(TaxInfo value) {
        this.taxInfo = value;
    }

    /**
     * Gets the value of the invoiceAdj property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAdj }
     *     
     */
    public InvoiceAdj getInvoiceAdj() {
        return invoiceAdj;
    }

    /**
     * Sets the value of the invoiceAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAdj }
     *     
     */
    public void setInvoiceAdj(InvoiceAdj value) {
        this.invoiceAdj = value;
    }

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItem }
     * 
     * 
     */
    public List<InvoiceLineItem> getInvoiceLineItem() {
        if (invoiceLineItem == null) {
            invoiceLineItem = new ArrayList<InvoiceLineItem>();
        }
        return this.invoiceLineItem;
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
