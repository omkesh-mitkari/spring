
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrgInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrgId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PayeeCountry"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PrcDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PmtLegalRptData" maxOccurs="unbounded"/&gt;
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
    "orgInfo",
    "orgId",
    "payeeCountry",
    "curAmt",
    "prcDt",
    "pmtLegalRptData"
})
@XmlRootElement(name = "PmtLegalRpt")
public class PmtLegalRpt {

    @XmlElement(name = "OrgInfo", required = true)
    protected OrgInfo orgInfo;
    @XmlElement(name = "OrgId")
    protected OrgId orgId;
    @XmlElement(name = "PayeeCountry", required = true)
    protected String payeeCountry;
    @XmlElement(name = "CurAmt")
    protected CurAmt curAmt;
    @XmlElement(name = "PrcDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prcDt;
    @XmlElement(name = "PmtLegalRptData", required = true)
    protected List<PmtLegalRptData> pmtLegalRptData;

    /**
     * Gets the value of the orgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfo }
     *     
     */
    public OrgInfo getOrgInfo() {
        return orgInfo;
    }

    /**
     * Sets the value of the orgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfo }
     *     
     */
    public void setOrgInfo(OrgInfo value) {
        this.orgInfo = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrgId }
     *     
     */
    public OrgId getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgId }
     *     
     */
    public void setOrgId(OrgId value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the payeeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCountry() {
        return payeeCountry;
    }

    /**
     * Sets the value of the payeeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCountry(String value) {
        this.payeeCountry = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmt }
     *     
     */
    public CurAmt getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmt }
     *     
     */
    public void setCurAmt(CurAmt value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the prcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcDt() {
        return prcDt;
    }

    /**
     * Sets the value of the prcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrcDt(XMLGregorianCalendar value) {
        this.prcDt = value;
    }

    /**
     * Gets the value of the pmtLegalRptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtLegalRptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtLegalRptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtLegalRptData }
     * 
     * 
     */
    public List<PmtLegalRptData> getPmtLegalRptData() {
        if (pmtLegalRptData == null) {
            pmtLegalRptData = new ArrayList<PmtLegalRptData>();
        }
        return this.pmtLegalRptData;
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
