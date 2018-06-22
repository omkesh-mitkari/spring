
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FlagName"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FlagValue"/&gt;
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
    "flagName",
    "flagValue"
})
@XmlRootElement(name = "AccountFlags")
public class AccountFlags {

    @XmlElement(name = "FlagName", required = true)
    protected String flagName;
    @XmlElement(name = "FlagValue")
    protected boolean flagValue;

    /**
     * Gets the value of the flagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagName() {
        return flagName;
    }

    /**
     * Sets the value of the flagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagName(String value) {
        this.flagName = value;
    }

    /**
     * Gets the value of the flagValue property.
     * 
     */
    public boolean isFlagValue() {
        return flagValue;
    }

    /**
     * Sets the value of the flagValue property.
     * 
     */
    public void setFlagValue(boolean value) {
        this.flagValue = value;
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
