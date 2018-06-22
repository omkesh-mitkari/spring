
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
 * S1 Added Aggregate - Deposit Account Transaction Status Record
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctTrnRec"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AvailDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkNumEnd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CheckStatus" minOccurs="0"/&gt;
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
    "bankAcctTrnRec",
    "availDt",
    "chkNum",
    "chkNumEnd",
    "checkStatus"
})
@XmlRootElement(name = "DepAcctTrnStatRec")
public class DepAcctTrnStatRec {

    @XmlElement(name = "BankAcctTrnRec", required = true)
    protected BankAcctTrnRec bankAcctTrnRec;
    @XmlElement(name = "AvailDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availDt;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "ChkNumEnd")
    protected String chkNumEnd;
    @XmlElement(name = "CheckStatus")
    protected String checkStatus;

    /**
     * Gets the value of the bankAcctTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctTrnRec }
     *     
     */
    public BankAcctTrnRec getBankAcctTrnRec() {
        return bankAcctTrnRec;
    }

    /**
     * Sets the value of the bankAcctTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctTrnRec }
     *     
     */
    public void setBankAcctTrnRec(BankAcctTrnRec value) {
        this.bankAcctTrnRec = value;
    }

    /**
     * Gets the value of the availDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailDt() {
        return availDt;
    }

    /**
     * Sets the value of the availDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailDt(XMLGregorianCalendar value) {
        this.availDt = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the chkNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNumEnd() {
        return chkNumEnd;
    }

    /**
     * Sets the value of the chkNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNumEnd(String value) {
        this.chkNumEnd = value;
    }

    /**
     * S1 Added Aggregate - Check Status
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * Sets the value of the checkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatus(String value) {
        this.checkStatus = value;
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
