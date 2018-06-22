
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ACHPmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHPmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ACHCompanyId"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ACHStdEntryClass"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}ACHDrCRAll" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHPmtInfo_Type", propOrder = {
    "achCompanyId",
    "achStdEntryClass",
    "achDrCRAll"
})
@XmlSeeAlso({
    ACHPmtInfo.class
})
public class ACHPmtInfoType {

    @XmlElement(name = "ACHCompanyId")
    protected String achCompanyId;
    @XmlElement(name = "ACHStdEntryClass")
    protected String achStdEntryClass;
    @XmlElement(name = "ACHDrCRAll")
    protected String achDrCRAll;

    /**
     * Gets the value of the achCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACHCompanyId() {
        return achCompanyId;
    }

    /**
     * Sets the value of the achCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACHCompanyId(String value) {
        this.achCompanyId = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACHStdEntryClass(String value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the achDrCRAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACHDrCRAll() {
        return achDrCRAll;
    }

    /**
     * Sets the value of the achDrCRAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACHDrCRAll(String value) {
        this.achDrCRAll = value;
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
