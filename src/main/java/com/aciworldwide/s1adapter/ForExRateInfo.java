
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ConvCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurRate"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurConvertRule"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Fee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CSPRefId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SPRefId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ValueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}QuotedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TranDt" minOccurs="0"/&gt;
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
    "curAmt",
    "convCurAmt",
    "curRate",
    "curConvertRule",
    "fee",
    "expDt",
    "cspRefId",
    "spRefId",
    "valueDt",
    "quotedDt",
    "tranDt"
})
@XmlRootElement(name = "ForExRateInfo")
public class ForExRateInfo {

    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;
    @XmlElement(name = "ConvCurAmt")
    protected CurrencyAmount convCurAmt;
    @XmlElement(name = "CurRate", required = true)
    protected BigDecimal curRate;
    @XmlElement(name = "CurConvertRule", required = true)
    protected String curConvertRule;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    @XmlElement(name = "ExpDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDt;
    @XmlElement(name = "CSPRefId")
    protected String cspRefId;
    @XmlElement(name = "SPRefId")
    protected String spRefId;
    @XmlElement(name = "ValueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valueDt;
    @XmlElement(name = "QuotedDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quotedDt;
    @XmlElement(name = "TranDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDt;

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
     * Gets the value of the convCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getConvCurAmt() {
        return convCurAmt;
    }

    /**
     * Sets the value of the convCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setConvCurAmt(CurrencyAmount value) {
        this.convCurAmt = value;
    }

    /**
     * Gets the value of the curRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurRate() {
        return curRate;
    }

    /**
     * Sets the value of the curRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurRate(BigDecimal value) {
        this.curRate = value;
    }

    /**
     * Gets the value of the curConvertRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurConvertRule() {
        return curConvertRule;
    }

    /**
     * Sets the value of the curConvertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurConvertRule(String value) {
        this.curConvertRule = value;
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
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDt(XMLGregorianCalendar value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the cspRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPRefId() {
        return cspRefId;
    }

    /**
     * Sets the value of the cspRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPRefId(String value) {
        this.cspRefId = value;
    }

    /**
     * Gets the value of the spRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefId() {
        return spRefId;
    }

    /**
     * Sets the value of the spRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefId(String value) {
        this.spRefId = value;
    }

    /**
     * Gets the value of the valueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDt() {
        return valueDt;
    }

    /**
     * Sets the value of the valueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDt(XMLGregorianCalendar value) {
        this.valueDt = value;
    }

    /**
     * Gets the value of the quotedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuotedDt() {
        return quotedDt;
    }

    /**
     * Sets the value of the quotedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuotedDt(XMLGregorianCalendar value) {
        this.quotedDt = value;
    }

    /**
     * Gets the value of the tranDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDt() {
        return tranDt;
    }

    /**
     * Sets the value of the tranDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDt(XMLGregorianCalendar value) {
        this.tranDt = value;
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
