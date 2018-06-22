
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
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtAddRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtModRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtStatusModRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtCanRs"/&gt;
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
    "pmtAddRs",
    "pmtModRs",
    "pmtStatusModRs",
    "pmtCanRs"
})
@XmlRootElement(name = "PmtMsgRec")
public class PmtMsgRec {

    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "PmtAddRs")
    protected PmtAddRs pmtAddRs;
    @XmlElement(name = "PmtModRs")
    protected PmtModRs pmtModRs;
    @XmlElement(name = "PmtStatusModRs")
    protected PmtStatusModRs pmtStatusModRs;
    @XmlElement(name = "PmtCanRs")
    protected PmtCanRs pmtCanRs;

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
     * Gets the value of the pmtAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAddRs }
     *     
     */
    public PmtAddRs getPmtAddRs() {
        return pmtAddRs;
    }

    /**
     * Sets the value of the pmtAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAddRs }
     *     
     */
    public void setPmtAddRs(PmtAddRs value) {
        this.pmtAddRs = value;
    }

    /**
     * Gets the value of the pmtModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtModRs }
     *     
     */
    public PmtModRs getPmtModRs() {
        return pmtModRs;
    }

    /**
     * Sets the value of the pmtModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtModRs }
     *     
     */
    public void setPmtModRs(PmtModRs value) {
        this.pmtModRs = value;
    }

    /**
     * Gets the value of the pmtStatusModRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatusModRs }
     *     
     */
    public PmtStatusModRs getPmtStatusModRs() {
        return pmtStatusModRs;
    }

    /**
     * Sets the value of the pmtStatusModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatusModRs }
     *     
     */
    public void setPmtStatusModRs(PmtStatusModRs value) {
        this.pmtStatusModRs = value;
    }

    /**
     * Gets the value of the pmtCanRs property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCanRs }
     *     
     */
    public PmtCanRs getPmtCanRs() {
        return pmtCanRs;
    }

    /**
     * Sets the value of the pmtCanRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCanRs }
     *     
     */
    public void setPmtCanRs(PmtCanRs value) {
        this.pmtCanRs = value;
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
