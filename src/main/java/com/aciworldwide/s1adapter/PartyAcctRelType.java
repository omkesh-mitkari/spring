
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
 * <p>Java class for PartyAcctRel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartyAcctRelType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartyAcctRelDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartyAcctRelSubType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRel_Type", propOrder = {
    "partyAcctRelType",
    "partyAcctRelDesc",
    "partyAcctRelSubType"
})
public class PartyAcctRelType {

    @XmlElement(name = "PartyAcctRelType", required = true)
    protected List<String> partyAcctRelType;
    @XmlElement(name = "PartyAcctRelDesc")
    protected String partyAcctRelDesc;
    @XmlElement(name = "PartyAcctRelSubType")
    protected List<String> partyAcctRelSubType;

    /**
     * Gets the value of the partyAcctRelType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAcctRelType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAcctRelType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyAcctRelType() {
        if (partyAcctRelType == null) {
            partyAcctRelType = new ArrayList<String>();
        }
        return this.partyAcctRelType;
    }

    /**
     * Gets the value of the partyAcctRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAcctRelDesc() {
        return partyAcctRelDesc;
    }

    /**
     * Sets the value of the partyAcctRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAcctRelDesc(String value) {
        this.partyAcctRelDesc = value;
    }

    /**
     * Gets the value of the partyAcctRelSubType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAcctRelSubType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAcctRelSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyAcctRelSubType() {
        if (partyAcctRelSubType == null) {
            partyAcctRelSubType = new ArrayList<String>();
        }
        return this.partyAcctRelSubType;
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
