
package com.aciworldwide.s1adapter;

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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BankAcctFeatType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FeatureEnabled"/&gt;
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
    "bankAcctFeatType",
    "featureEnabled"
})
@XmlRootElement(name = "BankAcctFeatSupt")
public class BankAcctFeatSupt {

    @XmlElement(name = "BankAcctFeatType", required = true)
    protected String bankAcctFeatType;
    @XmlElement(name = "FeatureEnabled")
    protected boolean featureEnabled;

    /**
     * Gets the value of the bankAcctFeatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctFeatType() {
        return bankAcctFeatType;
    }

    /**
     * Sets the value of the bankAcctFeatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctFeatType(String value) {
        this.bankAcctFeatType = value;
    }

    /**
     * Gets the value of the featureEnabled property.
     * 
     */
    public boolean isFeatureEnabled() {
        return featureEnabled;
    }

    /**
     * Sets the value of the featureEnabled property.
     * 
     */
    public void setFeatureEnabled(boolean value) {
        this.featureEnabled = value;
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
