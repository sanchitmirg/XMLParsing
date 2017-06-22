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
 * <p>Java class for BodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}NewRx"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RefillRequest"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RefillResponse"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RxChangeRequest"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RxChangeResponse"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RxFill"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Status"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Error"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Verify"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}GetMessage"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}PasswordChange"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}CancelRx"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}CancelRxResponse"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RxHistoryRequest"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}RxHistoryResponse"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Census"/>
 *         &lt;element ref="{http://www.ncpdp.org/schema/SCRIPT}Resupply"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", propOrder = {
    "newRx",
    "refillRequest",
    "refillResponse",
    "rxChangeRequest",
    "rxChangeResponse",
    "rxFill",
    "status",
    "error",
    "verify",
    "getMessage",
    "passwordChange",
    "cancelRx",
    "cancelRxResponse",
    "rxHistoryRequest",
    "rxHistoryResponse",
    "census",
    "resupply"
})
public class BodyType {

    @XmlElement(name = "NewRx")
    protected NewRx newRx;
    @XmlElement(name = "RefillRequest")
    protected RefillRequest refillRequest;
    @XmlElement(name = "RefillResponse")
    protected RefillResponse refillResponse;
    @XmlElement(name = "RxChangeRequest")
    protected RxChangeRequest rxChangeRequest;
    @XmlElement(name = "RxChangeResponse")
    protected RxChangeResponse rxChangeResponse;
    @XmlElement(name = "RxFill")
    protected RxFill rxFill;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "Verify")
    protected Verify verify;
    @XmlElement(name = "GetMessage")
    protected GetMessage getMessage;
    @XmlElement(name = "PasswordChange")
    protected PasswordChange passwordChange;
    @XmlElement(name = "CancelRx")
    protected CancelRx cancelRx;
    @XmlElement(name = "CancelRxResponse")
    protected CancelRxResponse cancelRxResponse;
    @XmlElement(name = "RxHistoryRequest")
    protected RxHistoryRequest rxHistoryRequest;
    @XmlElement(name = "RxHistoryResponse")
    protected RxHistoryResponse rxHistoryResponse;
    @XmlElement(name = "Census")
    protected Census census;
    @XmlElement(name = "Resupply")
    protected Resupply resupply;

    /**
     * Gets the value of the newRx property.
     * 
     * @return
     *     possible object is
     *     {@link NewRx }
     *     
     */
    public NewRx getNewRx() {
        return newRx;
    }

    /**
     * Sets the value of the newRx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRx }
     *     
     */
    public void setNewRx(NewRx value) {
        this.newRx = value;
    }

    /**
     * Gets the value of the refillRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RefillRequest }
     *     
     */
    public RefillRequest getRefillRequest() {
        return refillRequest;
    }

    /**
     * Sets the value of the refillRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefillRequest }
     *     
     */
    public void setRefillRequest(RefillRequest value) {
        this.refillRequest = value;
    }

    /**
     * Gets the value of the refillResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RefillResponse }
     *     
     */
    public RefillResponse getRefillResponse() {
        return refillResponse;
    }

    /**
     * Sets the value of the refillResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefillResponse }
     *     
     */
    public void setRefillResponse(RefillResponse value) {
        this.refillResponse = value;
    }

    /**
     * Gets the value of the rxChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RxChangeRequest }
     *     
     */
    public RxChangeRequest getRxChangeRequest() {
        return rxChangeRequest;
    }

    /**
     * Sets the value of the rxChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RxChangeRequest }
     *     
     */
    public void setRxChangeRequest(RxChangeRequest value) {
        this.rxChangeRequest = value;
    }

    /**
     * Gets the value of the rxChangeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RxChangeResponse }
     *     
     */
    public RxChangeResponse getRxChangeResponse() {
        return rxChangeResponse;
    }

    /**
     * Sets the value of the rxChangeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RxChangeResponse }
     *     
     */
    public void setRxChangeResponse(RxChangeResponse value) {
        this.rxChangeResponse = value;
    }

    /**
     * Gets the value of the rxFill property.
     * 
     * @return
     *     possible object is
     *     {@link RxFill }
     *     
     */
    public RxFill getRxFill() {
        return rxFill;
    }

    /**
     * Sets the value of the rxFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link RxFill }
     *     
     */
    public void setRxFill(RxFill value) {
        this.rxFill = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the verify property.
     * 
     * @return
     *     possible object is
     *     {@link Verify }
     *     
     */
    public Verify getVerify() {
        return verify;
    }

    /**
     * Sets the value of the verify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verify }
     *     
     */
    public void setVerify(Verify value) {
        this.verify = value;
    }

    /**
     * Gets the value of the getMessage property.
     * 
     * @return
     *     possible object is
     *     {@link GetMessage }
     *     
     */
    public GetMessage getGetMessage() {
        return getMessage;
    }

    /**
     * Sets the value of the getMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMessage }
     *     
     */
    public void setGetMessage(GetMessage value) {
        this.getMessage = value;
    }

    /**
     * Gets the value of the passwordChange property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordChange }
     *     
     */
    public PasswordChange getPasswordChange() {
        return passwordChange;
    }

    /**
     * Sets the value of the passwordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordChange }
     *     
     */
    public void setPasswordChange(PasswordChange value) {
        this.passwordChange = value;
    }

    /**
     * Gets the value of the cancelRx property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRx }
     *     
     */
    public CancelRx getCancelRx() {
        return cancelRx;
    }

    /**
     * Sets the value of the cancelRx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRx }
     *     
     */
    public void setCancelRx(CancelRx value) {
        this.cancelRx = value;
    }

    /**
     * Gets the value of the cancelRxResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRxResponse }
     *     
     */
    public CancelRxResponse getCancelRxResponse() {
        return cancelRxResponse;
    }

    /**
     * Sets the value of the cancelRxResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRxResponse }
     *     
     */
    public void setCancelRxResponse(CancelRxResponse value) {
        this.cancelRxResponse = value;
    }

    /**
     * Gets the value of the rxHistoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RxHistoryRequest }
     *     
     */
    public RxHistoryRequest getRxHistoryRequest() {
        return rxHistoryRequest;
    }

    /**
     * Sets the value of the rxHistoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RxHistoryRequest }
     *     
     */
    public void setRxHistoryRequest(RxHistoryRequest value) {
        this.rxHistoryRequest = value;
    }

    /**
     * Gets the value of the rxHistoryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RxHistoryResponse }
     *     
     */
    public RxHistoryResponse getRxHistoryResponse() {
        return rxHistoryResponse;
    }

    /**
     * Sets the value of the rxHistoryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RxHistoryResponse }
     *     
     */
    public void setRxHistoryResponse(RxHistoryResponse value) {
        this.rxHistoryResponse = value;
    }

    /**
     * Gets the value of the census property.
     * 
     * @return
     *     possible object is
     *     {@link Census }
     *     
     */
    public Census getCensus() {
        return census;
    }

    /**
     * Sets the value of the census property.
     * 
     * @param value
     *     allowed object is
     *     {@link Census }
     *     
     */
    public void setCensus(Census value) {
        this.census = value;
    }

    /**
     * Gets the value of the resupply property.
     * 
     * @return
     *     possible object is
     *     {@link Resupply }
     *     
     */
    public Resupply getResupply() {
        return resupply;
    }

    /**
     * Sets the value of the resupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resupply }
     *     
     */
    public void setResupply(Resupply value) {
        this.resupply = value;
    }

}
