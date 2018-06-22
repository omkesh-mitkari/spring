
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
 * <p>Java class for SearchCriteria_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FindContact"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FindOrg"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}FindAll"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RecCtrlIn"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Affiliate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CriteriaDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SearchCriteria_Type", propOrder = {
    "findContact",
    "findOrg",
    "findAll",
    "recCtrlIn",
    "affiliate",
    "criteriaDetails",
    "tunneledData"
})
public class SearchCriteriaType {

    @XmlElement(name = "FindContact")
    protected Boolean findContact;
    @XmlElement(name = "FindOrg")
    protected Boolean findOrg;
    @XmlElement(name = "FindAll")
    protected Boolean findAll;
    @XmlElement(name = "RecCtrlIn", required = true)
    protected RecCtrlIn recCtrlIn;
    @XmlElement(name = "Affiliate")
    protected List<String> affiliate;
    @XmlElement(name = "CriteriaDetails")
    protected List<CriteriaDetailsType> criteriaDetails;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the findContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFindContact() {
        return findContact;
    }

    /**
     * Sets the value of the findContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFindContact(Boolean value) {
        this.findContact = value;
    }

    /**
     * Gets the value of the findOrg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFindOrg() {
        return findOrg;
    }

    /**
     * Sets the value of the findOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFindOrg(Boolean value) {
        this.findOrg = value;
    }

    /**
     * Gets the value of the findAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFindAll() {
        return findAll;
    }

    /**
     * Sets the value of the findAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFindAll(Boolean value) {
        this.findAll = value;
    }

    /**
     * Gets the value of the recCtrlIn property.
     * 
     * @return
     *     possible object is
     *     {@link RecCtrlIn }
     *     
     */
    public RecCtrlIn getRecCtrlIn() {
        return recCtrlIn;
    }

    /**
     * Sets the value of the recCtrlIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCtrlIn }
     *     
     */
    public void setRecCtrlIn(RecCtrlIn value) {
        this.recCtrlIn = value;
    }

    /**
     * Gets the value of the affiliate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAffiliate() {
        if (affiliate == null) {
            affiliate = new ArrayList<String>();
        }
        return this.affiliate;
    }

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaDetailsType }
     * 
     * 
     */
    public List<CriteriaDetailsType> getCriteriaDetails() {
        if (criteriaDetails == null) {
            criteriaDetails = new ArrayList<CriteriaDetailsType>();
        }
        return this.criteriaDetails;
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
