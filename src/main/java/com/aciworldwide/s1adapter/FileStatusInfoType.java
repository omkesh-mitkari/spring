
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
 * <p>Java class for FileStatusInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileStatusInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileNumber"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}PartnerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}HostFileNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}EventName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TotalAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TotalTransactions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TransProccessed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TransSucceded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TransFailed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}TransSkipped" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileContent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileHashType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://aciworldwide.com/S1Adapter}FileHashValue" minOccurs="0"/&gt;
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
@XmlType(name = "FileStatusInfo_Type", propOrder = {
    "fileNumber",
    "fileName",
    "fileType",
    "fileStatus",
    "partnerId",
    "hostFileNumber",
    "effDt",
    "eventName",
    "totalAmt",
    "totalTransactions",
    "transProccessed",
    "transSucceded",
    "transFailed",
    "transSkipped",
    "fileContent",
    "fileHashType",
    "fileHashValue",
    "tunneledData"
})
public class FileStatusInfoType {

    @XmlElement(name = "FileNumber", required = true)
    protected String fileNumber;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "FileType")
    protected String fileType;
    @XmlElement(name = "FileStatus")
    protected String fileStatus;
    @XmlElement(name = "PartnerId")
    protected String partnerId;
    @XmlElement(name = "HostFileNumber")
    protected String hostFileNumber;
    @XmlElement(name = "EffDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDt;
    @XmlElement(name = "EventName")
    protected String eventName;
    @XmlElement(name = "TotalAmt")
    protected TotalAmt totalAmt;
    @XmlElement(name = "TotalTransactions")
    protected Long totalTransactions;
    @XmlElement(name = "TransProccessed")
    protected Long transProccessed;
    @XmlElement(name = "TransSucceded")
    protected Long transSucceded;
    @XmlElement(name = "TransFailed")
    protected Long transFailed;
    @XmlElement(name = "TransSkipped")
    protected Long transSkipped;
    @XmlElement(name = "FileContent")
    protected String fileContent;
    @XmlElement(name = "FileHashType")
    protected String fileHashType;
    @XmlElement(name = "FileHashValue")
    protected String fileHashValue;
    @XmlElement(name = "TunneledData")
    protected List<MapElement> tunneledData;

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileStatus() {
        return fileStatus;
    }

    /**
     * Sets the value of the fileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileStatus(String value) {
        this.fileStatus = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the hostFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostFileNumber() {
        return hostFileNumber;
    }

    /**
     * Sets the value of the hostFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostFileNumber(String value) {
        this.hostFileNumber = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDt(XMLGregorianCalendar value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmt }
     *     
     */
    public TotalAmt getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmt }
     *     
     */
    public void setTotalAmt(TotalAmt value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the totalTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalTransactions() {
        return totalTransactions;
    }

    /**
     * Sets the value of the totalTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalTransactions(Long value) {
        this.totalTransactions = value;
    }

    /**
     * Gets the value of the transProccessed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransProccessed() {
        return transProccessed;
    }

    /**
     * Sets the value of the transProccessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransProccessed(Long value) {
        this.transProccessed = value;
    }

    /**
     * Gets the value of the transSucceded property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransSucceded() {
        return transSucceded;
    }

    /**
     * Sets the value of the transSucceded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransSucceded(Long value) {
        this.transSucceded = value;
    }

    /**
     * Gets the value of the transFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransFailed() {
        return transFailed;
    }

    /**
     * Sets the value of the transFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransFailed(Long value) {
        this.transFailed = value;
    }

    /**
     * Gets the value of the transSkipped property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransSkipped() {
        return transSkipped;
    }

    /**
     * Sets the value of the transSkipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransSkipped(Long value) {
        this.transSkipped = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileContent(String value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the fileHashType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHashType() {
        return fileHashType;
    }

    /**
     * Sets the value of the fileHashType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHashType(String value) {
        this.fileHashType = value;
    }

    /**
     * Gets the value of the fileHashValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHashValue() {
        return fileHashValue;
    }

    /**
     * Sets the value of the fileHashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHashValue(String value) {
        this.fileHashValue = value;
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
