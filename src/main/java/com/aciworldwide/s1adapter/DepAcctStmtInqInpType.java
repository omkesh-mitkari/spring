
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Deposit Account Statement Inquiry input
 * 
 * <p>Java class for DepAcctStmtInqInp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAcctStmtInqInp_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SignonRq"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctStmtInqRq"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAcctStmtInqInp_Type", propOrder = {
    "signonRq",
    "depAcctStmtInqRq"
})
public class DepAcctStmtInqInpType {

    @XmlElement(name = "SignonRq", required = true)
    protected SignonRq signonRq;
    @XmlElement(name = "DepAcctStmtInqRq", required = true)
    protected DepAcctStmtInqRq depAcctStmtInqRq;

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
     * Gets the value of the depAcctStmtInqRq property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctStmtInqRq }
     *     
     */
    public DepAcctStmtInqRq getDepAcctStmtInqRq() {
        return depAcctStmtInqRq;
    }

    /**
     * Sets the value of the depAcctStmtInqRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctStmtInqRq }
     *     
     */
    public void setDepAcctStmtInqRq(DepAcctStmtInqRq value) {
        this.depAcctStmtInqRq = value;
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
