
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CompCurAmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CompCurAmtType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SpecialHandling" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
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
    "compCurAmtId",
    "compCurAmtType",
    "curAmt",
    "specialHandling",
    "memo"
})
@XmlRootElement(name = "CompositeCurAmt")
public class CompositeCurAmt {

    @XmlElement(name = "CompCurAmtId")
    protected String compCurAmtId;
    @XmlElement(name = "CompCurAmtType", required = true)
    protected String compCurAmtType;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmt curAmt;
    @XmlElement(name = "SpecialHandling")
    protected String specialHandling;
    @XmlElement(name = "Memo")
    protected String memo;

    /**
     * Gets the value of the compCurAmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCurAmtId() {
        return compCurAmtId;
    }

    /**
     * Sets the value of the compCurAmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCurAmtId(String value) {
        this.compCurAmtId = value;
    }

    /**
     * Gets the value of the compCurAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCurAmtType() {
        return compCurAmtType;
    }

    /**
     * Sets the value of the compCurAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCurAmtType(String value) {
        this.compCurAmtType = value;
    }

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
     * Gets the value of the specialHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialHandling() {
        return specialHandling;
    }

    /**
     * Sets the value of the specialHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialHandling(String value) {
        this.specialHandling = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
