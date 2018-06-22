
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecModelInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemainingInsts"/&gt;
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
    "recPmtId",
    "pmtInfo",
    "recModelInfo",
    "remainingInsts"
})
@XmlRootElement(name = "RecPmtRec")
public class RecPmtRec {

    @XmlElement(name = "RecPmtId", required = true)
    protected String recPmtId;
    @XmlElement(name = "PmtInfo", required = true)
    protected PmtInfo pmtInfo;
    @XmlElement(name = "RecModelInfo", required = true)
    protected RecModelInfo recModelInfo;
    @XmlElement(name = "RemainingInsts")
    protected long remainingInsts;

    /**
     * Gets the value of the recPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPmtId() {
        return recPmtId;
    }

    /**
     * Sets the value of the recPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPmtId(String value) {
        this.recPmtId = value;
    }

    /**
     * Gets the value of the pmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtInfo }
     *     
     */
    public PmtInfo getPmtInfo() {
        return pmtInfo;
    }

    /**
     * Sets the value of the pmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtInfo }
     *     
     */
    public void setPmtInfo(PmtInfo value) {
        this.pmtInfo = value;
    }

    /**
     * Gets the value of the recModelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecModelInfo }
     *     
     */
    public RecModelInfo getRecModelInfo() {
        return recModelInfo;
    }

    /**
     * Sets the value of the recModelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecModelInfo }
     *     
     */
    public void setRecModelInfo(RecModelInfo value) {
        this.recModelInfo = value;
    }

    /**
     * Gets the value of the remainingInsts property.
     * 
     */
    public long getRemainingInsts() {
        return remainingInsts;
    }

    /**
     * Sets the value of the remainingInsts property.
     * 
     */
    public void setRemainingInsts(long value) {
        this.remainingInsts = value;
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
