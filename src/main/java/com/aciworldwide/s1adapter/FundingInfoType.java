
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for FundingInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctIdFrom"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctIdFrom"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctIdFrom"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateInfo" minOccurs="0"/&gt;
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
@XmlType(name = "FundingInfo_Type", propOrder = {
    "depAcctIdFrom",
    "cardAcctIdFrom",
    "loanAcctIdFrom",
    "curAmt",
    "forExRateInfo",
    "memo"
})
public class FundingInfoType {

    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdFrom depAcctIdFrom;
    @XmlElement(name = "CardAcctIdFrom")
    protected CardAcctIdFrom cardAcctIdFrom;
    @XmlElement(name = "LoanAcctIdFrom")
    protected LoanAcctIdFrom loanAcctIdFrom;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmt curAmt;
    @XmlElement(name = "ForExRateInfo")
    protected ForExRateInfo forExRateInfo;
    @XmlElement(name = "Memo")
    protected String memo;

    /**
     * Gets the value of the depAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdFrom }
     *     
     */
    public DepAcctIdFrom getDepAcctIdFrom() {
        return depAcctIdFrom;
    }

    /**
     * Sets the value of the depAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdFrom }
     *     
     */
    public void setDepAcctIdFrom(DepAcctIdFrom value) {
        this.depAcctIdFrom = value;
    }

    /**
     * Gets the value of the cardAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdFrom }
     *     
     */
    public CardAcctIdFrom getCardAcctIdFrom() {
        return cardAcctIdFrom;
    }

    /**
     * Sets the value of the cardAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdFrom }
     *     
     */
    public void setCardAcctIdFrom(CardAcctIdFrom value) {
        this.cardAcctIdFrom = value;
    }

    /**
     * Gets the value of the loanAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctIdFrom }
     *     
     */
    public LoanAcctIdFrom getLoanAcctIdFrom() {
        return loanAcctIdFrom;
    }

    /**
     * Sets the value of the loanAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctIdFrom }
     *     
     */
    public void setLoanAcctIdFrom(LoanAcctIdFrom value) {
        this.loanAcctIdFrom = value;
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
     * Gets the value of the forExRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateInfo }
     *     
     */
    public ForExRateInfo getForExRateInfo() {
        return forExRateInfo;
    }

    /**
     * Sets the value of the forExRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateInfo }
     *     
     */
    public void setForExRateInfo(ForExRateInfo value) {
        this.forExRateInfo = value;
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
