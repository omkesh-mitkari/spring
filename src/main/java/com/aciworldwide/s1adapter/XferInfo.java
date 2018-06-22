
package com.aciworldwide.s1adapter;

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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctIdFrom"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctIdFrom"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctIdFrom"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctIdTo"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctIdTo"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctIdTo"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}XferDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
 *         &lt;element name="ImmediateXfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RefInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DueDt" minOccurs="0"/&gt;
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
    "depAcctIdFrom",
    "cardAcctIdFrom",
    "loanAcctIdFrom",
    "depAcctIdTo",
    "cardAcctIdTo",
    "loanAcctIdTo",
    "curAmt",
    "xferDetail",
    "forExRateInfo",
    "memo",
    "immediateXfer",
    "refInfo",
    "dueDt"
})
@XmlRootElement(name = "XferInfo")
public class XferInfo {

    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdFrom depAcctIdFrom;
    @XmlElement(name = "CardAcctIdFrom")
    protected CardAcctIdFrom cardAcctIdFrom;
    @XmlElement(name = "LoanAcctIdFrom")
    protected LoanAcctIdFrom loanAcctIdFrom;
    @XmlElement(name = "DepAcctIdTo")
    protected DepAcctIdTo depAcctIdTo;
    @XmlElement(name = "CardAcctIdTo")
    protected CardAcctIdTo cardAcctIdTo;
    @XmlElement(name = "LoanAcctIdTo")
    protected LoanAcctIdTo loanAcctIdTo;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmt curAmt;
    @XmlElement(name = "XferDetail")
    protected List<XferDetailType> xferDetail;
    @XmlElement(name = "ForExRateInfo")
    protected ForExRateInfo forExRateInfo;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "ImmediateXfer", defaultValue = "true")
    protected Boolean immediateXfer;
    @XmlElement(name = "RefInfo")
    protected RefInfo refInfo;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDt;

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
     * Gets the value of the depAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdTo }
     *     
     */
    public DepAcctIdTo getDepAcctIdTo() {
        return depAcctIdTo;
    }

    /**
     * Sets the value of the depAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdTo }
     *     
     */
    public void setDepAcctIdTo(DepAcctIdTo value) {
        this.depAcctIdTo = value;
    }

    /**
     * Gets the value of the cardAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdTo }
     *     
     */
    public CardAcctIdTo getCardAcctIdTo() {
        return cardAcctIdTo;
    }

    /**
     * Sets the value of the cardAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdTo }
     *     
     */
    public void setCardAcctIdTo(CardAcctIdTo value) {
        this.cardAcctIdTo = value;
    }

    /**
     * Gets the value of the loanAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctIdTo }
     *     
     */
    public LoanAcctIdTo getLoanAcctIdTo() {
        return loanAcctIdTo;
    }

    /**
     * Sets the value of the loanAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctIdTo }
     *     
     */
    public void setLoanAcctIdTo(LoanAcctIdTo value) {
        this.loanAcctIdTo = value;
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
     * Gets the value of the xferDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XferDetailType }
     * 
     * 
     */
    public List<XferDetailType> getXferDetail() {
        if (xferDetail == null) {
            xferDetail = new ArrayList<XferDetailType>();
        }
        return this.xferDetail;
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
     * Gets the value of the immediateXfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateXfer() {
        return immediateXfer;
    }

    /**
     * Sets the value of the immediateXfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateXfer(Boolean value) {
        this.immediateXfer = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefInfo }
     *     
     */
    public RefInfo getRefInfo() {
        return refInfo;
    }

    /**
     * Sets the value of the refInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefInfo }
     *     
     */
    public void setRefInfo(RefInfo value) {
        this.refInfo = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
