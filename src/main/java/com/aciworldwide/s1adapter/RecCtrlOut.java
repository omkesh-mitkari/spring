
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}MatchedRec"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SentRec"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}Cursor" minOccurs="0"/&gt;
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
    "matchedRec",
    "sentRec",
    "cursor"
})
@XmlRootElement(name = "RecCtrlOut")
public class RecCtrlOut {

    @XmlElement(name = "MatchedRec")
    protected long matchedRec;
    @XmlElement(name = "SentRec")
    protected long sentRec;
    @XmlElement(name = "Cursor")
    protected Cursor cursor;

    /**
     * Gets the value of the matchedRec property.
     * 
     */
    public long getMatchedRec() {
        return matchedRec;
    }

    /**
     * Sets the value of the matchedRec property.
     * 
     */
    public void setMatchedRec(long value) {
        this.matchedRec = value;
    }

    /**
     * Gets the value of the sentRec property.
     * 
     */
    public long getSentRec() {
        return sentRec;
    }

    /**
     * Sets the value of the sentRec property.
     * 
     */
    public void setSentRec(long value) {
        this.sentRec = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link Cursor }
     *     
     */
    public Cursor getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cursor }
     *     
     */
    public void setCursor(Cursor value) {
        this.cursor = value;
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
