
package com.aciworldwide.s1adapter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * S1 added element - Loan Account Statement Inquiry Request
 * 
 * <p>Java class for LoanAcctStmtInqRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAcctStmtInqRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RqUID"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}AsyncRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}RouteInfo"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}CustId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}LoanAcctId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}SelRangeDt"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}UniqueImageId"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}URL"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}MostRecent"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}All"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}UniqueImageId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}StmtType" minOccurs="0"/&gt;
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
@XmlType(name = "LoanAcctStmtInqRq_Type", propOrder = {
    "content"
})
public class LoanAcctStmtInqRqType {

    @XmlElementRefs({
        @XmlElementRef(name = "SelRangeDt", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CustId", namespace = "http://aciworldwide.com/S1Adapter", type = CustId.class, required = false),
        @XmlElementRef(name = "RqUID", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UniqueImageId", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RouteInfo", namespace = "http://aciworldwide.com/S1Adapter", type = RouteInfo.class, required = false),
        @XmlElementRef(name = "MostRecent", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AsyncRqUID", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LoanAcctId", namespace = "http://aciworldwide.com/S1Adapter", type = LoanAcctId.class, required = false),
        @XmlElementRef(name = "All", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TunneledData", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StmtType", namespace = "http://aciworldwide.com/S1Adapter", type = JAXBElement.class, required = false)
    })
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "UniqueImageId" is used by two different parts of a schema. See: 
     * line 4594 of file:/C:/Users/telekunea/eclipse-workspace/demoservice/S1Adapter.xsd
     * line 4589 of file:/C:/Users/telekunea/eclipse-workspace/demoservice/S1Adapter.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SelRangeDtType }{@code >}
     * {@link CustId }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link RouteInfo }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link LoanAcctId }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link MapElement }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
