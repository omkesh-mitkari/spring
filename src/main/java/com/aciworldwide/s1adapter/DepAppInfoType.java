
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DepAppInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepApplicant" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAppAcctId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FundingInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OverdraftFunding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreatedDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAppInfo_Type", propOrder = {
    "depApplicant",
    "depAppAcctId",
    "bankAcctInfo",
    "cardType",
    "fundingInfo",
    "overdraftFunding",
    "createdDt"
})
public class DepAppInfoType {

    @XmlElement(name = "DepApplicant", required = true)
    protected List<DepApplicantType> depApplicant;
    @XmlElement(name = "DepAppAcctId", required = true)
    protected DepAppAcctIdType depAppAcctId;
    @XmlElement(name = "BankAcctInfo", required = true)
    protected BankAcctInfo bankAcctInfo;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "FundingInfo")
    protected FundingInfoType fundingInfo;
    @XmlElement(name = "OverdraftFunding")
    protected List<OverdraftFundingType> overdraftFunding;
    @XmlElement(name = "CreatedDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDt;

    /**
     * Gets the value of the depApplicant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depApplicant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepApplicant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepApplicantType }
     * 
     * 
     */
    public List<DepApplicantType> getDepApplicant() {
        if (depApplicant == null) {
            depApplicant = new ArrayList<DepApplicantType>();
        }
        return this.depApplicant;
    }

    /**
     * Gets the value of the depAppAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppAcctIdType }
     *     
     */
    public DepAppAcctIdType getDepAppAcctId() {
        return depAppAcctId;
    }

    /**
     * Sets the value of the depAppAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppAcctIdType }
     *     
     */
    public void setDepAppAcctId(DepAppAcctIdType value) {
        this.depAppAcctId = value;
    }

    /**
     * Gets the value of the bankAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctInfo }
     *     
     */
    public BankAcctInfo getBankAcctInfo() {
        return bankAcctInfo;
    }

    /**
     * Sets the value of the bankAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctInfo }
     *     
     */
    public void setBankAcctInfo(BankAcctInfo value) {
        this.bankAcctInfo = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the fundingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FundingInfoType }
     *     
     */
    public FundingInfoType getFundingInfo() {
        return fundingInfo;
    }

    /**
     * Sets the value of the fundingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingInfoType }
     *     
     */
    public void setFundingInfo(FundingInfoType value) {
        this.fundingInfo = value;
    }

    /**
     * Gets the value of the overdraftFunding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFunding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFunding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFundingType }
     * 
     * 
     */
    public List<OverdraftFundingType> getOverdraftFunding() {
        if (overdraftFunding == null) {
            overdraftFunding = new ArrayList<OverdraftFundingType>();
        }
        return this.overdraftFunding;
    }

    /**
     * Gets the value of the createdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDt() {
        return createdDt;
    }

    /**
     * Sets the value of the createdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDt(XMLGregorianCalendar value) {
        this.createdDt = value;
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
