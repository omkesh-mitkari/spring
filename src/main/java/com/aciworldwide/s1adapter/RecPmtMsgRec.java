
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
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtAddRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtModRs"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtCanRs"/&gt;
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
    "recPmtAddRs",
    "recPmtModRs",
    "recPmtCanRs"
})
@XmlRootElement(name = "RecPmtMsgRec")
public class RecPmtMsgRec {

    @XmlElement(name = "CustId")
    protected CustId custId;
    @XmlElement(name = "MsgRecDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgRecDt;
    @XmlElement(name = "RecPmtAddRs")
    protected RecPmtAddRs recPmtAddRs;
    @XmlElement(name = "RecPmtModRs")
    protected RecPmtModRs recPmtModRs;
    @XmlElement(name = "RecPmtCanRs")
    protected RecPmtCanRs recPmtCanRs;

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
     * Gets the value of the recPmtAddRs property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtAddRs }
     *     
     */
    public RecPmtAddRs getRecPmtAddRs() {
        return recPmtAddRs;
    }

    /**
     * Sets the value of the recPmtAddRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtAddRs }
     *     
     */
    public void setRecPmtAddRs(RecPmtAddRs value) {
        this.recPmtAddRs = value;
    }

    /**
     * Gets the value of the recPmtModRs property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtModRs }
     *     
     */
    public RecPmtModRs getRecPmtModRs() {
        return recPmtModRs;
    }

    /**
     * Sets the value of the recPmtModRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtModRs }
     *     
     */
    public void setRecPmtModRs(RecPmtModRs value) {
        this.recPmtModRs = value;
    }

    /**
     * Gets the value of the recPmtCanRs property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtCanRs }
     *     
     */
    public RecPmtCanRs getRecPmtCanRs() {
        return recPmtCanRs;
    }

    /**
     * Sets the value of the recPmtCanRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtCanRs }
     *     
     */
    public void setRecPmtCanRs(RecPmtCanRs value) {
        this.recPmtCanRs = value;
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
