
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
 * S1 modified bank account record - added xxxAcctRec, ExtAcctBal, IncExtBal, IncBal, UpDt, LastTrnDt, and LastStmtDt
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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctId"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}UpDt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastTrnDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LastStmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NextStmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StmtCycle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NumberOfSigners" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Relationship" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AccountFlags" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ExtAcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctRec"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CCAcctRec"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctRec"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Ownership" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctComments" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OfficerId" minOccurs="0"/&gt;
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
    "depAcctId",
    "cardAcctId",
    "loanAcctId",
    "upDt",
    "lastTrnDt",
    "lastStmtDt",
    "nextStmtDt",
    "stmtCycle",
    "numberOfSigners",
    "relationship",
    "bankAcctInfo",
    "bankAcctStatus",
    "accountFlags",
    "acctBal",
    "extAcctBal",
    "depAcctRec",
    "ccAcctRec",
    "loanAcctRec",
    "ownership",
    "acctComments",
    "officerId",
    "tunneledData"
})
@XmlRootElement(name = "BankAcctRec")
public class BankAcctRec {

    @XmlElement(name = "DepAcctId")
    protected DepAcctId depAcctId;
    @XmlElement(name = "CardAcctId")
    protected CardAcctId cardAcctId;
    @XmlElement(name = "LoanAcctId")
    protected LoanAcctId loanAcctId;
    @XmlElement(name = "UpDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upDt;
    @XmlElement(name = "LastTrnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTrnDt;
    @XmlElement(name = "LastStmtDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStmtDt;
    @XmlElement(name = "NextStmtDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextStmtDt;
    @XmlElement(name = "StmtCycle")
    protected String stmtCycle;
    @XmlElement(name = "NumberOfSigners")
    protected String numberOfSigners;
    @XmlElement(name = "Relationship")
    protected String relationship;
    @XmlElement(name = "BankAcctInfo", required = true)
    protected BankAcctInfo bankAcctInfo;
    @XmlElement(name = "BankAcctStatus")
    protected BankAcctStatus bankAcctStatus;
    @XmlElement(name = "AccountFlags")
    protected List<AccountFlags> accountFlags;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "ExtAcctBal")
    protected List<ExtAcctBal> extAcctBal;
    @XmlElement(name = "DepAcctRec")
    protected DepAcctRec depAcctRec;
    @XmlElement(name = "CCAcctRec")
    protected CCAcctRec ccAcctRec;
    @XmlElement(name = "LoanAcctRec")
    protected LoanAcctRec loanAcctRec;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "AcctComments")
    protected String acctComments;
    @XmlElement(name = "OfficerId")
    protected String officerId;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the depAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctId }
     *     
     */
    public DepAcctId getDepAcctId() {
        return depAcctId;
    }

    /**
     * Sets the value of the depAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctId }
     *     
     */
    public void setDepAcctId(DepAcctId value) {
        this.depAcctId = value;
    }

    /**
     * Gets the value of the cardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctId }
     *     
     */
    public CardAcctId getCardAcctId() {
        return cardAcctId;
    }

    /**
     * Sets the value of the cardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctId }
     *     
     */
    public void setCardAcctId(CardAcctId value) {
        this.cardAcctId = value;
    }

    /**
     * Gets the value of the loanAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctId }
     *     
     */
    public LoanAcctId getLoanAcctId() {
        return loanAcctId;
    }

    /**
     * Sets the value of the loanAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctId }
     *     
     */
    public void setLoanAcctId(LoanAcctId value) {
        this.loanAcctId = value;
    }

    /**
     * Gets the value of the upDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpDt() {
        return upDt;
    }

    /**
     * Sets the value of the upDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpDt(XMLGregorianCalendar value) {
        this.upDt = value;
    }

    /**
     * Gets the value of the lastTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTrnDt() {
        return lastTrnDt;
    }

    /**
     * Sets the value of the lastTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTrnDt(XMLGregorianCalendar value) {
        this.lastTrnDt = value;
    }

    /**
     * Gets the value of the lastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStmtDt() {
        return lastStmtDt;
    }

    /**
     * Sets the value of the lastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStmtDt(XMLGregorianCalendar value) {
        this.lastStmtDt = value;
    }

    /**
     * Gets the value of the nextStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextStmtDt() {
        return nextStmtDt;
    }

    /**
     * Sets the value of the nextStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextStmtDt(XMLGregorianCalendar value) {
        this.nextStmtDt = value;
    }

    /**
     * Gets the value of the stmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtCycle() {
        return stmtCycle;
    }

    /**
     * Sets the value of the stmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtCycle(String value) {
        this.stmtCycle = value;
    }

    /**
     * Gets the value of the numberOfSigners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfSigners() {
        return numberOfSigners;
    }

    /**
     * Sets the value of the numberOfSigners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfSigners(String value) {
        this.numberOfSigners = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
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
     * Gets the value of the accountFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountFlags }
     * 
     * 
     */
    public List<AccountFlags> getAccountFlags() {
        if (accountFlags == null) {
            accountFlags = new ArrayList<AccountFlags>();
        }
        return this.accountFlags;
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
     * S1 added element - coltrolled by IncExtBal in SvcAcctInqRq Gets the value of the extAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtAcctBal }
     * 
     * 
     */
    public List<ExtAcctBal> getExtAcctBal() {
        if (extAcctBal == null) {
            extAcctBal = new ArrayList<ExtAcctBal>();
        }
        return this.extAcctBal;
    }

    /**
     * Gets the value of the depAcctRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctRec }
     *     
     */
    public DepAcctRec getDepAcctRec() {
        return depAcctRec;
    }

    /**
     * Sets the value of the depAcctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctRec }
     *     
     */
    public void setDepAcctRec(DepAcctRec value) {
        this.depAcctRec = value;
    }

    /**
     * Gets the value of the ccAcctRec property.
     * 
     * @return
     *     possible object is
     *     {@link CCAcctRec }
     *     
     */
    public CCAcctRec getCCAcctRec() {
        return ccAcctRec;
    }

    /**
     * Sets the value of the ccAcctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAcctRec }
     *     
     */
    public void setCCAcctRec(CCAcctRec value) {
        this.ccAcctRec = value;
    }

    /**
     * Gets the value of the loanAcctRec property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAcctRec }
     *     
     */
    public LoanAcctRec getLoanAcctRec() {
        return loanAcctRec;
    }

    /**
     * Sets the value of the loanAcctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAcctRec }
     *     
     */
    public void setLoanAcctRec(LoanAcctRec value) {
        this.loanAcctRec = value;
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
     * Gets the value of the acctComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctComments() {
        return acctComments;
    }

    /**
     * Sets the value of the acctComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctComments(String value) {
        this.acctComments = value;
    }

    /**
     * Gets the value of the officerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficerId() {
        return officerId;
    }

    /**
     * Sets the value of the officerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficerId(String value) {
        this.officerId = value;
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
