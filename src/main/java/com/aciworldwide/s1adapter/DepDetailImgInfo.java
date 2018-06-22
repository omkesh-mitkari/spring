
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * S1 Added Aggregate - Deposit Slip Image Information
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}DepAcctTrnRec"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}UniqueImageId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SideOfImage"/&gt;
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
    "depAcctTrnRec",
    "uniqueImageId",
    "sideOfImage"
})
@XmlRootElement(name = "DepDetailImgInfo")
public class DepDetailImgInfo {

    @XmlElement(name = "DepAcctTrnRec", required = true)
    protected DepAcctTrnRec depAcctTrnRec;
    @XmlElement(name = "UniqueImageId")
    protected String uniqueImageId;
    @XmlElement(name = "SideOfImage", required = true)
    protected String sideOfImage;

    /**
     * Gets the value of the depAcctTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctTrnRec }
     *     
     */
    public DepAcctTrnRec getDepAcctTrnRec() {
        return depAcctTrnRec;
    }

    /**
     * Sets the value of the depAcctTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctTrnRec }
     *     
     */
    public void setDepAcctTrnRec(DepAcctTrnRec value) {
        this.depAcctTrnRec = value;
    }

    /**
     * Gets the value of the uniqueImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueImageId() {
        return uniqueImageId;
    }

    /**
     * Sets the value of the uniqueImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueImageId(String value) {
        this.uniqueImageId = value;
    }

    /**
     * Gets the value of the sideOfImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideOfImage() {
        return sideOfImage;
    }

    /**
     * Sets the value of the sideOfImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideOfImage(String value) {
        this.sideOfImage = value;
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
