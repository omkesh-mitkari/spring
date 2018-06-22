
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LegalName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillRetAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemitName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemitAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrgContact" minOccurs="0"/&gt;
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
    "legalName",
    "name",
    "postAddr",
    "billRetAddr",
    "remitName",
    "remitAddr",
    "orgContact"
})
@XmlRootElement(name = "BillerContact")
public class BillerContact {

    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PostAddr")
    protected PostAddr postAddr;
    @XmlElement(name = "BillRetAddr")
    protected BillRetAddr billRetAddr;
    @XmlElement(name = "RemitName")
    protected String remitName;
    @XmlElement(name = "RemitAddr")
    protected RemitAddr remitAddr;
    @XmlElement(name = "OrgContact")
    protected OrgContact orgContact;

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddr }
     *     
     */
    public PostAddr getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddr }
     *     
     */
    public void setPostAddr(PostAddr value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the billRetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link BillRetAddr }
     *     
     */
    public BillRetAddr getBillRetAddr() {
        return billRetAddr;
    }

    /**
     * Sets the value of the billRetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillRetAddr }
     *     
     */
    public void setBillRetAddr(BillRetAddr value) {
        this.billRetAddr = value;
    }

    /**
     * Gets the value of the remitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitName() {
        return remitName;
    }

    /**
     * Sets the value of the remitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitName(String value) {
        this.remitName = value;
    }

    /**
     * Gets the value of the remitAddr property.
     * 
     * @return
     *     possible object is
     *     {@link RemitAddr }
     *     
     */
    public RemitAddr getRemitAddr() {
        return remitAddr;
    }

    /**
     * Sets the value of the remitAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitAddr }
     *     
     */
    public void setRemitAddr(RemitAddr value) {
        this.remitAddr = value;
    }

    /**
     * Gets the value of the orgContact property.
     * 
     * @return
     *     possible object is
     *     {@link OrgContact }
     *     
     */
    public OrgContact getOrgContact() {
        return orgContact;
    }

    /**
     * Sets the value of the orgContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgContact }
     *     
     */
    public void setOrgContact(OrgContact value) {
        this.orgContact = value;
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
