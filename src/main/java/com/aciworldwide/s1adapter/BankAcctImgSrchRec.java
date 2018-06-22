
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * S1 Added Aggregate - Bank Account Image Search Record
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctTrnImgInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepositAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DebitAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RefInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TunneledData" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "bankAcctTrnImgInfo",
    "depositAmt",
    "debitAcct",
    "refInfo",
    "tunneledData"
})
@XmlRootElement(name = "BankAcctImgSrchRec")
public class BankAcctImgSrchRec {

    @XmlElement(name = "BankAcctTrnImgInfo", required = true)
    protected BankAcctTrnImgInfo bankAcctTrnImgInfo;
    @XmlElement(name = "DepositAmt")
    protected CurrencyAmount depositAmt;
    @XmlElement(name = "DebitAcct")
    protected AccountsType debitAcct;
    @XmlElement(name = "RefInfo")
    protected List<RefInfo> refInfo;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the bankAcctTrnImgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctTrnImgInfo }
     *     
     */
    public BankAcctTrnImgInfo getBankAcctTrnImgInfo() {
        return bankAcctTrnImgInfo;
    }

    /**
     * Sets the value of the bankAcctTrnImgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctTrnImgInfo }
     *     
     */
    public void setBankAcctTrnImgInfo(BankAcctTrnImgInfo value) {
        this.bankAcctTrnImgInfo = value;
    }

    /**
     * Gets the value of the depositAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getDepositAmt() {
        return depositAmt;
    }

    /**
     * Sets the value of the depositAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setDepositAmt(CurrencyAmount value) {
        this.depositAmt = value;
    }

    /**
     * Gets the value of the debitAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountsType }
     *     
     */
    public AccountsType getDebitAcct() {
        return debitAcct;
    }

    /**
     * Sets the value of the debitAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsType }
     *     
     */
    public void setDebitAcct(AccountsType value) {
        this.debitAcct = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfo }
     * 
     * 
     */
    public List<RefInfo> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<RefInfo>();
        }
        return this.refInfo;
    }

    /**
     * Gets the value of the tunneledData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunneledData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunneledData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapElement }
     * 
     * 
     */
    public List<MapElement> getTunneledData() {
        if (tunneledData == null) {
            tunneledData = new ArrayList<MapElement>();
        }
        return this.tunneledData;
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
