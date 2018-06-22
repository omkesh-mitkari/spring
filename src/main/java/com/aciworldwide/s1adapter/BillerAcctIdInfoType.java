
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
 * <p>Java class for BillerAcctIdInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerAcctIdInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctMask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctHelpMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctRestrictMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AcctValidateURL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerAcctIdInfo_Type", propOrder = {
    "acctFormat",
    "acctMask",
    "acctHelpMsg",
    "acctRestrictMsg",
    "acctValidateURL"
})
public class BillerAcctIdInfoType {

    @XmlElement(name = "AcctFormat")
    protected String acctFormat;
    @XmlElement(name = "AcctMask")
    protected List<String> acctMask;
    @XmlElement(name = "AcctHelpMsg")
    protected String acctHelpMsg;
    @XmlElement(name = "AcctRestrictMsg")
    protected String acctRestrictMsg;
    @XmlElement(name = "AcctValidateURL")
    protected String acctValidateURL;

    /**
     * Gets the value of the acctFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctFormat() {
        return acctFormat;
    }

    /**
     * Sets the value of the acctFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctFormat(String value) {
        this.acctFormat = value;
    }

    /**
     * Gets the value of the acctMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcctMask() {
        if (acctMask == null) {
            acctMask = new ArrayList<String>();
        }
        return this.acctMask;
    }

    /**
     * Gets the value of the acctHelpMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctHelpMsg() {
        return acctHelpMsg;
    }

    /**
     * Sets the value of the acctHelpMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctHelpMsg(String value) {
        this.acctHelpMsg = value;
    }

    /**
     * Gets the value of the acctRestrictMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRestrictMsg() {
        return acctRestrictMsg;
    }

    /**
     * Sets the value of the acctRestrictMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRestrictMsg(String value) {
        this.acctRestrictMsg = value;
    }

    /**
     * Gets the value of the acctValidateURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctValidateURL() {
        return acctValidateURL;
    }

    /**
     * Sets the value of the acctValidateURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctValidateURL(String value) {
        this.acctValidateURL = value;
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
