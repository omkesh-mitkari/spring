
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for BillerRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillerStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BSPReferTo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IndustInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerRec_Type", propOrder = {
    "billerId",
    "billerInfo",
    "billerStatus",
    "bspReferTo",
    "industInfo"
})
public class BillerRecType {

    @XmlElement(name = "BillerId")
    protected List<BillerId> billerId;
    @XmlElement(name = "BillerInfo")
    protected BillerInfoType billerInfo;
    @XmlElement(name = "BillerStatus")
    protected BillerStatusType billerStatus;
    @XmlElement(name = "BSPReferTo")
    protected BSPReferToType bspReferTo;
    @XmlElement(name = "IndustInfo")
    protected IndustInfoType industInfo;

    /**
     * Gets the value of the billerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillerId }
     * 
     * 
     */
    public List<BillerId> getBillerId() {
        if (billerId == null) {
            billerId = new ArrayList<BillerId>();
        }
        return this.billerId;
    }

    /**
     * Gets the value of the billerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillerInfoType }
     *     
     */
    public BillerInfoType getBillerInfo() {
        return billerInfo;
    }

    /**
     * Sets the value of the billerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerInfoType }
     *     
     */
    public void setBillerInfo(BillerInfoType value) {
        this.billerInfo = value;
    }

    /**
     * Gets the value of the billerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillerStatusType }
     *     
     */
    public BillerStatusType getBillerStatus() {
        return billerStatus;
    }

    /**
     * Sets the value of the billerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerStatusType }
     *     
     */
    public void setBillerStatus(BillerStatusType value) {
        this.billerStatus = value;
    }

    /**
     * Gets the value of the bspReferTo property.
     * 
     * @return
     *     possible object is
     *     {@link BSPReferToType }
     *     
     */
    public BSPReferToType getBSPReferTo() {
        return bspReferTo;
    }

    /**
     * Sets the value of the bspReferTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BSPReferToType }
     *     
     */
    public void setBSPReferTo(BSPReferToType value) {
        this.bspReferTo = value;
    }

    /**
     * Gets the value of the industInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndustInfoType }
     *     
     */
    public IndustInfoType getIndustInfo() {
        return industInfo;
    }

    /**
     * Sets the value of the industInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustInfoType }
     *     
     */
    public void setIndustInfo(IndustInfoType value) {
        this.industInfo = value;
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
