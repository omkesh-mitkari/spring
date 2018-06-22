
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreditAuthType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CompositeCurAmt" maxOccurs="unbounded"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CardAcctId"/&gt;
 *         &lt;/choice&gt;
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
    "creditAuthType",
    "compositeCurAmt",
    "depAcctId",
    "cardAcctId"
})
@XmlRootElement(name = "CreditAuthInfo")
public class CreditAuthInfo {

    @XmlElement(name = "CreditAuthType", required = true)
    protected String creditAuthType;
    @XmlElement(name = "CompositeCurAmt", required = true)
    protected List<CompositeCurAmt> compositeCurAmt;
    @XmlElement(name = "DepAcctId")
    protected DepAcctId depAcctId;
    @XmlElement(name = "CardAcctId")
    protected CardAcctId cardAcctId;

    /**
     * Gets the value of the creditAuthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuthType() {
        return creditAuthType;
    }

    /**
     * Sets the value of the creditAuthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuthType(String value) {
        this.creditAuthType = value;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmt }
     * 
     * 
     */
    public List<CompositeCurAmt> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmt>();
        }
        return this.compositeCurAmt;
    }

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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
