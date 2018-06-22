
package com.aciworldwide.s1adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for FileStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileStatusInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileStatusRec_Type", propOrder = {
    "fileStatusCode",
    "fileStatusInfo"
})
public class FileStatusRecType {

    @XmlElement(name = "FileStatusCode")
    protected String fileStatusCode;
    @XmlElement(name = "FileStatusInfo")
    protected FileStatusInfoType fileStatusInfo;

    /**
     * Gets the value of the fileStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileStatusCode() {
        return fileStatusCode;
    }

    /**
     * Sets the value of the fileStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileStatusCode(String value) {
        this.fileStatusCode = value;
    }

    /**
     * Gets the value of the fileStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FileStatusInfoType }
     *     
     */
    public FileStatusInfoType getFileStatusInfo() {
        return fileStatusInfo;
    }

    /**
     * Sets the value of the fileStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileStatusInfoType }
     *     
     */
    public void setFileStatusInfo(FileStatusInfoType value) {
        this.fileStatusInfo = value;
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
