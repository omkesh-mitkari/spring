
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
 *         &lt;element name="EffectiveDate" type="{http://aciworldwide.com/S1Adapter}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDate" type="{http://aciworldwide.com/S1Adapter}PostedDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TransactionAmount" minOccurs="0"&gt;
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
 *         &lt;element name="PrincipalAmount" minOccurs="0"&gt;
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
 *         &lt;element name="InterestAmount" minOccurs="0"&gt;
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
 *         &lt;element name="EscrowAmount" minOccurs="0"&gt;
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
 *         &lt;element name="Fees" minOccurs="0"&gt;
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
 *         &lt;element name="PrincipalBalance" minOccurs="0"&gt;
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
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "effectiveDate",
    "postDate",
    "transactionAmount",
    "principalAmount",
    "interestAmount",
    "escrowAmount",
    "fees",
    "principalBalance",
    "description"
})
@XmlRootElement(name = "LoanAcctNoteHistoryDetailRec")
public class LoanAcctNoteHistoryDetailRec {

    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "PostDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postDate;
    @XmlElement(name = "TransactionAmount")
    protected LoanAcctNoteHistoryDetailRec.TransactionAmount transactionAmount;
    @XmlElement(name = "PrincipalAmount")
    protected LoanAcctNoteHistoryDetailRec.PrincipalAmount principalAmount;
    @XmlElement(name = "InterestAmount")
    protected LoanAcctNoteHistoryDetailRec.InterestAmount interestAmount;
    @XmlElement(name = "EscrowAmount")
    protected LoanAcctNoteHistoryDetailRec.EscrowAmount escrowAmount;
    @XmlElement(name = "Fees")
    protected LoanAcctNoteHistoryDetailRec.Fees fees;
    @XmlElement(name = "PrincipalBalance")
    protected LoanAcctNoteHistoryDetailRec.PrincipalBalance principalBalance;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the postDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostDate(XMLGregorianCalendar value) {
        this.postDate = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctNoteHistoryDetailRec.TransactionAmount }
     *     
     */
    public LoanAcctNoteHistoryDetailRec.TransactionAmount getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctNoteHistoryDetailRec.TransactionAmount }
     *     
     */
    public void setTransactionAmount(LoanAcctNoteHistoryDetailRec.TransactionAmount value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctNoteHistoryDetailRec.PrincipalAmount }
     *     
     */
    public LoanAcctNoteHistoryDetailRec.PrincipalAmount getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctNoteHistoryDetailRec.PrincipalAmount }
     *     
     */
    public void setPrincipalAmount(LoanAcctNoteHistoryDetailRec.PrincipalAmount value) {
        this.principalAmount = value;
    }

    /**
     * Gets the value of the interestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctNoteHistoryDetailRec.InterestAmount }
     *     
     */
    public LoanAcctNoteHistoryDetailRec.InterestAmount getInterestAmount() {
        return interestAmount;
    }

    /**
     * Sets the value of the interestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctNoteHistoryDetailRec.InterestAmount }
     *     
     */
    public void setInterestAmount(LoanAcctNoteHistoryDetailRec.InterestAmount value) {
        this.interestAmount = value;
    }

    /**
     * Gets the value of the escrowAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctNoteHistoryDetailRec.EscrowAmount }
     *     
     */
    public LoanAcctNoteHistoryDetailRec.EscrowAmount getEscrowAmount() {
        return escrowAmount;
    }

    /**
     * Sets the value of the escrowAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctNoteHistoryDetailRec.EscrowAmount }
     *     
     */
    public void setEscrowAmount(LoanAcctNoteHistoryDetailRec.EscrowAmount value) {
        this.escrowAmount = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctNoteHistoryDetailRec.Fees }
     *     
     */
    public LoanAcctNoteHistoryDetailRec.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctNoteHistoryDetailRec.Fees }
     *     
     */
    public void setFees(LoanAcctNoteHistoryDetailRec.Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the principalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctNoteHistoryDetailRec.PrincipalBalance }
     *     
     */
    public LoanAcctNoteHistoryDetailRec.PrincipalBalance getPrincipalBalance() {
        return principalBalance;
    }

    /**
     * Sets the value of the principalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctNoteHistoryDetailRec.PrincipalBalance }
     *     
     */
    public void setPrincipalBalance(LoanAcctNoteHistoryDetailRec.PrincipalBalance value) {
        this.principalBalance = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
    public static class EscrowAmount {

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
    public static class Fees {

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
    public static class InterestAmount {

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
    public static class PrincipalAmount {

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
    public static class PrincipalBalance {

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
    public static class TransactionAmount {

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
