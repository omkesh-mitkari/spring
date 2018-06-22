
package com.aciworldwide.s1adapter;

import java.math.BigDecimal;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}MatDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanInfoCommon" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Rate" minOccurs="0"/&gt;
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
    "term",
    "matDt",
    "loanInfoCommon",
    "rate"
})
@XmlRootElement(name = "LoanAcctRec")
public class LoanAcctRec {

    @XmlElement(name = "Term")
    protected Term term;
    @XmlElement(name = "MatDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matDt;
    @XmlElement(name = "LoanInfoCommon")
    protected LoanInfoCommon loanInfoCommon;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link Term }
     *     
     */
    public Term getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link Term }
     *     
     */
    public void setTerm(Term value) {
        this.term = value;
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
     * Gets the value of the loanInfoCommon property.
     * 
     * @return
     *     possible object is
     *     {@link LoanInfoCommon }
     *     
     */
    public LoanInfoCommon getLoanInfoCommon() {
        return loanInfoCommon;
    }

    /**
     * Sets the value of the loanInfoCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanInfoCommon }
     *     
     */
    public void setLoanInfoCommon(LoanInfoCommon value) {
        this.loanInfoCommon = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
