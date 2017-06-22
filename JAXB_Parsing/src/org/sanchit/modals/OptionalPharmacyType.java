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
 * Used in RXHREQ RXHRES 
 * 
 * <p>Java class for OptionalPharmacyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalPharmacyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.ncpdp.org/schema/SCRIPT}OptionalProviderIDType" minOccurs="0"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Specialty" minOccurs="0"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Pharmacist" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.ncpdp.org/schema/SCRIPT}AddressType" minOccurs="0"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}CommunicationNumbers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalPharmacyType", propOrder = {
    "identification",
    "specialty",
    "pharmacist",
    "storeName",
    "address",
    "communicationNumbers"
})
public class OptionalPharmacyType {

    @XmlElement(name = "Identification")
    protected OptionalProviderIDType identification;
    @XmlElement(name = "Specialty")
    protected String specialty;
    @XmlElement(name = "Pharmacist")
    protected NameType pharmacist;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "CommunicationNumbers")
    protected CommunicationNumbersType communicationNumbers;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalProviderIDType }
     *     
     */
    public OptionalProviderIDType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalProviderIDType }
     *     
     */
    public void setIdentification(OptionalProviderIDType value) {
        this.identification = value;
    }

    /**
     * PVD-040 Value A
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
     * Gets the value of the pharmacist property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getPharmacist() {
        return pharmacist;
    }

    /**
     * Sets the value of the pharmacist property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setPharmacist(NameType value) {
        this.pharmacist = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
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
