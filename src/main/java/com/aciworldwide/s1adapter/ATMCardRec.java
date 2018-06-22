
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardID"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardBaseID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardProduct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardHolderID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardHolderName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardExpirationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CardStatus"/&gt;
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
    "cardID",
    "cardType",
    "cardClass",
    "cardBaseID",
    "cardProduct",
    "cardHolderID",
    "cardHolderName",
    "cardExpirationDate",
    "cardStatus"
})
@XmlRootElement(name = "ATMCardRec")
public class ATMCardRec {

    @XmlElement(name = "CardID", required = true)
    protected String cardID;
    @XmlElement(name = "CardType", required = true)
    protected String cardType;
    @XmlElement(name = "CardClass")
    protected Long cardClass;
    @XmlElement(name = "CardBaseID")
    protected String cardBaseID;
    @XmlElement(name = "CardProduct")
    protected String cardProduct;
    @XmlElement(name = "CardHolderID")
    protected String cardHolderID;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardExpirationDate")
    protected String cardExpirationDate;
    @XmlElement(name = "CardStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CardStatusType cardStatus;

    /**
     * Gets the value of the cardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardID() {
        return cardID;
    }

    /**
     * Sets the value of the cardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardID(String value) {
        this.cardID = value;
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
     * Gets the value of the cardClass property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardClass() {
        return cardClass;
    }

    /**
     * Sets the value of the cardClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardClass(Long value) {
        this.cardClass = value;
    }

    /**
     * Gets the value of the cardBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBaseID() {
        return cardBaseID;
    }

    /**
     * Sets the value of the cardBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBaseID(String value) {
        this.cardBaseID = value;
    }

    /**
     * Gets the value of the cardProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProduct() {
        return cardProduct;
    }

    /**
     * Sets the value of the cardProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProduct(String value) {
        this.cardProduct = value;
    }

    /**
     * Gets the value of the cardHolderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderID() {
        return cardHolderID;
    }

    /**
     * Sets the value of the cardHolderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderID(String value) {
        this.cardHolderID = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    /**
     * Sets the value of the cardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationDate(String value) {
        this.cardExpirationDate = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatusType }
     *     
     */
    public CardStatusType getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatusType }
     *     
     */
    public void setCardStatus(CardStatusType value) {
        this.cardStatus = value;
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
