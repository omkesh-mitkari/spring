
package com.aciworldwide.s1adapter;

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
 *         &lt;element name="BillDueDate" type="{http://aciworldwide.com/S1Adapter}DueDt_Type"/&gt;
 *         &lt;element name="BillAmount"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalBillNotPaid"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "billDueDate",
    "billAmount",
    "totalBillNotPaid"
})
@XmlRootElement(name = "LoanNoteBillRec")
public class LoanNoteBillRec {

    @XmlElement(name = "BillDueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDueDate;
    @XmlElement(name = "BillAmount", required = true)
    protected LoanNoteBillRec.BillAmount billAmount;
    @XmlElement(name = "TotalBillNotPaid", required = true)
    protected LoanNoteBillRec.TotalBillNotPaid totalBillNotPaid;

    /**
     * Gets the value of the billDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDueDate() {
        return billDueDate;
    }

    /**
     * Sets the value of the billDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDueDate(XMLGregorianCalendar value) {
        this.billDueDate = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LoanNoteBillRec.BillAmount }
     *     
     */
    public LoanNoteBillRec.BillAmount getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanNoteBillRec.BillAmount }
     *     
     */
    public void setBillAmount(LoanNoteBillRec.BillAmount value) {
        this.billAmount = value;
    }

    /**
     * Gets the value of the totalBillNotPaid property.
     * 
     * @return
     *     possible object is
     *     {@link LoanNoteBillRec.TotalBillNotPaid }
     *     
     */
    public LoanNoteBillRec.TotalBillNotPaid getTotalBillNotPaid() {
        return totalBillNotPaid;
    }

    /**
     * Sets the value of the totalBillNotPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanNoteBillRec.TotalBillNotPaid }
     *     
     */
    public void setTotalBillNotPaid(LoanNoteBillRec.TotalBillNotPaid value) {
        this.totalBillNotPaid = value;
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
     *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
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
        "curAmt"
    })
    public static class BillAmount {

        @XmlElement(name = "CurAmt", required = true)
        protected CurAmt curAmt;

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
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
        }

    }


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
     *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
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
        "curAmt"
    })
    public static class TotalBillNotPaid {

        @XmlElement(name = "CurAmt", required = true)
        protected CurAmt curAmt;

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
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
        }

    }

}
