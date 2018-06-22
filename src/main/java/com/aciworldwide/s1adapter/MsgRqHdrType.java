
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for MsgRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EMVRqData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NetworkTrnInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PointOfServiceData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}MsgAuthCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRqHdr_Type", propOrder = {
    "emvRqData",
    "networkTrnInfo",
    "pointOfServiceData",
    "msgAuthCode"
})
public class MsgRqHdrType {

    @XmlElement(name = "EMVRqData")
    protected EMVRqDataType emvRqData;
    @XmlElement(name = "NetworkTrnInfo")
    protected NetworkTrnInfoType networkTrnInfo;
    @XmlElement(name = "PointOfServiceData")
    protected PointOfServiceDataType pointOfServiceData;
    @XmlElement(name = "MsgAuthCode")
    protected MsgAuthCodeType msgAuthCode;

    /**
     * Gets the value of the emvRqData property.
     * 
     * @return
     *     possible object is
     *     {@link EMVRqDataType }
     *     
     */
    public EMVRqDataType getEMVRqData() {
        return emvRqData;
    }

    /**
     * Sets the value of the emvRqData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMVRqDataType }
     *     
     */
    public void setEMVRqData(EMVRqDataType value) {
        this.emvRqData = value;
    }

    /**
     * Gets the value of the networkTrnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkTrnInfoType }
     *     
     */
    public NetworkTrnInfoType getNetworkTrnInfo() {
        return networkTrnInfo;
    }

    /**
     * Sets the value of the networkTrnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkTrnInfoType }
     *     
     */
    public void setNetworkTrnInfo(NetworkTrnInfoType value) {
        this.networkTrnInfo = value;
    }

    /**
     * Gets the value of the pointOfServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfServiceDataType }
     *     
     */
    public PointOfServiceDataType getPointOfServiceData() {
        return pointOfServiceData;
    }

    /**
     * Sets the value of the pointOfServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfServiceDataType }
     *     
     */
    public void setPointOfServiceData(PointOfServiceDataType value) {
        this.pointOfServiceData = value;
    }

    /**
     * Gets the value of the msgAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link MsgAuthCodeType }
     *     
     */
    public MsgAuthCodeType getMsgAuthCode() {
        return msgAuthCode;
    }

    /**
     * Sets the value of the msgAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgAuthCodeType }
     *     
     */
    public void setMsgAuthCode(MsgAuthCodeType value) {
        this.msgAuthCode = value;
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
