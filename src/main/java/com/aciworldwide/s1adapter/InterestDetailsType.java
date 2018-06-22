
package com.aciworldwide.s1adapter;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Interest details information on the account.
 * 
 * <p>Java class for InterestDetails_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestDetails_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IntCompMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IntDistMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IntPmtFreq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IntXferDestAcct" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestDetails_Type", propOrder = {
    "rate",
    "intCompMethod",
    "intDistMethod",
    "intPmtFreq",
    "intXferDestAcct"
})
public class InterestDetailsType {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "IntCompMethod")
    protected String intCompMethod;
    @XmlElement(name = "IntDistMethod")
    protected String intDistMethod;
    @XmlElement(name = "IntPmtFreq")
    protected String intPmtFreq;
    @XmlElement(name = "IntXferDestAcct")
    protected String intXferDestAcct;

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
     * Gets the value of the intCompMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntCompMethod() {
        return intCompMethod;
    }

    /**
     * Sets the value of the intCompMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntCompMethod(String value) {
        this.intCompMethod = value;
    }

    /**
     * Gets the value of the intDistMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntDistMethod() {
        return intDistMethod;
    }

    /**
     * Sets the value of the intDistMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntDistMethod(String value) {
        this.intDistMethod = value;
    }

    /**
     * Gets the value of the intPmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntPmtFreq() {
        return intPmtFreq;
    }

    /**
     * Sets the value of the intPmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntPmtFreq(String value) {
        this.intPmtFreq = value;
    }

    /**
     * Gets the value of the intXferDestAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntXferDestAcct() {
        return intXferDestAcct;
    }

    /**
     * Sets the value of the intXferDestAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntXferDestAcct(String value) {
        this.intXferDestAcct = value;
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
