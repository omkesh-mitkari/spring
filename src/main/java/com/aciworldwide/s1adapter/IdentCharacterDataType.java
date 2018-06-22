
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for IdentCharacterData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentCharacterData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StartDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}OrigIssueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentProgramId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentReadMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentVerifyMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentVerifyEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IdentVerifyResults" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentCharacterData_Type", propOrder = {
    "identType",
    "expDt",
    "startDt",
    "origIssueDt",
    "identProgramId",
    "identReadMethod",
    "identVerifyMethod",
    "identVerifyEntity",
    "identConditions",
    "identVerifyResults"
})
public class IdentCharacterDataType {

    @XmlElement(name = "IdentType", required = true)
    protected String identType;
    @XmlElement(name = "ExpDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDt;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "OrigIssueDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origIssueDt;
    @XmlElement(name = "IdentProgramId")
    protected String identProgramId;
    @XmlElement(name = "IdentReadMethod")
    protected List<String> identReadMethod;
    @XmlElement(name = "IdentVerifyMethod")
    protected List<String> identVerifyMethod;
    @XmlElement(name = "IdentVerifyEntity")
    protected List<String> identVerifyEntity;
    @XmlElement(name = "IdentConditions")
    protected List<String> identConditions;
    @XmlElement(name = "IdentVerifyResults")
    protected List<String> identVerifyResults;

    /**
     * Gets the value of the identType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentType() {
        return identType;
    }

    /**
     * Sets the value of the identType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentType(String value) {
        this.identType = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDt(XMLGregorianCalendar value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the origIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigIssueDt() {
        return origIssueDt;
    }

    /**
     * Sets the value of the origIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigIssueDt(XMLGregorianCalendar value) {
        this.origIssueDt = value;
    }

    /**
     * Gets the value of the identProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentProgramId() {
        return identProgramId;
    }

    /**
     * Sets the value of the identProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentProgramId(String value) {
        this.identProgramId = value;
    }

    /**
     * Gets the value of the identReadMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identReadMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentReadMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentReadMethod() {
        if (identReadMethod == null) {
            identReadMethod = new ArrayList<String>();
        }
        return this.identReadMethod;
    }

    /**
     * Gets the value of the identVerifyMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerifyMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerifyMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentVerifyMethod() {
        if (identVerifyMethod == null) {
            identVerifyMethod = new ArrayList<String>();
        }
        return this.identVerifyMethod;
    }

    /**
     * Gets the value of the identVerifyEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerifyEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerifyEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentVerifyEntity() {
        if (identVerifyEntity == null) {
            identVerifyEntity = new ArrayList<String>();
        }
        return this.identVerifyEntity;
    }

    /**
     * Gets the value of the identConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentConditions() {
        if (identConditions == null) {
            identConditions = new ArrayList<String>();
        }
        return this.identConditions;
    }

    /**
     * Gets the value of the identVerifyResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerifyResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerifyResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentVerifyResults() {
        if (identVerifyResults == null) {
            identVerifyResults = new ArrayList<String>();
        }
        return this.identVerifyResults;
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
