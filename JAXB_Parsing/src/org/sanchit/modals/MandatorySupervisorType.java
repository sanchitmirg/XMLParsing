//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.07 at 05:23:40 PM IST 
//


package org.sanchit.modals;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used in NEWRX
 * 
 * <p>Java class for MandatorySupervisorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandatorySupervisorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.ncpdp.org/schema/SCRIPT}MandatoryProviderIDType"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Specialty" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.ncpdp.org/schema/SCRIPT}MandatoryNameType"/>
 *         &lt;element name="ClinicName" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.ncpdp.org/schema/SCRIPT}MandatoryAddressType"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}CommunicationNumbers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandatorySupervisorType", propOrder = {
    "identification",
    "specialty",
    "name",
    "clinicName",
    "address",
    "communicationNumbers"
})
public class MandatorySupervisorType {

    @XmlElement(name = "Identification", required = true)
    protected MandatoryProviderIDType identification;
    @XmlElement(name = "Specialty")
    protected String specialty;
    @XmlElement(name = "Name", required = true)
    protected MandatoryNameType name;
    @XmlElement(name = "ClinicName")
    protected String clinicName;
    @XmlElement(name = "Address", required = true)
    protected MandatoryAddressType address;
    @XmlElement(name = "CommunicationNumbers", required = true)
    protected CommunicationNumbersType communicationNumbers;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryProviderIDType }
     *     
     */
    public MandatoryProviderIDType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryProviderIDType }
     *     
     */
    public void setIdentification(MandatoryProviderIDType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the specialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Sets the value of the specialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialty(String value) {
        this.specialty = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryNameType }
     *     
     */
    public MandatoryNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryNameType }
     *     
     */
    public void setName(MandatoryNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the clinicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClinicName() {
        return clinicName;
    }

    /**
     * Sets the value of the clinicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClinicName(String value) {
        this.clinicName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryAddressType }
     *     
     */
    public MandatoryAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryAddressType }
     *     
     */
    public void setAddress(MandatoryAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the communicationNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationNumbersType }
     *     
     */
    public CommunicationNumbersType getCommunicationNumbers() {
        return communicationNumbers;
    }

    /**
     * Sets the value of the communicationNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationNumbersType }
     *     
     */
    public void setCommunicationNumbers(CommunicationNumbersType value) {
        this.communicationNumbers = value;
    }

}