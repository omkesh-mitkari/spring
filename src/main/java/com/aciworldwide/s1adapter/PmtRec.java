
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtId"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtStatus"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtRemitInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CreatedDt" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}OrigPmtPrcDt"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}OrigPmtDueDt"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FIDebitTrcNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FICreditTrcNum" minOccurs="0"/&gt;
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
    "pmtId",
    "recPmtId",
    "pmtInfo",
    "pmtStatus",
    "pmtRemitInfo",
    "createdDt",
    "origPmtPrcDt",
    "origPmtDueDt",
    "fiDebitTrcNum",
    "fiCreditTrcNum"
})
@XmlRootElement(name = "PmtRec")
public class PmtRec {

    @XmlElement(name = "PmtId", required = true)
    protected String pmtId;
    @XmlElement(name = "RecPmtId")
    protected String recPmtId;
    @XmlElement(name = "PmtInfo", required = true)
    protected PmtInfo pmtInfo;
    @XmlElement(name = "PmtStatus", required = true)
    protected PmtStatus pmtStatus;
    @XmlElement(name = "PmtRemitInfo")
    protected PmtRemitInfo pmtRemitInfo;
    @XmlElement(name = "CreatedDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDt;
    @XmlElement(name = "OrigPmtPrcDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origPmtPrcDt;
    @XmlElement(name = "OrigPmtDueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origPmtDueDt;
    @XmlElement(name = "FIDebitTrcNum")
    protected String fiDebitTrcNum;
    @XmlElement(name = "FICreditTrcNum")
    protected String fiCreditTrcNum;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtId(String value) {
        this.pmtId = value;
    }

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
     * Gets the value of the pmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatus }
     *     
     */
    public PmtStatus getPmtStatus() {
        return pmtStatus;
    }

    /**
     * Sets the value of the pmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatus }
     *     
     */
    public void setPmtStatus(PmtStatus value) {
        this.pmtStatus = value;
    }

    /**
     * Gets the value of the pmtRemitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRemitInfo }
     *     
     */
    public PmtRemitInfo getPmtRemitInfo() {
        return pmtRemitInfo;
    }

    /**
     * Sets the value of the pmtRemitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRemitInfo }
     *     
     */
    public void setPmtRemitInfo(PmtRemitInfo value) {
        this.pmtRemitInfo = value;
    }

    /**
     * Gets the value of the createdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDt() {
        return createdDt;
    }

    /**
     * Sets the value of the createdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDt(XMLGregorianCalendar value) {
        this.createdDt = value;
    }

    /**
     * Gets the value of the origPmtPrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigPmtPrcDt() {
        return origPmtPrcDt;
    }

    /**
     * Sets the value of the origPmtPrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigPmtPrcDt(XMLGregorianCalendar value) {
        this.origPmtPrcDt = value;
    }

    /**
     * Gets the value of the origPmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigPmtDueDt() {
        return origPmtDueDt;
    }

    /**
     * Sets the value of the origPmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigPmtDueDt(XMLGregorianCalendar value) {
        this.origPmtDueDt = value;
    }

    /**
     * Gets the value of the fiDebitTrcNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIDebitTrcNum() {
        return fiDebitTrcNum;
    }

    /**
     * Sets the value of the fiDebitTrcNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIDebitTrcNum(String value) {
        this.fiDebitTrcNum = value;
    }

    /**
     * Gets the value of the fiCreditTrcNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFICreditTrcNum() {
        return fiCreditTrcNum;
    }

    /**
     * Sets the value of the fiCreditTrcNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFICreditTrcNum(String value) {
        this.fiCreditTrcNum = value;
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
