
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Credit Card Account Statement Inquiry input
 * 
 * <p>Java class for CCAcctStmtInqInp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAcctStmtInqInp_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SignonRq"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CCAcctStmtInqRq"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAcctStmtInqInp_Type", propOrder = {
    "signonRq",
    "ccAcctStmtInqRq"
})
public class CCAcctStmtInqInpType {

    @XmlElement(name = "SignonRq", required = true)
    protected SignonRq signonRq;
    @XmlElement(name = "CCAcctStmtInqRq", required = true)
    protected CCAcctStmtInqRq ccAcctStmtInqRq;

    /**
     * Gets the value of the signonRq property.
     * 
     * @return
     *     possible object is
     *     {@link SignonRq }
     *     
     */
    public SignonRq getSignonRq() {
        return signonRq;
    }

    /**
     * Sets the value of the signonRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonRq }
     *     
     */
    public void setSignonRq(SignonRq value) {
        this.signonRq = value;
    }

    /**
     * Gets the value of the ccAcctStmtInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link CCAcctStmtInqRq }
     *     
     */
    public CCAcctStmtInqRq getCCAcctStmtInqRq() {
        return ccAcctStmtInqRq;
    }

    /**
     * Sets the value of the ccAcctStmtInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAcctStmtInqRq }
     *     
     */
    public void setCCAcctStmtInqRq(CCAcctStmtInqRq value) {
        this.ccAcctStmtInqRq = value;
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
