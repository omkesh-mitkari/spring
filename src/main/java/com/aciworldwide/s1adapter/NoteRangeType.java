
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for NoteRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NoteNumStart" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}NoteNumEnd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteRange_Type", propOrder = {
    "noteNumStart",
    "noteNumEnd"
})
public class NoteRangeType {

    @XmlElement(name = "NoteNumStart")
    protected String noteNumStart;
    @XmlElement(name = "NoteNumEnd")
    protected String noteNumEnd;

    /**
     * Gets the value of the noteNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteNumStart() {
        return noteNumStart;
    }

    /**
     * Sets the value of the noteNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteNumStart(String value) {
        this.noteNumStart = value;
    }

    /**
     * Gets the value of the noteNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteNumEnd() {
        return noteNumEnd;
    }

    /**
     * Sets the value of the noteNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteNumEnd(String value) {
        this.noteNumEnd = value;
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
