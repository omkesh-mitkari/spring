
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for GenAppRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenAppRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GenAppId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GenAppInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}GenAppStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenAppRec_Type", propOrder = {
    "genAppId",
    "genAppInfo",
    "genAppStatus"
})
public class GenAppRecType {

    @XmlElement(name = "GenAppId", required = true)
    protected String genAppId;
    @XmlElement(name = "GenAppInfo", required = true)
    protected GenAppInfoType genAppInfo;
    @XmlElement(name = "GenAppStatus")
    protected GenAppStatusType genAppStatus;

    /**
     * Gets the value of the genAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenAppId() {
        return genAppId;
    }

    /**
     * Sets the value of the genAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenAppId(String value) {
        this.genAppId = value;
    }

    /**
     * Gets the value of the genAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GenAppInfoType }
     *     
     */
    public GenAppInfoType getGenAppInfo() {
        return genAppInfo;
    }

    /**
     * Sets the value of the genAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenAppInfoType }
     *     
     */
    public void setGenAppInfo(GenAppInfoType value) {
        this.genAppInfo = value;
    }

    /**
     * Gets the value of the genAppStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GenAppStatusType }
     *     
     */
    public GenAppStatusType getGenAppStatus() {
        return genAppStatus;
    }

    /**
     * Sets the value of the genAppStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenAppStatusType }
     *     
     */
    public void setGenAppStatus(GenAppStatusType value) {
        this.genAppStatus = value;
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
