
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
 * <p>Java class for PartyAcctRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartyAcctRelId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartyAcctRelInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TINInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OwnerInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CloseDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PrimaryAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartyAcctRelStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Requestor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PrimaryOwner" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelRec_Type", propOrder = {
    "partyAcctRelId",
    "partyAcctRelInfo",
    "fullName",
    "tinInfo",
    "ownerInd",
    "bankAcctStatus",
    "openDt",
    "closeDt",
    "primaryAcct",
    "nickname",
    "acctBal",
    "partyAcctRelStatus",
    "requestor",
    "primaryOwner"
})
public class PartyAcctRelRecType {

    @XmlElement(name = "PartyAcctRelId", required = true)
    protected String partyAcctRelId;
    @XmlElement(name = "PartyAcctRelInfo", required = true)
    protected PartyAcctRelInfoType partyAcctRelInfo;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "TINInfo")
    protected TINInfoType tinInfo;
    @XmlElement(name = "OwnerInd")
    protected Boolean ownerInd;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatus bankAcctStatus;
    @XmlElement(name = "OpenDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openDt;
    @XmlElement(name = "CloseDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDt;
    @XmlElement(name = "PrimaryAcct")
    protected Boolean primaryAcct;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "PartyAcctRelStatus")
    protected PartyAcctRelStatusType partyAcctRelStatus;
    @XmlElement(name = "Requestor")
    protected String requestor;
    @XmlElement(name = "PrimaryOwner")
    protected Boolean primaryOwner;

    /**
     * Gets the value of the partyAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAcctRelId() {
        return partyAcctRelId;
    }

    /**
     * Sets the value of the partyAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAcctRelId(String value) {
        this.partyAcctRelId = value;
    }

    /**
     * Gets the value of the partyAcctRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelInfoType }
     *     
     */
    public PartyAcctRelInfoType getPartyAcctRelInfo() {
        return partyAcctRelInfo;
    }

    /**
     * Sets the value of the partyAcctRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelInfoType }
     *     
     */
    public void setPartyAcctRelInfo(PartyAcctRelInfoType value) {
        this.partyAcctRelInfo = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoType }
     *     
     */
    public TINInfoType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoType }
     *     
     */
    public void setTINInfo(TINInfoType value) {
        this.tinInfo = value;
    }

    /**
     * Gets the value of the ownerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerInd() {
        return ownerInd;
    }

    /**
     * Sets the value of the ownerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerInd(Boolean value) {
        this.ownerInd = value;
    }

    /**
     * Gets the value of the bankAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctStatus }
     *     
     */
    public BankAcctStatus getBankAcctStatus() {
        return bankAcctStatus;
    }

    /**
     * Sets the value of the bankAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctStatus }
     *     
     */
    public void setBankAcctStatus(BankAcctStatus value) {
        this.bankAcctStatus = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDt(XMLGregorianCalendar value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the closeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDt() {
        return closeDt;
    }

    /**
     * Sets the value of the closeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDt(XMLGregorianCalendar value) {
        this.closeDt = value;
    }

    /**
     * Gets the value of the primaryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryAcct() {
        return primaryAcct;
    }

    /**
     * Sets the value of the primaryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryAcct(Boolean value) {
        this.primaryAcct = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBal }
     * 
     * 
     */
    public List<AcctBal> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBal>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the partyAcctRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelStatusType }
     *     
     */
    public PartyAcctRelStatusType getPartyAcctRelStatus() {
        return partyAcctRelStatus;
    }

    /**
     * Sets the value of the partyAcctRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelStatusType }
     *     
     */
    public void setPartyAcctRelStatus(PartyAcctRelStatusType value) {
        this.partyAcctRelStatus = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor(String value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the primaryOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryOwner() {
        return primaryOwner;
    }

    /**
     * Sets the value of the primaryOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryOwner(Boolean value) {
        this.primaryOwner = value;
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
