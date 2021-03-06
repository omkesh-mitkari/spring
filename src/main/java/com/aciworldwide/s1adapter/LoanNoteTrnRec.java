
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
 * S1 Added Aggregate - Loan Note Transaction Record
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctTrnRec"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AvailDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanTranBrkout" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NoteNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CommitmentNumber" minOccurs="0"/&gt;
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
    "bankAcctTrnRec",
    "acctBal",
    "availDt",
    "loanTranBrkout",
    "noteNumber",
    "commitmentNumber"
})
@XmlRootElement(name = "LoanNoteTrnRec")
public class LoanNoteTrnRec {

    @XmlElement(name = "BankAcctTrnRec", required = true)
    protected BankAcctTrnRec bankAcctTrnRec;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "AvailDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availDt;
    @XmlElement(name = "LoanTranBrkout")
    protected List<LoanTranBrkout> loanTranBrkout;
    @XmlElement(name = "NoteNumber")
    protected String noteNumber;
    @XmlElement(name = "CommitmentNumber")
    protected String commitmentNumber;

    /**
     * Gets the value of the bankAcctTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctTrnRec }
     *     
     */
    public BankAcctTrnRec getBankAcctTrnRec() {
        return bankAcctTrnRec;
    }

    /**
     * Sets the value of the bankAcctTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctTrnRec }
     *     
     */
    public void setBankAcctTrnRec(BankAcctTrnRec value) {
        this.bankAcctTrnRec = value;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBal }
     * 
     * 
     */
    public List<AcctBal> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBal>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the availDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailDt() {
        return availDt;
    }

    /**
     * Sets the value of the availDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailDt(XMLGregorianCalendar value) {
        this.availDt = value;
    }

    /**
     * Gets the value of the loanTranBrkout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanTranBrkout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanTranBrkout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanTranBrkout }
     * 
     * 
     */
    public List<LoanTranBrkout> getLoanTranBrkout() {
        if (loanTranBrkout == null) {
            loanTranBrkout = new ArrayList<LoanTranBrkout>();
        }
        return this.loanTranBrkout;
    }

    /**
     * Gets the value of the noteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteNumber() {
        return noteNumber;
    }

    /**
     * Sets the value of the noteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteNumber(String value) {
        this.noteNumber = value;
    }

    /**
     * Gets the value of the commitmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentNumber() {
        return commitmentNumber;
    }

    /**
     * Sets the value of the commitmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentNumber(String value) {
        this.commitmentNumber = value;
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
