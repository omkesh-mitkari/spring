
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
 * <p>Java class for POSSecurity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSSecurity_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PSSNetworkType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PSSMsgMAC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PSSMsgEncryption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PSSCATSecLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSSecurity_Type", propOrder = {
    "pssNetworkType",
    "pssMsgMAC",
    "pssMsgEncryption",
    "psscatSecLevel"
})
public class POSSecurityType {

    @XmlElement(name = "PSSNetworkType")
    protected String pssNetworkType;
    @XmlElement(name = "PSSMsgMAC")
    protected List<String> pssMsgMAC;
    @XmlElement(name = "PSSMsgEncryption")
    protected List<String> pssMsgEncryption;
    @XmlElement(name = "PSSCATSecLevel")
    protected String psscatSecLevel;

    /**
     * Gets the value of the pssNetworkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSSNetworkType() {
        return pssNetworkType;
    }

    /**
     * Sets the value of the pssNetworkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSSNetworkType(String value) {
        this.pssNetworkType = value;
    }

    /**
     * Gets the value of the pssMsgMAC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pssMsgMAC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSSMsgMAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPSSMsgMAC() {
        if (pssMsgMAC == null) {
            pssMsgMAC = new ArrayList<String>();
        }
        return this.pssMsgMAC;
    }

    /**
     * Gets the value of the pssMsgEncryption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pssMsgEncryption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSSMsgEncryption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPSSMsgEncryption() {
        if (pssMsgEncryption == null) {
            pssMsgEncryption = new ArrayList<String>();
        }
        return this.pssMsgEncryption;
    }

    /**
     * Gets the value of the psscatSecLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSSCATSecLevel() {
        return psscatSecLevel;
    }

    /**
     * Sets the value of the psscatSecLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSSCATSecLevel(String value) {
        this.psscatSecLevel = value;
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
