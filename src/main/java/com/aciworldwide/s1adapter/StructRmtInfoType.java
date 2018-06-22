
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for StructRmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructRmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RmtOrigInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RmtBnfInfo" minOccurs="0"/&gt;
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PrimaryRmtDocInfo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}AmtPaid" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}InvoiceAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}DiscountAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}AdjustmentInfo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RmtDocDt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SecondaryRmtDocInfo" minOccurs="0"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RmtFreeText" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructRmtInfo_Type", propOrder = {
    "rmtOrigInfo",
    "rmtBnfInfo",
    "primaryRmtDocInfoAndAmtPaidAndInvoiceAmt"
})
public class StructRmtInfoType {

    @XmlElement(name = "RmtOrigInfo")
    protected String rmtOrigInfo;
    @XmlElement(name = "RmtBnfInfo")
    protected String rmtBnfInfo;
    @XmlElementRefs({
        @XmlElementRef(name = "RmtFreeText", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DiscountAmt", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AdjustmentInfo", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PrimaryRmtDocInfo", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InvoiceAmt", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AmtPaid", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RmtDocDt", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecondaryRmtDocInfo", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> primaryRmtDocInfoAndAmtPaidAndInvoiceAmt;

    /**
     * Gets the value of the rmtOrigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtOrigInfo() {
        return rmtOrigInfo;
    }

    /**
     * Sets the value of the rmtOrigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtOrigInfo(String value) {
        this.rmtOrigInfo = value;
    }

    /**
     * Gets the value of the rmtBnfInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtBnfInfo() {
        return rmtBnfInfo;
    }

    /**
     * Sets the value of the rmtBnfInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtBnfInfo(String value) {
        this.rmtBnfInfo = value;
    }

    /**
     * Gets the value of the primaryRmtDocInfoAndAmtPaidAndInvoiceAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryRmtDocInfoAndAmtPaidAndInvoiceAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryRmtDocInfoAndAmtPaidAndInvoiceAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getPrimaryRmtDocInfoAndAmtPaidAndInvoiceAmt() {
        if (primaryRmtDocInfoAndAmtPaidAndInvoiceAmt == null) {
            primaryRmtDocInfoAndAmtPaidAndInvoiceAmt = new ArrayList<JAXBElement<String>>();
        }
        return this.primaryRmtDocInfoAndAmtPaidAndInvoiceAmt;
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
