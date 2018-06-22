
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for EMVRsData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMVRsData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AuthRsCode"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssAuthData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssScriptData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMVRsData_Type", propOrder = {
    "authRsCode",
    "issAuthData",
    "issScriptData"
})
public class EMVRsDataType {

    @XmlElement(name = "AuthRsCode", required = true)
    protected String authRsCode;
    @XmlElement(name = "IssAuthData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] issAuthData;
    @XmlElement(name = "IssScriptData")
    protected IssScriptDataType issScriptData;

    /**
     * Gets the value of the authRsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRsCode() {
        return authRsCode;
    }

    /**
     * Sets the value of the authRsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRsCode(String value) {
        this.authRsCode = value;
    }

    /**
     * Gets the value of the issAuthData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIssAuthData() {
        return issAuthData;
    }

    /**
     * Sets the value of the issAuthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssAuthData(byte[] value) {
        this.issAuthData = value;
    }

    /**
     * Gets the value of the issScriptData property.
     * 
     * @return
     *     possible object is
     *     {@link IssScriptDataType }
     *     
     */
    public IssScriptDataType getIssScriptData() {
        return issScriptData;
    }

    /**
     * Sets the value of the issScriptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssScriptDataType }
     *     
     */
    public void setIssScriptData(IssScriptDataType value) {
        this.issScriptData = value;
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
