
package com.aciworldwide.s1adapter;

import java.math.BigDecimal;
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
 * <p>Java class for Image_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ImageDataString" type="{http://aciworldwide.com/S1Adapter}C"/&gt;
 *           &lt;element name="ImageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}URL"/&gt;
 *           &lt;element name="Text" type="{http://aciworldwide.com/S1Adapter}C"/&gt;
 *           &lt;element ref="{http://aciworldwide.com/S1Adapter}UniqueImageId"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}ImageType"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}SideOfImage" minOccurs="0"/&gt;
 *         &lt;element name="ImageHeight" type="{http://aciworldwide.com/S1Adapter}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="ImageWidth" type="{http://aciworldwide.com/S1Adapter}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://aciworldwide.com/S1Adapter}NC" minOccurs="0"/&gt;
 *         &lt;element name="ImageDate" type="{http://aciworldwide.com/S1Adapter}Date" minOccurs="0"/&gt;
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
@XmlType(name = "Image_Type", propOrder = {
    "imageDataString",
    "imageData",
    "url",
    "text",
    "uniqueImageId",
    "imageType",
    "sideOfImage",
    "imageHeight",
    "imageWidth",
    "description",
    "imageDate",
    "tunneledData"
})
public class ImageType {

    @XmlElement(name = "ImageDataString")
    protected String imageDataString;
    @XmlElement(name = "ImageData")
    protected byte[] imageData;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "UniqueImageId")
    protected String uniqueImageId;
    @XmlElement(name = "ImageType", required = true)
    protected String imageType;
    @XmlElement(name = "SideOfImage")
    protected String sideOfImage;
    @XmlElement(name = "ImageHeight")
    protected BigDecimal imageHeight;
    @XmlElement(name = "ImageWidth")
    protected BigDecimal imageWidth;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ImageDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imageDate;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the imageDataString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDataString() {
        return imageDataString;
    }

    /**
     * Sets the value of the imageDataString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDataString(String value) {
        this.imageDataString = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageData(byte[] value) {
        this.imageData = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the uniqueImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueImageId() {
        return uniqueImageId;
    }

    /**
     * Sets the value of the uniqueImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueImageId(String value) {
        this.uniqueImageId = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the sideOfImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideOfImage() {
        return sideOfImage;
    }

    /**
     * Sets the value of the sideOfImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideOfImage(String value) {
        this.sideOfImage = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImageHeight(BigDecimal value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImageWidth(BigDecimal value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the imageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImageDate() {
        return imageDate;
    }

    /**
     * Sets the value of the imageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImageDate(XMLGregorianCalendar value) {
        this.imageDate = value;
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
