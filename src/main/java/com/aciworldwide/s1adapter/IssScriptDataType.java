
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
 * <p>Java class for IssScriptData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssScriptData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssPreScriptData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}IssPostScriptData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssScriptData_Type", propOrder = {
    "issPreScriptData",
    "issPostScriptData"
})
public class IssScriptDataType {

    @XmlElement(name = "IssPreScriptData")
    protected List<IssPrePostScriptDataType> issPreScriptData;
    @XmlElement(name = "IssPostScriptData")
    protected List<IssPrePostScriptDataType> issPostScriptData;

    /**
     * Gets the value of the issPreScriptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issPreScriptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssPreScriptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssPrePostScriptDataType }
     * 
     * 
     */
    public List<IssPrePostScriptDataType> getIssPreScriptData() {
        if (issPreScriptData == null) {
            issPreScriptData = new ArrayList<IssPrePostScriptDataType>();
        }
        return this.issPreScriptData;
    }

    /**
     * Gets the value of the issPostScriptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issPostScriptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssPostScriptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssPrePostScriptDataType }
     * 
     * 
     */
    public List<IssPrePostScriptDataType> getIssPostScriptData() {
        if (issPostScriptData == null) {
            issPostScriptData = new ArrayList<IssPrePostScriptDataType>();
        }
        return this.issPostScriptData;
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