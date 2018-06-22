
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanTranBrkoutType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanTranBrkoutAmt"/&gt;
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
    "loanTranBrkoutType",
    "loanTranBrkoutAmt"
})
@XmlRootElement(name = "LoanTranBrkout")
public class LoanTranBrkout {

    @XmlElement(name = "LoanTranBrkoutType", required = true)
    protected String loanTranBrkoutType;
    @XmlElement(name = "LoanTranBrkoutAmt", required = true)
    protected LoanTranBrkoutAmt loanTranBrkoutAmt;

    /**
     * Gets the value of the loanTranBrkoutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTranBrkoutType() {
        return loanTranBrkoutType;
    }

    /**
     * Sets the value of the loanTranBrkoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTranBrkoutType(String value) {
        this.loanTranBrkoutType = value;
    }

    /**
     * Gets the value of the loanTranBrkoutAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LoanTranBrkoutAmt }
     *     
     */
    public LoanTranBrkoutAmt getLoanTranBrkoutAmt() {
        return loanTranBrkoutAmt;
    }

    /**
     * Sets the value of the loanTranBrkoutAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanTranBrkoutAmt }
     *     
     */
    public void setLoanTranBrkoutAmt(LoanTranBrkoutAmt value) {
        this.loanTranBrkoutAmt = value;
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
