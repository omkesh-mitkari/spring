
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
 * <p>Java class for ForExDealSyncObj_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExDealSyncObj_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExDealId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExDealInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExDealStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SettlementMethod"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExRateInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OffsetId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ForExOffsetRateInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OffsetPmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SettlementSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartnerRefId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ContractBalance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExDealSyncObj_Type", propOrder = {
    "forExDealId",
    "forExDealInfo",
    "forExDealStatus",
    "settlementMethod",
    "forExRateInfo",
    "offsetId",
    "forExOffsetRateInfo",
    "offsetPmtId",
    "settlementSummary",
    "partnerRefId",
    "contractBalance"
})
public class ForExDealSyncObjType {

    @XmlElement(name = "ForExDealId", required = true)
    protected String forExDealId;
    @XmlElement(name = "ForExDealInfo")
    protected ForExDealInfoType forExDealInfo;
    @XmlElement(name = "ForExDealStatus")
    protected ForExDealStatusType forExDealStatus;
    @XmlElement(name = "SettlementMethod", required = true)
    protected String settlementMethod;
    @XmlElement(name = "ForExRateInfo")
    protected ForExRateInfo forExRateInfo;
    @XmlElement(name = "OffsetId")
    protected String offsetId;
    @XmlElement(name = "ForExOffsetRateInfo")
    protected ForExOffsetRateInfoType forExOffsetRateInfo;
    @XmlElement(name = "OffsetPmtId")
    protected String offsetPmtId;
    @XmlElement(name = "SettlementSummary")
    protected List<SettlementSummaryType> settlementSummary;
    @XmlElement(name = "PartnerRefId")
    protected String partnerRefId;
    @XmlElement(name = "ContractBalance")
    protected CurrencyAmount contractBalance;

    /**
     * Gets the value of the forExDealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExDealId() {
        return forExDealId;
    }

    /**
     * Sets the value of the forExDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExDealId(String value) {
        this.forExDealId = value;
    }

    /**
     * Gets the value of the forExDealInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealInfoType }
     *     
     */
    public ForExDealInfoType getForExDealInfo() {
        return forExDealInfo;
    }

    /**
     * Sets the value of the forExDealInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealInfoType }
     *     
     */
    public void setForExDealInfo(ForExDealInfoType value) {
        this.forExDealInfo = value;
    }

    /**
     * Gets the value of the forExDealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealStatusType }
     *     
     */
    public ForExDealStatusType getForExDealStatus() {
        return forExDealStatus;
    }

    /**
     * Sets the value of the forExDealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealStatusType }
     *     
     */
    public void setForExDealStatus(ForExDealStatusType value) {
        this.forExDealStatus = value;
    }

    /**
     * Gets the value of the settlementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementMethod() {
        return settlementMethod;
    }

    /**
     * Sets the value of the settlementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementMethod(String value) {
        this.settlementMethod = value;
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
     * Gets the value of the offsetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetId() {
        return offsetId;
    }

    /**
     * Sets the value of the offsetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetId(String value) {
        this.offsetId = value;
    }

    /**
     * Gets the value of the forExOffsetRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExOffsetRateInfoType }
     *     
     */
    public ForExOffsetRateInfoType getForExOffsetRateInfo() {
        return forExOffsetRateInfo;
    }

    /**
     * Sets the value of the forExOffsetRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExOffsetRateInfoType }
     *     
     */
    public void setForExOffsetRateInfo(ForExOffsetRateInfoType value) {
        this.forExOffsetRateInfo = value;
    }

    /**
     * Gets the value of the offsetPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetPmtId() {
        return offsetPmtId;
    }

    /**
     * Sets the value of the offsetPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetPmtId(String value) {
        this.offsetPmtId = value;
    }

    /**
     * Gets the value of the settlementSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementSummaryType }
     * 
     * 
     */
    public List<SettlementSummaryType> getSettlementSummary() {
        if (settlementSummary == null) {
            settlementSummary = new ArrayList<SettlementSummaryType>();
        }
        return this.settlementSummary;
    }

    /**
     * Gets the value of the partnerRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRefId() {
        return partnerRefId;
    }

    /**
     * Sets the value of the partnerRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRefId(String value) {
        this.partnerRefId = value;
    }

    /**
     * Gets the value of the contractBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getContractBalance() {
        return contractBalance;
    }

    /**
     * Sets the value of the contractBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setContractBalance(CurrencyAmount value) {
        this.contractBalance = value;
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
