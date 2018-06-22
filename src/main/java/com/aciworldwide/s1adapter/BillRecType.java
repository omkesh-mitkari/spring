
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
 * <p>Java class for BillRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillPmtStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceInfo" minOccurs="0"/&gt;
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
@XmlType(name = "BillRec_Type", propOrder = {
    "billId",
    "billInfo",
    "billStatus",
    "billPmtStatus",
    "invoiceInfo",
    "tunneledData"
})
public class BillRecType {

    @XmlElement(name = "BillId")
    protected String billId;
    @XmlElement(name = "BillInfo")
    protected BillInfoType billInfo;
    @XmlElement(name = "BillStatus")
    protected BillStatusType billStatus;
    @XmlElement(name = "BillPmtStatus")
    protected BillPmtStatusType billPmtStatus;
    @XmlElement(name = "InvoiceInfo")
    protected InvoiceInfo invoiceInfo;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

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
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillInfoType }
     *     
     */
    public BillInfoType getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInfoType }
     *     
     */
    public void setBillInfo(BillInfoType value) {
        this.billInfo = value;
    }

    /**
     * Gets the value of the billStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillStatusType }
     *     
     */
    public BillStatusType getBillStatus() {
        return billStatus;
    }

    /**
     * Sets the value of the billStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatusType }
     *     
     */
    public void setBillStatus(BillStatusType value) {
        this.billStatus = value;
    }

    /**
     * Gets the value of the billPmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtStatusType }
     *     
     */
    public BillPmtStatusType getBillPmtStatus() {
        return billPmtStatus;
    }

    /**
     * Sets the value of the billPmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtStatusType }
     *     
     */
    public void setBillPmtStatus(BillPmtStatusType value) {
        this.billPmtStatus = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfo }
     *     
     */
    public InvoiceInfo getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Sets the value of the invoiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfo }
     *     
     */
    public void setInvoiceInfo(InvoiceInfo value) {
        this.invoiceInfo = value;
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
