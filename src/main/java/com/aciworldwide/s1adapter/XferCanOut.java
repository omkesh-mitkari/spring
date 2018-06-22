
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Funds Transfer Cancel output
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SignonRs" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}XferCanRs" minOccurs="0"/&gt;
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
    "status",
    "signonRs",
    "xferCanRs"
})
@XmlRootElement(name = "XferCanOut")
public class XferCanOut {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "SignonRs")
    protected SignonRs signonRs;
    @XmlElement(name = "XferCanRs")
    protected XferCanRsType xferCanRs;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the signonRs property.
     * 
     * @return
     *     possible object is
     *     {@link SignonRs }
     *     
     */
    public SignonRs getSignonRs() {
        return signonRs;
    }

    /**
     * Sets the value of the signonRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonRs }
     *     
     */
    public void setSignonRs(SignonRs value) {
        this.signonRs = value;
    }

    /**
     * Gets the value of the xferCanRs property.
     * 
     * @return
     *     possible object is
     *     {@link XferCanRsType }
     *     
     */
    public XferCanRsType getXferCanRs() {
        return xferCanRs;
    }

    /**
     * Sets the value of the xferCanRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferCanRsType }
     *     
     */
    public void setXferCanRs(XferCanRsType value) {
        this.xferCanRs = value;
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
