
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RefInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IntermediaryDepAcct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FeeChargeAlloc" minOccurs="0"/&gt;
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
    "country",
    "pmtFormat",
    "refInfo",
    "intermediaryDepAcct",
    "feeChargeAlloc"
})
@XmlRootElement(name = "PmtInstruction")
public class PmtInstruction {

    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PmtFormat")
    protected String pmtFormat;
    @XmlElement(name = "RefInfo")
    protected List<RefInfo> refInfo;
    @XmlElement(name = "IntermediaryDepAcct")
    protected List<IntermediaryDepAcct> intermediaryDepAcct;
    @XmlElement(name = "FeeChargeAlloc")
    protected FeeChargeAlloc feeChargeAlloc;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the pmtFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtFormat() {
        return pmtFormat;
    }

    /**
     * Sets the value of the pmtFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtFormat(String value) {
        this.pmtFormat = value;
    }

    /**
     * Gets the value of the refInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefInfo }
     * 
     * 
     */
    public List<RefInfo> getRefInfo() {
        if (refInfo == null) {
            refInfo = new ArrayList<RefInfo>();
        }
        return this.refInfo;
    }

    /**
     * Gets the value of the intermediaryDepAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intermediaryDepAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediaryDepAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediaryDepAcct }
     * 
     * 
     */
    public List<IntermediaryDepAcct> getIntermediaryDepAcct() {
        if (intermediaryDepAcct == null) {
            intermediaryDepAcct = new ArrayList<IntermediaryDepAcct>();
        }
        return this.intermediaryDepAcct;
    }

    /**
     * Gets the value of the feeChargeAlloc property.
     * 
     * @return
     *     possible object is
     *     {@link FeeChargeAlloc }
     *     
     */
    public FeeChargeAlloc getFeeChargeAlloc() {
        return feeChargeAlloc;
    }

    /**
     * Sets the value of the feeChargeAlloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeChargeAlloc }
     *     
     */
    public void setFeeChargeAlloc(FeeChargeAlloc value) {
        this.feeChargeAlloc = value;
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
