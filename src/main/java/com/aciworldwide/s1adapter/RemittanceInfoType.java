
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for RemittanceInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RelatedRmtInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StructRmtInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}UnstructRmtInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInfo_Type", propOrder = {
    "relatedRmtInfo",
    "structRmtInfo",
    "unstructRmtInfo"
})
public class RemittanceInfoType {

    @XmlElement(name = "RelatedRmtInfo")
    protected String relatedRmtInfo;
    @XmlElement(name = "StructRmtInfo")
    protected StructRmtInfoType structRmtInfo;
    @XmlElement(name = "UnstructRmtInfo")
    protected String unstructRmtInfo;

    /**
     * Gets the value of the relatedRmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedRmtInfo() {
        return relatedRmtInfo;
    }

    /**
     * Sets the value of the relatedRmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedRmtInfo(String value) {
        this.relatedRmtInfo = value;
    }

    /**
     * Gets the value of the structRmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StructRmtInfoType }
     *     
     */
    public StructRmtInfoType getStructRmtInfo() {
        return structRmtInfo;
    }

    /**
     * Sets the value of the structRmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructRmtInfoType }
     *     
     */
    public void setStructRmtInfo(StructRmtInfoType value) {
        this.structRmtInfo = value;
    }

    /**
     * Gets the value of the unstructRmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnstructRmtInfo() {
        return unstructRmtInfo;
    }

    /**
     * Sets the value of the unstructRmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnstructRmtInfo(String value) {
        this.unstructRmtInfo = value;
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
