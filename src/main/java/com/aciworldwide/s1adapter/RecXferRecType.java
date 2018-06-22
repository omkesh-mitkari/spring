
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
 * <p>Java class for RecXferRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecXferId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}XferInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecModelInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemainingInsts"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TunneledData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecXferRec_Type", propOrder = {
    "recXferId",
    "xferInfo",
    "recModelInfo",
    "remainingInsts",
    "tunneledData"
})
public class RecXferRecType {

    @XmlElement(name = "RecXferId", required = true)
    protected String recXferId;
    @XmlElement(name = "XferInfo", required = true)
    protected XferInfo xferInfo;
    @XmlElement(name = "RecModelInfo", required = true)
    protected RecModelInfo recModelInfo;
    @XmlElement(name = "RemainingInsts")
    protected long remainingInsts;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the recXferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecXferId() {
        return recXferId;
    }

    /**
     * Sets the value of the recXferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecXferId(String value) {
        this.recXferId = value;
    }

    /**
     * Gets the value of the xferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XferInfo }
     *     
     */
    public XferInfo getXferInfo() {
        return xferInfo;
    }

    /**
     * Sets the value of the xferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferInfo }
     *     
     */
    public void setXferInfo(XferInfo value) {
        this.xferInfo = value;
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
     * Gets the value of the tunneledData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunneledData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunneledData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapElement }
     * 
     * 
     */
    public List<MapElement> getTunneledData() {
        if (tunneledData == null) {
            tunneledData = new ArrayList<MapElement>();
        }
        return this.tunneledData;
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
