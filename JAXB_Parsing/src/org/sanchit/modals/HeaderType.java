//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.07 at 05:23:40 PM IST 
//


package org.sanchit.modals;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="To">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.ncpdp.org/schema/SCRIPT>MailAddressType">
 *                 &lt;attribute name="Qualifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="P|C|M|D|ZZZ"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="From">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.ncpdp.org/schema/SCRIPT>MailAddressType">
 *                 &lt;attribute name="Qualifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="P|C|M|D|ZZZ"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MessageID" type="{http://www.ncpdp.org/schema/SCRIPT}an..35M"/>
 *         &lt;element name="RelatesToMessageID" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="SentTime" type="{http://www.ncpdp.org/schema/SCRIPT}UtcDateType"/>
 *         &lt;element name="Security" type="{http://www.ncpdp.org/schema/SCRIPT}SecurityType" minOccurs="0"/>
 *         &lt;element name="Mailbox" type="{http://www.ncpdp.org/schema/SCRIPT}MailboxType" minOccurs="0"/>
 *         &lt;element name="TestMessage" type="{http://www.ncpdp.org/schema/SCRIPT}n1" minOccurs="0"/>
 *         &lt;element name="RxReferenceNumber" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *         &lt;element name="TertiaryIdentifier" type="{http://www.ncpdp.org/schema/SCRIPT}an..3" minOccurs="0"/>
 *         &lt;element name="PrescriberOrderNumber" type="{http://www.ncpdp.org/schema/SCRIPT}an..35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "to",
    "from",
    "messageID",
    "relatesToMessageID",
    "sentTime",
    "security",
    "mailbox",
    "testMessage",
    "rxReferenceNumber",
    "tertiaryIdentifier",
    "prescriberOrderNumber"
})
public class HeaderType {

    @XmlElement(name = "To", required = true)
    protected HeaderType.To to;
    @XmlElement(name = "From", required = true)
    protected HeaderType.From from;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "RelatesToMessageID")
    protected String relatesToMessageID;
    @XmlElement(name = "SentTime", required = true)
    protected XMLGregorianCalendar sentTime;
    @XmlElement(name = "Security")
    protected SecurityType security;
    @XmlElement(name = "Mailbox")
    protected MailboxType mailbox;
    @XmlElement(name = "TestMessage")
    protected String testMessage;
    @XmlElement(name = "RxReferenceNumber")
    protected String rxReferenceNumber;
    @XmlElement(name = "TertiaryIdentifier")
    protected String tertiaryIdentifier;
    @XmlElement(name = "PrescriberOrderNumber")
    protected String prescriberOrderNumber;

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType.To }
     *     
     */
    public HeaderType.To getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType.To }
     *     
     */
    public void setTo(HeaderType.To value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType.From }
     *     
     */
    public HeaderType.From getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType.From }
     *     
     */
    public void setFrom(HeaderType.From value) {
        this.from = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the relatesToMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatesToMessageID() {
        return relatesToMessageID;
    }

    /**
     * Sets the value of the relatesToMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatesToMessageID(String value) {
        this.relatesToMessageID = value;
    }

    /**
     * Gets the value of the sentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentTime() {
        return sentTime;
    }

    /**
     * Sets the value of the sentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentTime(XMLGregorianCalendar value) {
        this.sentTime = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType }
     *     
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType }
     *     
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Gets the value of the mailbox property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxType }
     *     
     */
    public MailboxType getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxType }
     *     
     */
    public void setMailbox(MailboxType value) {
        this.mailbox = value;
    }

    /**
     * Gets the value of the testMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestMessage() {
        return testMessage;
    }

    /**
     * Sets the value of the testMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestMessage(String value) {
        this.testMessage = value;
    }

    /**
     * Gets the value of the rxReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxReferenceNumber() {
        return rxReferenceNumber;
    }

    /**
     * Sets the value of the rxReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxReferenceNumber(String value) {
        this.rxReferenceNumber = value;
    }

    /**
     * Gets the value of the tertiaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiaryIdentifier() {
        return tertiaryIdentifier;
    }

    /**
     * Sets the value of the tertiaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiaryIdentifier(String value) {
        this.tertiaryIdentifier = value;
    }

    /**
     * Gets the value of the prescriberOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriberOrderNumber() {
        return prescriberOrderNumber;
    }

    /**
     * Sets the value of the prescriberOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriberOrderNumber(String value) {
        this.prescriberOrderNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.ncpdp.org/schema/SCRIPT>MailAddressType">
     *       &lt;attribute name="Qualifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="P|C|M|D|ZZZ"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class From {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Qualifier")
        protected String qualifier;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifier() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifier(String value) {
            this.qualifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.ncpdp.org/schema/SCRIPT>MailAddressType">
     *       &lt;attribute name="Qualifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="P|C|M|D|ZZZ"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class To {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Qualifier")
        protected String qualifier;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifier() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifier(String value) {
            this.qualifier = value;
        }

    }

}