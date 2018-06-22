
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SignonPswd"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SessKey"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustLangPref"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ClientApp"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ClientDt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SuppressEcho" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "signonPswd",
    "sessKey",
    "custLangPref",
    "clientApp",
    "clientDt",
    "suppressEcho",
    "tunneledData"
})
@XmlRootElement(name = "SignonRq")
public class SignonRq {

    @XmlElement(name = "SignonPswd")
    protected SignonPswd signonPswd;
    @XmlElement(name = "SessKey")
    protected String sessKey;
    @XmlElement(name = "CustLangPref", required = true)
    protected String custLangPref;
    @XmlElement(name = "ClientApp", required = true)
    protected ClientApp clientApp;
    @XmlElement(name = "ClientDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientDt;
    @XmlElement(name = "SuppressEcho")
    protected Boolean suppressEcho;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the signonPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SignonPswd }
     *     
     */
    public SignonPswd getSignonPswd() {
        return signonPswd;
    }

    /**
     * Sets the value of the signonPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonPswd }
     *     
     */
    public void setSignonPswd(SignonPswd value) {
        this.signonPswd = value;
    }

    /**
     * Gets the value of the sessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessKey() {
        return sessKey;
    }

    /**
     * Sets the value of the sessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessKey(String value) {
        this.sessKey = value;
    }

    /**
     * Gets the value of the custLangPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLangPref() {
        return custLangPref;
    }

    /**
     * Sets the value of the custLangPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLangPref(String value) {
        this.custLangPref = value;
    }

    /**
     * Gets the value of the clientApp property.
     * 
     * @return
     *     possible object is
     *     {@link ClientApp }
     *     
     */
    public ClientApp getClientApp() {
        return clientApp;
    }

    /**
     * Sets the value of the clientApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientApp }
     *     
     */
    public void setClientApp(ClientApp value) {
        this.clientApp = value;
    }

    /**
     * Gets the value of the clientDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientDt() {
        return clientDt;
    }

    /**
     * Sets the value of the clientDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientDt(XMLGregorianCalendar value) {
        this.clientDt = value;
    }

    /**
     * Gets the value of the suppressEcho property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressEcho() {
        return suppressEcho;
    }

    /**
     * Sets the value of the suppressEcho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressEcho(Boolean value) {
        this.suppressEcho = value;
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
