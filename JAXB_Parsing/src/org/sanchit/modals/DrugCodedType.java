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
 * <p>Java class for DrugCodedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugCodedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="ProductCodeQualifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="ND|MF|UP"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Strength" type="{http://www.ncpdp.org/schema/SCRIPT}an..70" minOccurs="0"/>
 *         &lt;element name="DrugDBCode" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="DrugDBCodeQualifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="E|G|AF|FD|FG|FI|FL|FM|FN|FS|MC|MD|MG|MM|BPK|GPK|SBD|SCD"/>
 *               &lt;pattern value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FormSourceCode" type="{http://www.ncpdp.org/schema/SCRIPT}SourceCodeList" minOccurs="0"/>
 *         &lt;element name="FormCode" type="{http://www.ncpdp.org/schema/SCRIPT}an..15" minOccurs="0"/>
 *         &lt;element name="StrengthSourceCode" type="{http://www.ncpdp.org/schema/SCRIPT}SourceCodeList" minOccurs="0"/>
 *         &lt;element name="StrengthCode" type="{http://www.ncpdp.org/schema/SCRIPT}an..15" minOccurs="0"/>
 *         &lt;element name="DEASchedule" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="C38046|C48672|C48675|C48676|C48677|C48679"/>
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
@XmlType(name = "DrugCodedType", propOrder = {
    "productCode",
    "productCodeQualifier",
    "strength",
    "drugDBCode",
    "drugDBCodeQualifier",
    "formSourceCode",
    "formCode",
    "strengthSourceCode",
    "strengthCode",
    "deaSchedule"
})
public class DrugCodedType {

    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ProductCodeQualifier")
    protected String productCodeQualifier;
    @XmlElement(name = "Strength")
    protected String strength;
    @XmlElement(name = "DrugDBCode")
    protected String drugDBCode;
    @XmlElement(name = "DrugDBCodeQualifier")
    protected String drugDBCodeQualifier;
    @XmlElement(name = "FormSourceCode")
    protected String formSourceCode;
    @XmlElement(name = "FormCode")
    protected String formCode;
    @XmlElement(name = "StrengthSourceCode")
    protected String strengthSourceCode;
    @XmlElement(name = "StrengthCode")
    protected String strengthCode;
    @XmlElement(name = "DEASchedule")
    protected String deaSchedule;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCodeQualifier() {
        return productCodeQualifier;
    }

    /**
     * Sets the value of the productCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCodeQualifier(String value) {
        this.productCodeQualifier = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrength(String value) {
        this.strength = value;
    }

    /**
     * Gets the value of the drugDBCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugDBCode() {
        return drugDBCode;
    }

    /**
     * Sets the value of the drugDBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugDBCode(String value) {
        this.drugDBCode = value;
    }

    /**
     * Gets the value of the drugDBCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugDBCodeQualifier() {
        return drugDBCodeQualifier;
    }

    /**
     * Sets the value of the drugDBCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugDBCodeQualifier(String value) {
        this.drugDBCodeQualifier = value;
    }

    /**
     * Gets the value of the formSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormSourceCode() {
        return formSourceCode;
    }

    /**
     * Sets the value of the formSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormSourceCode(String value) {
        this.formSourceCode = value;
    }

    /**
     * Gets the value of the formCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormCode() {
        return formCode;
    }

    /**
     * Sets the value of the formCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormCode(String value) {
        this.formCode = value;
    }

    /**
     * Gets the value of the strengthSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrengthSourceCode() {
        return strengthSourceCode;
    }

    /**
     * Sets the value of the strengthSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrengthSourceCode(String value) {
        this.strengthSourceCode = value;
    }

    /**
     * Gets the value of the strengthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrengthCode() {
        return strengthCode;
    }

    /**
     * Sets the value of the strengthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrengthCode(String value) {
        this.strengthCode = value;
    }

    /**
     * Gets the value of the deaSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEASchedule() {
        return deaSchedule;
    }

    /**
     * Sets the value of the deaSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEASchedule(String value) {
        this.deaSchedule = value;
    }

}
