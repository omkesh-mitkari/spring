
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Deposit Account Memo Inquiry output
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctMemoInqRs" minOccurs="0"/&gt;
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
    "depAcctMemoInqRs"
})
@XmlRootElement(name = "DepAcctMemoInqOut")
public class DepAcctMemoInqOut {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "SignonRs")
    protected SignonRs signonRs;
    @XmlElement(name = "DepAcctMemoInqRs")
    protected DepAcctMemoInqRs depAcctMemoInqRs;

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
     * Gets the value of the depAcctMemoInqRs property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctMemoInqRs }
     *     
     */
    public DepAcctMemoInqRs getDepAcctMemoInqRs() {
        return depAcctMemoInqRs;
    }

    /**
     * Sets the value of the depAcctMemoInqRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctMemoInqRs }
     *     
     */
    public void setDepAcctMemoInqRs(DepAcctMemoInqRs value) {
        this.depAcctMemoInqRs = value;
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
