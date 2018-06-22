
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
 * <p>Java class for BillCounts_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillCounts_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillStatusCounts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}BillPmtStatusCounts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillCounts_Type", propOrder = {
    "billStatusCounts",
    "billPmtStatusCounts"
})
public class BillCountsType {

    @XmlElement(name = "BillStatusCounts")
    protected List<BillStatusCountsType> billStatusCounts;
    @XmlElement(name = "BillPmtStatusCounts")
    protected List<BillPmtStatusCountsType> billPmtStatusCounts;

    /**
     * Gets the value of the billStatusCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billStatusCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillStatusCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillStatusCountsType }
     * 
     * 
     */
    public List<BillStatusCountsType> getBillStatusCounts() {
        if (billStatusCounts == null) {
            billStatusCounts = new ArrayList<BillStatusCountsType>();
        }
        return this.billStatusCounts;
    }

    /**
     * Gets the value of the billPmtStatusCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billPmtStatusCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillPmtStatusCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillPmtStatusCountsType }
     * 
     * 
     */
    public List<BillPmtStatusCountsType> getBillPmtStatusCounts() {
        if (billPmtStatusCounts == null) {
            billPmtStatusCounts = new ArrayList<BillPmtStatusCountsType>();
        }
        return this.billPmtStatusCounts;
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
