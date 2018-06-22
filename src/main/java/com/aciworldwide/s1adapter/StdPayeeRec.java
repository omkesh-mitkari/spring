
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StdPayeeId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StdPayeeInfo"/&gt;
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
    "stdPayeeId",
    "stdPayeeInfo"
})
@XmlRootElement(name = "StdPayeeRec")
public class StdPayeeRec {

    @XmlElement(name = "StdPayeeId", required = true)
    protected StdPayeeId stdPayeeId;
    @XmlElement(name = "StdPayeeInfo", required = true)
    protected StdPayeeInfo stdPayeeInfo;

    /**
     * Gets the value of the stdPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeId }
     *     
     */
    public StdPayeeId getStdPayeeId() {
        return stdPayeeId;
    }

    /**
     * Sets the value of the stdPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeId }
     *     
     */
    public void setStdPayeeId(StdPayeeId value) {
        this.stdPayeeId = value;
    }

    /**
     * Gets the value of the stdPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeInfo }
     *     
     */
    public StdPayeeInfo getStdPayeeInfo() {
        return stdPayeeInfo;
    }

    /**
     * Sets the value of the stdPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeInfo }
     *     
     */
    public void setStdPayeeInfo(StdPayeeInfo value) {
        this.stdPayeeInfo = value;
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
