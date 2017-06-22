//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.07 at 05:23:40 PM IST 
//


package org.sanchit.modals;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeniedNewRxToFollowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeniedNewRxToFollowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DenialReasonCode" maxOccurs="10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="AA|AB|AC|AD|AE|AF|AG|AH|AJ|AK|AL|AM|AN|AO|AP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceNumber" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="DenialReason" type="{http://www.ncpdp.org/schema/SCRIPT}an..70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeniedNewRxToFollowType", propOrder = {
    "denialReasonCode",
    "referenceNumber",
    "denialReason"
})
public class DeniedNewRxToFollowType {

    @XmlElement(name = "DenialReasonCode")
    protected List<String> denialReasonCode;
    @XmlElement(name = "ReferenceNumber")
    protected String referenceNumber;
    @XmlElement(name = "DenialReason")
    protected String denialReason;

    /**
     * Gets the value of the denialReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denialReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenialReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDenialReasonCode() {
        if (denialReasonCode == null) {
            denialReasonCode = new ArrayList<String>();
        }
        return this.denialReasonCode;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the denialReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReason() {
        return denialReason;
    }

    /**
     * Sets the value of the denialReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialReason(String value) {
        this.denialReason = value;
    }

}
