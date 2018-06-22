
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
 * <p>Java class for GenAppInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenAppInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GenApplicant" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GenAppAcctId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OverdraftFunding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreatedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Ownership" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenAppInfo_Type", propOrder = {
    "genApplicant",
    "genAppAcctId",
    "bankAcctInfo",
    "cardType",
    "overdraftFunding",
    "createdDt",
    "ownership"
})
public class GenAppInfoType {

    @XmlElement(name = "GenApplicant", required = true)
    protected List<GenApplicantType> genApplicant;
    @XmlElement(name = "GenAppAcctId", required = true)
    protected GenAppAcctIdType genAppAcctId;
    @XmlElement(name = "BankAcctInfo", required = true)
    protected BankAcctInfo bankAcctInfo;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "OverdraftFunding")
    protected List<OverdraftFundingType> overdraftFunding;
    @XmlElement(name = "CreatedDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDt;
    @XmlElement(name = "Ownership")
    protected String ownership;

    /**
     * Gets the value of the genApplicant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genApplicant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenApplicant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenApplicantType }
     * 
     * 
     */
    public List<GenApplicantType> getGenApplicant() {
        if (genApplicant == null) {
            genApplicant = new ArrayList<GenApplicantType>();
        }
        return this.genApplicant;
    }

    /**
     * Gets the value of the genAppAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenAppAcctIdType }
     *     
     */
    public GenAppAcctIdType getGenAppAcctId() {
        return genAppAcctId;
    }

    /**
     * Sets the value of the genAppAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenAppAcctIdType }
     *     
     */
    public void setGenAppAcctId(GenAppAcctIdType value) {
        this.genAppAcctId = value;
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
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownership = value;
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
