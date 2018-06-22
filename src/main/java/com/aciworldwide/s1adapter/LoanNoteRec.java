
package com.aciworldwide.s1adapter;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NoteNumber"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CommitmentNumber" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentAmount" minOccurs="0"&gt;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ExtAcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrigDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}MatDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RegPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastPmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PastDuePmtCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PastDuePmtAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TotalDueCurAmt" minOccurs="0"/&gt;
 *         &lt;element name="CollateralDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextRateChangeDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanNoteBillRec" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "noteNumber",
    "commitmentNumber",
    "commitmentAmount",
    "acctBal",
    "extAcctBal",
    "origDt",
    "matDt",
    "regPmtCurAmt",
    "dueDt",
    "nextPmtCurAmt",
    "lastPmtDt",
    "lastPmtCurAmt",
    "pastDuePmtCount",
    "pastDuePmtAmt",
    "totalDueCurAmt",
    "collateralDesc",
    "rate",
    "nextRateChangeDate",
    "loanNoteBillRec"
})
@XmlRootElement(name = "LoanNoteRec")
public class LoanNoteRec {

    @XmlElement(name = "NoteNumber", required = true)
    protected String noteNumber;
    @XmlElement(name = "CommitmentNumber")
    protected String commitmentNumber;
    @XmlElement(name = "CommitmentAmount")
    protected LoanNoteRec.CommitmentAmount commitmentAmount;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "ExtAcctBal")
    protected List<ExtAcctBal> extAcctBal;
    @XmlElement(name = "OrigDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origDt;
    @XmlElement(name = "MatDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matDt;
    @XmlElement(name = "RegPmtCurAmt")
    protected RegPmtCurAmt regPmtCurAmt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "NextPmtCurAmt")
    protected NextPmtCurAmt nextPmtCurAmt;
    @XmlElement(name = "LastPmtDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPmtDt;
    @XmlElement(name = "LastPmtCurAmt")
    protected LastPmtCurAmt lastPmtCurAmt;
    @XmlElement(name = "PastDuePmtCount")
    protected Long pastDuePmtCount;
    @XmlElement(name = "PastDuePmtAmt")
    protected PastDuePmtAmt pastDuePmtAmt;
    @XmlElement(name = "TotalDueCurAmt")
    protected TotalDueCurAmt totalDueCurAmt;
    @XmlElement(name = "CollateralDesc")
    protected String collateralDesc;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "NextRateChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRateChangeDate;
    @XmlElement(name = "LoanNoteBillRec")
    protected List<LoanNoteBillRec> loanNoteBillRec;

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
     * Gets the value of the commitmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LoanNoteRec.CommitmentAmount }
     *     
     */
    public LoanNoteRec.CommitmentAmount getCommitmentAmount() {
        return commitmentAmount;
    }

    /**
     * Sets the value of the commitmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanNoteRec.CommitmentAmount }
     *     
     */
    public void setCommitmentAmount(LoanNoteRec.CommitmentAmount value) {
        this.commitmentAmount = value;
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
     * Gets the value of the extAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtAcctBal }
     * 
     * 
     */
    public List<ExtAcctBal> getExtAcctBal() {
        if (extAcctBal == null) {
            extAcctBal = new ArrayList<ExtAcctBal>();
        }
        return this.extAcctBal;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigDt(XMLGregorianCalendar value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatDt(XMLGregorianCalendar value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the regPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RegPmtCurAmt }
     *     
     */
    public RegPmtCurAmt getRegPmtCurAmt() {
        return regPmtCurAmt;
    }

    /**
     * Sets the value of the regPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPmtCurAmt }
     *     
     */
    public void setRegPmtCurAmt(RegPmtCurAmt value) {
        this.regPmtCurAmt = value;
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
     * Gets the value of the nextPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NextPmtCurAmt }
     *     
     */
    public NextPmtCurAmt getNextPmtCurAmt() {
        return nextPmtCurAmt;
    }

    /**
     * Sets the value of the nextPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextPmtCurAmt }
     *     
     */
    public void setNextPmtCurAmt(NextPmtCurAmt value) {
        this.nextPmtCurAmt = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPmtDt(XMLGregorianCalendar value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the lastPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtCurAmt }
     *     
     */
    public LastPmtCurAmt getLastPmtCurAmt() {
        return lastPmtCurAmt;
    }

    /**
     * Sets the value of the lastPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtCurAmt }
     *     
     */
    public void setLastPmtCurAmt(LastPmtCurAmt value) {
        this.lastPmtCurAmt = value;
    }

    /**
     * Gets the value of the pastDuePmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPastDuePmtCount() {
        return pastDuePmtCount;
    }

    /**
     * Sets the value of the pastDuePmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPastDuePmtCount(Long value) {
        this.pastDuePmtCount = value;
    }

    /**
     * Gets the value of the pastDuePmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PastDuePmtAmt }
     *     
     */
    public PastDuePmtAmt getPastDuePmtAmt() {
        return pastDuePmtAmt;
    }

    /**
     * Sets the value of the pastDuePmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDuePmtAmt }
     *     
     */
    public void setPastDuePmtAmt(PastDuePmtAmt value) {
        this.pastDuePmtAmt = value;
    }

    /**
     * Gets the value of the totalDueCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalDueCurAmt }
     *     
     */
    public TotalDueCurAmt getTotalDueCurAmt() {
        return totalDueCurAmt;
    }

    /**
     * Sets the value of the totalDueCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDueCurAmt }
     *     
     */
    public void setTotalDueCurAmt(TotalDueCurAmt value) {
        this.totalDueCurAmt = value;
    }

    /**
     * Gets the value of the collateralDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralDesc() {
        return collateralDesc;
    }

    /**
     * Sets the value of the collateralDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralDesc(String value) {
        this.collateralDesc = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the nextRateChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRateChangeDate() {
        return nextRateChangeDate;
    }

    /**
     * Sets the value of the nextRateChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRateChangeDate(XMLGregorianCalendar value) {
        this.nextRateChangeDate = value;
    }

    /**
     * Gets the value of the loanNoteBillRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanNoteBillRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanNoteBillRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanNoteBillRec }
     * 
     * 
     */
    public List<LoanNoteBillRec> getLoanNoteBillRec() {
        if (loanNoteBillRec == null) {
            loanNoteBillRec = new ArrayList<LoanNoteBillRec>();
        }
        return this.loanNoteBillRec;
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
    public static class CommitmentAmount {

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
