
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrigDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RegPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastPmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PastDuePmtCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PastDuePmtAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemainingPmtCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextPrincipalPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextInterestPmtCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextEscPmtCurAmt" minOccurs="0"/&gt;
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
    "origDt",
    "regPmtCurAmt",
    "dueDt",
    "nextPmtCurAmt",
    "lastPmtDt",
    "lastPmtCurAmt",
    "pastDuePmtCount",
    "pastDuePmtAmt",
    "remainingPmtCount",
    "nextPrincipalPmtCurAmt",
    "nextInterestPmtCurAmt",
    "nextEscPmtCurAmt"
})
@XmlRootElement(name = "LoanInfoCommon")
public class LoanInfoCommon {

    @XmlElement(name = "OrigDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origDt;
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
    @XmlElement(name = "RemainingPmtCount")
    protected Long remainingPmtCount;
    @XmlElement(name = "NextPrincipalPmtCurAmt")
    protected NextPrincipalPmtCurAmt nextPrincipalPmtCurAmt;
    @XmlElement(name = "NextInterestPmtCurAmt")
    protected NextInterestPmtCurAmt nextInterestPmtCurAmt;
    @XmlElement(name = "NextEscPmtCurAmt")
    protected NextEscPmtCurAmt nextEscPmtCurAmt;

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
     * Gets the value of the remainingPmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingPmtCount() {
        return remainingPmtCount;
    }

    /**
     * Sets the value of the remainingPmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingPmtCount(Long value) {
        this.remainingPmtCount = value;
    }

    /**
     * Gets the value of the nextPrincipalPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NextPrincipalPmtCurAmt }
     *     
     */
    public NextPrincipalPmtCurAmt getNextPrincipalPmtCurAmt() {
        return nextPrincipalPmtCurAmt;
    }

    /**
     * Sets the value of the nextPrincipalPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextPrincipalPmtCurAmt }
     *     
     */
    public void setNextPrincipalPmtCurAmt(NextPrincipalPmtCurAmt value) {
        this.nextPrincipalPmtCurAmt = value;
    }

    /**
     * Gets the value of the nextInterestPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NextInterestPmtCurAmt }
     *     
     */
    public NextInterestPmtCurAmt getNextInterestPmtCurAmt() {
        return nextInterestPmtCurAmt;
    }

    /**
     * Sets the value of the nextInterestPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextInterestPmtCurAmt }
     *     
     */
    public void setNextInterestPmtCurAmt(NextInterestPmtCurAmt value) {
        this.nextInterestPmtCurAmt = value;
    }

    /**
     * Gets the value of the nextEscPmtCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NextEscPmtCurAmt }
     *     
     */
    public NextEscPmtCurAmt getNextEscPmtCurAmt() {
        return nextEscPmtCurAmt;
    }

    /**
     * Sets the value of the nextEscPmtCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextEscPmtCurAmt }
     *     
     */
    public void setNextEscPmtCurAmt(NextEscPmtCurAmt value) {
        this.nextEscPmtCurAmt = value;
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
