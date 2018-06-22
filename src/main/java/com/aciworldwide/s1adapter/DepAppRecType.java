
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DepAppRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAppId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAppInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAppStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAppRec_Type", propOrder = {
    "depAppId",
    "depAppInfo",
    "depAppStatus"
})
public class DepAppRecType {

    @XmlElement(name = "DepAppId", required = true)
    protected String depAppId;
    @XmlElement(name = "DepAppInfo", required = true)
    protected DepAppInfoType depAppInfo;
    @XmlElement(name = "DepAppStatus")
    protected DepAppStatusType depAppStatus;

    /**
     * Gets the value of the depAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepAppId() {
        return depAppId;
    }

    /**
     * Sets the value of the depAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepAppId(String value) {
        this.depAppId = value;
    }

    /**
     * Gets the value of the depAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppInfoType }
     *     
     */
    public DepAppInfoType getDepAppInfo() {
        return depAppInfo;
    }

    /**
     * Sets the value of the depAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppInfoType }
     *     
     */
    public void setDepAppInfo(DepAppInfoType value) {
        this.depAppInfo = value;
    }

    /**
     * Gets the value of the depAppStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppStatusType }
     *     
     */
    public DepAppStatusType getDepAppStatus() {
        return depAppStatus;
    }

    /**
     * Sets the value of the depAppStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppStatusType }
     *     
     */
    public void setDepAppStatus(DepAppStatusType value) {
        this.depAppStatus = value;
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
