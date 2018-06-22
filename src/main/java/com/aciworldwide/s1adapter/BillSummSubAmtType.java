
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BillSummSubAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillSummSubAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillSummAmtId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ShortDesc"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AllocateAllowed" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillSummSubAmt_Type", propOrder = {
    "billSummAmtId",
    "shortDesc",
    "desc",
    "memo",
    "curAmt",
    "allocateAllowed"
})
public class BillSummSubAmtType {

    @XmlElement(name = "BillSummAmtId", required = true)
    protected String billSummAmtId;
    @XmlElement(name = "ShortDesc", required = true)
    protected String shortDesc;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmt curAmt;
    @XmlElement(name = "AllocateAllowed")
    protected Boolean allocateAllowed;

    /**
     * Gets the value of the billSummAmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtId() {
        return billSummAmtId;
    }

    /**
     * Sets the value of the billSummAmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtId(String value) {
        this.billSummAmtId = value;
    }

    /**
     * Gets the value of the shortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Sets the value of the shortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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
     * Gets the value of the allocateAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllocateAllowed() {
        return allocateAllowed;
    }

    /**
     * Sets the value of the allocateAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllocateAllowed(Boolean value) {
        this.allocateAllowed = value;
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
