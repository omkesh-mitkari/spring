
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastDepDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastDepCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepMatureDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NSFDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InterestDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Term" minOccurs="0"/&gt;
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
    "lastDepDt",
    "lastDepCurAmt",
    "depMatureDt",
    "nsfDetails",
    "interestDetails",
    "term"
})
@XmlRootElement(name = "DepAcctRec")
public class DepAcctRec {

    @XmlElement(name = "LastDepDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDepDt;
    @XmlElement(name = "LastDepCurAmt")
    protected LastDepCurAmt lastDepCurAmt;
    @XmlElement(name = "DepMatureDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depMatureDt;
    @XmlElement(name = "NSFDetails")
    protected NSFDetailsType nsfDetails;
    @XmlElement(name = "InterestDetails")
    protected InterestDetailsType interestDetails;
    @XmlElement(name = "Term")
    protected Term term;

    /**
     * Gets the value of the lastDepDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDepDt() {
        return lastDepDt;
    }

    /**
     * Sets the value of the lastDepDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDepDt(XMLGregorianCalendar value) {
        this.lastDepDt = value;
    }

    /**
     * Gets the value of the lastDepCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastDepCurAmt }
     *     
     */
    public LastDepCurAmt getLastDepCurAmt() {
        return lastDepCurAmt;
    }

    /**
     * Sets the value of the lastDepCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastDepCurAmt }
     *     
     */
    public void setLastDepCurAmt(LastDepCurAmt value) {
        this.lastDepCurAmt = value;
    }

    /**
     * Gets the value of the depMatureDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepMatureDt() {
        return depMatureDt;
    }

    /**
     * Sets the value of the depMatureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepMatureDt(XMLGregorianCalendar value) {
        this.depMatureDt = value;
    }

    /**
     * Gets the value of the nsfDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NSFDetailsType }
     *     
     */
    public NSFDetailsType getNSFDetails() {
        return nsfDetails;
    }

    /**
     * Sets the value of the nsfDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFDetailsType }
     *     
     */
    public void setNSFDetails(NSFDetailsType value) {
        this.nsfDetails = value;
    }

    /**
     * Gets the value of the interestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InterestDetailsType }
     *     
     */
    public InterestDetailsType getInterestDetails() {
        return interestDetails;
    }

    /**
     * Sets the value of the interestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestDetailsType }
     *     
     */
    public void setInterestDetails(InterestDetailsType value) {
        this.interestDetails = value;
    }

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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
