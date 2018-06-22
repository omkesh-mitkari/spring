
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtStatusCode"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EffDt"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StatusModBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtAuthId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RemitId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecPmtMod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtAuthCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Memo" minOccurs="0"/&gt;
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
    "pmtStatusCode",
    "statusDesc",
    "effDt",
    "statusModBy",
    "pmtAuthId",
    "remitId",
    "recPmtMod",
    "pmtAuthCount",
    "pmtMethod",
    "chkNum",
    "memo"
})
@XmlRootElement(name = "PmtStatus")
public class PmtStatus {

    @XmlElement(name = "PmtStatusCode", required = true)
    protected String pmtStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;
    @XmlElement(name = "PmtAuthId")
    protected String pmtAuthId;
    @XmlElement(name = "RemitId")
    protected String remitId;
    @XmlElement(name = "RecPmtMod")
    protected Boolean recPmtMod;
    @XmlElement(name = "PmtAuthCount")
    protected Long pmtAuthCount;
    @XmlElement(name = "PmtMethod")
    protected String pmtMethod;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "Memo")
    protected String memo;

    /**
     * Gets the value of the pmtStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStatusCode() {
        return pmtStatusCode;
    }

    /**
     * Sets the value of the pmtStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtStatusCode(String value) {
        this.pmtStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDt(XMLGregorianCalendar value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

    /**
     * Gets the value of the pmtAuthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAuthId() {
        return pmtAuthId;
    }

    /**
     * Sets the value of the pmtAuthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtAuthId(String value) {
        this.pmtAuthId = value;
    }

    /**
     * Gets the value of the remitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitId() {
        return remitId;
    }

    /**
     * Sets the value of the remitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitId(String value) {
        this.remitId = value;
    }

    /**
     * Gets the value of the recPmtMod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecPmtMod() {
        return recPmtMod;
    }

    /**
     * Sets the value of the recPmtMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecPmtMod(Boolean value) {
        this.recPmtMod = value;
    }

    /**
     * Gets the value of the pmtAuthCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPmtAuthCount() {
        return pmtAuthCount;
    }

    /**
     * Sets the value of the pmtAuthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPmtAuthCount(Long value) {
        this.pmtAuthCount = value;
    }

    /**
     * Gets the value of the pmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMethod() {
        return pmtMethod;
    }

    /**
     * Sets the value of the pmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMethod(String value) {
        this.pmtMethod = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
