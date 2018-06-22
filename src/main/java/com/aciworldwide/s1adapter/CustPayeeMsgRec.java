
package com.aciworldwide.s1adapter;

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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeAddRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeModRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeTypeModRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}CustPayeeDelRs"/&gt;
 *         &lt;/choice&gt;
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
    "custId",
    "msgRecDt",
    "custPayeeAddRs",
    "custPayeeModRs",
    "custPayeeTypeModRs",
    "custPayeeDelRs"
})
@XmlRootElement(name = "CustPayeeMsgRec")
public class CustPayeeMsgRec {

    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "CustPayeeAddRs")
    protected CustPayeeAddRs custPayeeAddRs;
    @XmlElement(name = "CustPayeeModRs")
    protected CustPayeeModRs custPayeeModRs;
    @XmlElement(name = "CustPayeeTypeModRs")
    protected CustPayeeTypeModRs custPayeeTypeModRs;
    @XmlElement(name = "CustPayeeDelRs")
    protected CustPayeeDelRs custPayeeDelRs;

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustId }
     *     
     */
    public CustId getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustId }
     *     
     */
    public void setCustId(CustId value) {
        this.custId = value;
    }

    /**
     * Gets the value of the msgRecDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgRecDt() {
        return msgRecDt;
    }

    /**
     * Sets the value of the msgRecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgRecDt(XMLGregorianCalendar value) {
        this.msgRecDt = value;
    }

    /**
     * Gets the value of the custPayeeAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeAddRs }
     *     
     */
    public CustPayeeAddRs getCustPayeeAddRs() {
        return custPayeeAddRs;
    }

    /**
     * Sets the value of the custPayeeAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeAddRs }
     *     
     */
    public void setCustPayeeAddRs(CustPayeeAddRs value) {
        this.custPayeeAddRs = value;
    }

    /**
     * Gets the value of the custPayeeModRs property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeModRs }
     *     
     */
    public CustPayeeModRs getCustPayeeModRs() {
        return custPayeeModRs;
    }

    /**
     * Sets the value of the custPayeeModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeModRs }
     *     
     */
    public void setCustPayeeModRs(CustPayeeModRs value) {
        this.custPayeeModRs = value;
    }

    /**
     * Gets the value of the custPayeeTypeModRs property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeTypeModRs }
     *     
     */
    public CustPayeeTypeModRs getCustPayeeTypeModRs() {
        return custPayeeTypeModRs;
    }

    /**
     * Sets the value of the custPayeeTypeModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeTypeModRs }
     *     
     */
    public void setCustPayeeTypeModRs(CustPayeeTypeModRs value) {
        this.custPayeeTypeModRs = value;
    }

    /**
     * Gets the value of the custPayeeDelRs property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeDelRs }
     *     
     */
    public CustPayeeDelRs getCustPayeeDelRs() {
        return custPayeeDelRs;
    }

    /**
     * Sets the value of the custPayeeDelRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeDelRs }
     *     
     */
    public void setCustPayeeDelRs(CustPayeeDelRs value) {
        this.custPayeeDelRs = value;
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
