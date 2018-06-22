
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
 * <p>Java class for POSCapabilities_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSCapabilities_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSAttended" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSOperation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSEntryCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSCaptureCapability" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSVerifyCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}POSOutCapabilities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSCapabilities_Type", propOrder = {
    "posAttended",
    "posOperation",
    "posEntryCapability",
    "posCaptureCapability",
    "posVerifyCapability",
    "posOutCapabilities"
})
public class POSCapabilitiesType {

    @XmlElement(name = "POSAttended")
    protected Boolean posAttended;
    @XmlElement(name = "POSOperation")
    protected List<String> posOperation;
    @XmlElement(name = "POSEntryCapability")
    protected List<String> posEntryCapability;
    @XmlElement(name = "POSCaptureCapability")
    protected Boolean posCaptureCapability;
    @XmlElement(name = "POSVerifyCapability")
    protected List<String> posVerifyCapability;
    @XmlElement(name = "POSOutCapabilities")
    protected List<String> posOutCapabilities;

    /**
     * Gets the value of the posAttended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOSAttended() {
        return posAttended;
    }

    /**
     * Sets the value of the posAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOSAttended(Boolean value) {
        this.posAttended = value;
    }

    /**
     * Gets the value of the posOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOSOperation() {
        if (posOperation == null) {
            posOperation = new ArrayList<String>();
        }
        return this.posOperation;
    }

    /**
     * Gets the value of the posEntryCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posEntryCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSEntryCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOSEntryCapability() {
        if (posEntryCapability == null) {
            posEntryCapability = new ArrayList<String>();
        }
        return this.posEntryCapability;
    }

    /**
     * Gets the value of the posCaptureCapability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOSCaptureCapability() {
        return posCaptureCapability;
    }

    /**
     * Sets the value of the posCaptureCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOSCaptureCapability(Boolean value) {
        this.posCaptureCapability = value;
    }

    /**
     * Gets the value of the posVerifyCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posVerifyCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSVerifyCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOSVerifyCapability() {
        if (posVerifyCapability == null) {
            posVerifyCapability = new ArrayList<String>();
        }
        return this.posVerifyCapability;
    }

    /**
     * Gets the value of the posOutCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOutCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSOutCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPOSOutCapabilities() {
        if (posOutCapabilities == null) {
            posOutCapabilities = new ArrayList<String>();
        }
        return this.posOutCapabilities;
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
