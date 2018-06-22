
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PresAcctId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresAcctId_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillingAcct"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresAcctId_Type", propOrder = {
    "billingAcct",
    "billerId"
})
public class PresAcctIdType {

    @XmlElement(name = "BillingAcct", required = true)
    protected String billingAcct;
    @XmlElement(name = "BillerId", required = true)
    protected BillerId billerId;

    /**
     * Gets the value of the billingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAcct() {
        return billingAcct;
    }

    /**
     * Sets the value of the billingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAcct(String value) {
        this.billingAcct = value;
    }

    /**
     * Gets the value of the billerId property.
     * 
     * @return
     *     possible object is
     *     {@link BillerId }
     *     
     */
    public BillerId getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerId }
     *     
     */
    public void setBillerId(BillerId value) {
        this.billerId = value;
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
