
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for MsgRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EMVRsData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ServerTerminalSeqId" minOccurs="0"/&gt;
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
@XmlType(name = "MsgRsHdr_Type", propOrder = {
    "emvRsData",
    "serverTerminalSeqId",
    "msgAuthCode"
})
public class MsgRsHdrType {

    @XmlElement(name = "EMVRsData")
    protected EMVRsDataType emvRsData;
    @XmlElement(name = "ServerTerminalSeqId")
    protected String serverTerminalSeqId;
    @XmlElement(name = "MsgAuthCode")
    protected MsgAuthCodeType msgAuthCode;

    /**
     * Gets the value of the emvRsData property.
     * 
     * @return
     *     possible object is
     *     {@link EMVRsDataType }
     *     
     */
    public EMVRsDataType getEMVRsData() {
        return emvRsData;
    }

    /**
     * Sets the value of the emvRsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMVRsDataType }
     *     
     */
    public void setEMVRsData(EMVRsDataType value) {
        this.emvRsData = value;
    }

    /**
     * Gets the value of the serverTerminalSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerTerminalSeqId() {
        return serverTerminalSeqId;
    }

    /**
     * Sets the value of the serverTerminalSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerTerminalSeqId(String value) {
        this.serverTerminalSeqId = value;
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
