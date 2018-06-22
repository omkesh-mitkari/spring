
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrgIdType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrgIdNum"/&gt;
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
    "orgIdType",
    "orgIdNum"
})
@XmlRootElement(name = "OrgId")
public class OrgId {

    @XmlElement(name = "OrgIdType", required = true)
    protected String orgIdType;
    @XmlElement(name = "OrgIdNum", required = true)
    protected String orgIdNum;

    /**
     * Gets the value of the orgIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgIdType() {
        return orgIdType;
    }

    /**
     * Sets the value of the orgIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgIdType(String value) {
        this.orgIdType = value;
    }

    /**
     * Gets the value of the orgIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgIdNum() {
        return orgIdNum;
    }

    /**
     * Sets the value of the orgIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgIdNum(String value) {
        this.orgIdNum = value;
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
