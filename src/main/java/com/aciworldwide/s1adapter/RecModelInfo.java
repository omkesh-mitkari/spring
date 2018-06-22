
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Freq"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}NumInsts"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FinalPrcDt"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FinalDueDt"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}InitialCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FinalCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextPmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SkipNextN" minOccurs="0"/&gt;
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
    "freq",
    "numInsts",
    "finalPrcDt",
    "finalDueDt",
    "initialCurAmt",
    "finalCurAmt",
    "nickname",
    "nextPmtDt",
    "skipNextN"
})
@XmlRootElement(name = "RecModelInfo")
public class RecModelInfo {

    @XmlElement(name = "Freq", required = true)
    protected String freq;
    @XmlElement(name = "NumInsts")
    protected Long numInsts;
    @XmlElement(name = "FinalPrcDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalPrcDt;
    @XmlElement(name = "FinalDueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalDueDt;
    @XmlElement(name = "InitialCurAmt")
    protected InitialCurAmt initialCurAmt;
    @XmlElement(name = "FinalCurAmt")
    protected FinalCurAmt finalCurAmt;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "NextPmtDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextPmtDt;
    @XmlElement(name = "SkipNextN")
    protected Long skipNextN;

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreq() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreq(String value) {
        this.freq = value;
    }

    /**
     * Gets the value of the numInsts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumInsts() {
        return numInsts;
    }

    /**
     * Sets the value of the numInsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumInsts(Long value) {
        this.numInsts = value;
    }

    /**
     * Gets the value of the finalPrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalPrcDt() {
        return finalPrcDt;
    }

    /**
     * Sets the value of the finalPrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalPrcDt(XMLGregorianCalendar value) {
        this.finalPrcDt = value;
    }

    /**
     * Gets the value of the finalDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalDueDt() {
        return finalDueDt;
    }

    /**
     * Sets the value of the finalDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalDueDt(XMLGregorianCalendar value) {
        this.finalDueDt = value;
    }

    /**
     * Gets the value of the initialCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InitialCurAmt }
     *     
     */
    public InitialCurAmt getInitialCurAmt() {
        return initialCurAmt;
    }

    /**
     * Sets the value of the initialCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialCurAmt }
     *     
     */
    public void setInitialCurAmt(InitialCurAmt value) {
        this.initialCurAmt = value;
    }

    /**
     * Gets the value of the finalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinalCurAmt }
     *     
     */
    public FinalCurAmt getFinalCurAmt() {
        return finalCurAmt;
    }

    /**
     * Sets the value of the finalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalCurAmt }
     *     
     */
    public void setFinalCurAmt(FinalCurAmt value) {
        this.finalCurAmt = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the nextPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPmtDt() {
        return nextPmtDt;
    }

    /**
     * Sets the value of the nextPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPmtDt(XMLGregorianCalendar value) {
        this.nextPmtDt = value;
    }

    /**
     * Gets the value of the skipNextN property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSkipNextN() {
        return skipNextN;
    }

    /**
     * Sets the value of the skipNextN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSkipNextN(Long value) {
        this.skipNextN = value;
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
