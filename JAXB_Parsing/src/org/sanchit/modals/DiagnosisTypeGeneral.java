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
 * <p>Java class for DiagnosisTypeGeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosisTypeGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceOfInformation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="P|C"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}EffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ExpirationDate" minOccurs="0"/>
 *         &lt;element name="ProblemType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemDescriptionLong"/>
 *                   &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemNumber" minOccurs="0"/>
 *                   &lt;element name="CodeListQualifier" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="LD"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProblemNameCoded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemDescriptionLong"/>
 *                   &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemNumber" minOccurs="0"/>
 *                   &lt;element name="CodeListQualifier" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="ABF|DX|LD"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisTypeGeneral", propOrder = {
    "sourceOfInformation",
    "effectiveDate",
    "expirationDate",
    "problemType",
    "problemNameCoded"
})
public class DiagnosisTypeGeneral {

    @XmlElement(name = "SourceOfInformation")
    protected String sourceOfInformation;
    @XmlElement(name = "EffectiveDate")
    protected DateType effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected DateType expirationDate;
    @XmlElement(name = "ProblemType")
    protected DiagnosisTypeGeneral.ProblemType problemType;
    @XmlElement(name = "ProblemNameCoded", required = true)
    protected DiagnosisTypeGeneral.ProblemNameCoded problemNameCoded;

    /**
     * Gets the value of the sourceOfInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfInformation() {
        return sourceOfInformation;
    }

    /**
     * Sets the value of the sourceOfInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfInformation(String value) {
        this.sourceOfInformation = value;
    }

    /**
     * DIA-020 07
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEffectiveDate(DateType value) {
        this.effectiveDate = value;
    }

    /**
     * DIA-020 36
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setExpirationDate(DateType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisTypeGeneral.ProblemType }
     *     
     */
    public DiagnosisTypeGeneral.ProblemType getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisTypeGeneral.ProblemType }
     *     
     */
    public void setProblemType(DiagnosisTypeGeneral.ProblemType value) {
        this.problemType = value;
    }

    /**
     * Gets the value of the problemNameCoded property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisTypeGeneral.ProblemNameCoded }
     *     
     */
    public DiagnosisTypeGeneral.ProblemNameCoded getProblemNameCoded() {
        return problemNameCoded;
    }

    /**
     * Sets the value of the problemNameCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisTypeGeneral.ProblemNameCoded }
     *     
     */
    public void setProblemNameCoded(DiagnosisTypeGeneral.ProblemNameCoded value) {
        this.problemNameCoded = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemDescriptionLong"/>
     *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemNumber" minOccurs="0"/>
     *         &lt;element name="CodeListQualifier" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="ABF|DX|LD"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemDescriptionLong",
        "itemNumber",
        "codeListQualifier"
    })
    public static class ProblemNameCoded {

        @XmlElement(name = "ItemDescriptionLong", required = true)
        protected String itemDescriptionLong;
        @XmlElement(name = "ItemNumber")
        protected String itemNumber;
        @XmlElement(name = "CodeListQualifier")
        protected String codeListQualifier;

        /**
         * Gets the value of the itemDescriptionLong property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemDescriptionLong() {
            return itemDescriptionLong;
        }

        /**
         * Sets the value of the itemDescriptionLong property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemDescriptionLong(String value) {
            this.itemDescriptionLong = value;
        }

        /**
         * Gets the value of the itemNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemNumber() {
            return itemNumber;
        }

        /**
         * Sets the value of the itemNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemNumber(String value) {
            this.itemNumber = value;
        }

        /**
         * Gets the value of the codeListQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeListQualifier() {
            return codeListQualifier;
        }

        /**
         * Sets the value of the codeListQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeListQualifier(String value) {
            this.codeListQualifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemDescriptionLong"/>
     *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}ItemNumber" minOccurs="0"/>
     *         &lt;element name="CodeListQualifier" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="LD"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemDescriptionLong",
        "itemNumber",
        "codeListQualifier"
    })
    public static class ProblemType {

        @XmlElement(name = "ItemDescriptionLong", required = true)
        protected String itemDescriptionLong;
        @XmlElement(name = "ItemNumber")
        protected String itemNumber;
        @XmlElement(name = "CodeListQualifier")
        protected String codeListQualifier;

        /**
         * Gets the value of the itemDescriptionLong property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemDescriptionLong() {
            return itemDescriptionLong;
        }

        /**
         * Sets the value of the itemDescriptionLong property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemDescriptionLong(String value) {
            this.itemDescriptionLong = value;
        }

        /**
         * Gets the value of the itemNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemNumber() {
            return itemNumber;
        }

        /**
         * Sets the value of the itemNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemNumber(String value) {
            this.itemNumber = value;
        }

        /**
         * Gets the value of the codeListQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeListQualifier() {
            return codeListQualifier;
        }

        /**
         * Sets the value of the codeListQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeListQualifier(String value) {
            this.codeListQualifier = value;
        }

    }

}
