
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BillSummAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillSummAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillSummAmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillSummAmtCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ShortDesc"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillSummAmtType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillSummSubAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillSummAmt_Type", propOrder = {
    "billSummAmtId",
    "billSummAmtCode",
    "shortDesc",
    "desc",
    "memo",
    "curAmt",
    "billSummAmtType",
    "billSummSubAmt"
})
public class BillSummAmtType {

    @XmlElement(name = "BillSummAmtId")
    protected String billSummAmtId;
    @XmlElement(name = "BillSummAmtCode")
    protected String billSummAmtCode;
    @XmlElement(name = "ShortDesc", required = true)
    protected String shortDesc;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;
    @XmlElement(name = "BillSummAmtType", required = true)
    protected String billSummAmtType;
    @XmlElement(name = "BillSummSubAmt")
    protected List<BillSummSubAmtType> billSummSubAmt;

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
     * Gets the value of the billSummAmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtCode() {
        return billSummAmtCode;
    }

    /**
     * Sets the value of the billSummAmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtCode(String value) {
        this.billSummAmtCode = value;
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
     * Gets the value of the billSummAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtType() {
        return billSummAmtType;
    }

    /**
     * Sets the value of the billSummAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtType(String value) {
        this.billSummAmtType = value;
    }

    /**
     * Gets the value of the billSummSubAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billSummSubAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillSummSubAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillSummSubAmtType }
     * 
     * 
     */
    public List<BillSummSubAmtType> getBillSummSubAmt() {
        if (billSummSubAmt == null) {
            billSummSubAmt = new ArrayList<BillSummSubAmtType>();
        }
        return this.billSummSubAmt;
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
