
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PointOfServiceData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfServiceData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Environment"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSCapabilities" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSSecurity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSAgent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentCharacterData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfServiceData_Type", propOrder = {
    "environment",
    "posCapabilities",
    "posSecurity",
    "posAgent",
    "identCharacterData",
    "posLocation"
})
public class PointOfServiceDataType {

    @XmlElement(name = "Environment", required = true)
    protected String environment;
    @XmlElement(name = "POSCapabilities")
    protected POSCapabilitiesType posCapabilities;
    @XmlElement(name = "POSSecurity")
    protected POSSecurityType posSecurity;
    @XmlElement(name = "POSAgent")
    protected POSAgentType posAgent;
    @XmlElement(name = "IdentCharacterData")
    protected IdentCharacterDataType identCharacterData;
    @XmlElement(name = "POSLocation")
    protected String posLocation;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the posCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link POSCapabilitiesType }
     *     
     */
    public POSCapabilitiesType getPOSCapabilities() {
        return posCapabilities;
    }

    /**
     * Sets the value of the posCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSCapabilitiesType }
     *     
     */
    public void setPOSCapabilities(POSCapabilitiesType value) {
        this.posCapabilities = value;
    }

    /**
     * Gets the value of the posSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link POSSecurityType }
     *     
     */
    public POSSecurityType getPOSSecurity() {
        return posSecurity;
    }

    /**
     * Sets the value of the posSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSSecurityType }
     *     
     */
    public void setPOSSecurity(POSSecurityType value) {
        this.posSecurity = value;
    }

    /**
     * Gets the value of the posAgent property.
     * 
     * @return
     *     possible object is
     *     {@link POSAgentType }
     *     
     */
    public POSAgentType getPOSAgent() {
        return posAgent;
    }

    /**
     * Sets the value of the posAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSAgentType }
     *     
     */
    public void setPOSAgent(POSAgentType value) {
        this.posAgent = value;
    }

    /**
     * Gets the value of the identCharacterData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentCharacterDataType }
     *     
     */
    public IdentCharacterDataType getIdentCharacterData() {
        return identCharacterData;
    }

    /**
     * Sets the value of the identCharacterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentCharacterDataType }
     *     
     */
    public void setIdentCharacterData(IdentCharacterDataType value) {
        this.identCharacterData = value;
    }

    /**
     * Gets the value of the posLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSLocation() {
        return posLocation;
    }

    /**
     * Sets the value of the posLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSLocation(String value) {
        this.posLocation = value;
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
