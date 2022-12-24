/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Instruction. */
package org.museframework.bian.paymentinstruction.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.PaymentInstructionProcedure
@MetaDto
public class PaymentInstructionProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureParameterType;

    /*A selected optional business service as subject matter of Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature paymentInstructionProcedureSelectedOption;

    /*Request to process Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction paymentInstructionProcedureRequest;

    /*Timetable to process Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureSchedule;

    /*The status of Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureStatus;

    /*Reference to the party who is involved in Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility paymentInstructionProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureEmployeeReference;

    /*Reference to the customer who is involved in Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureType;

    /*The schedule according to which the service provider will process the Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Payment Instruction Procedure*/
    @MetaField
    private String paymentInstructionProcedureServiceType;

    /*Reference to the product or service that is related to Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct paymentInstructionProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction paymentInstructionProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement paymentInstructionProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement paymentInstructionProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Payment Instruction Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure paymentInstructionProcedureReference;

    public void setPaymentInstructionProcedureParameterType(String paymentInstructionProcedureParameterType) {
        this.paymentInstructionProcedureParameterType = paymentInstructionProcedureParameterType;
    }

    public String getPaymentInstructionProcedureParameterType() {
        return paymentInstructionProcedureParameterType;
    }

    public void setPaymentInstructionProcedureSelectedOption(org.museframework.bian.classes.Feature paymentInstructionProcedureSelectedOption) {
        this.paymentInstructionProcedureSelectedOption = paymentInstructionProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getPaymentInstructionProcedureSelectedOption() {
        return paymentInstructionProcedureSelectedOption;
    }

    public void setPaymentInstructionProcedureRequest(org.museframework.bian.classes.Instruction paymentInstructionProcedureRequest) {
        this.paymentInstructionProcedureRequest = paymentInstructionProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getPaymentInstructionProcedureRequest() {
        return paymentInstructionProcedureRequest;
    }

    public void setPaymentInstructionProcedureSchedule(String paymentInstructionProcedureSchedule) {
        this.paymentInstructionProcedureSchedule = paymentInstructionProcedureSchedule;
    }

    public String getPaymentInstructionProcedureSchedule() {
        return paymentInstructionProcedureSchedule;
    }

    public void setPaymentInstructionProcedureStatus(String paymentInstructionProcedureStatus) {
        this.paymentInstructionProcedureStatus = paymentInstructionProcedureStatus;
    }

    public String getPaymentInstructionProcedureStatus() {
        return paymentInstructionProcedureStatus;
    }

    public void setPaymentInstructionProcedureAssociatedPartyReference(String paymentInstructionProcedureAssociatedPartyReference) {
        this.paymentInstructionProcedureAssociatedPartyReference = paymentInstructionProcedureAssociatedPartyReference;
    }

    public String getPaymentInstructionProcedureAssociatedPartyReference() {
        return paymentInstructionProcedureAssociatedPartyReference;
    }

    public void setPaymentInstructionProcedureBusinessUnitReference(String paymentInstructionProcedureBusinessUnitReference) {
        this.paymentInstructionProcedureBusinessUnitReference = paymentInstructionProcedureBusinessUnitReference;
    }

    public String getPaymentInstructionProcedureBusinessUnitReference() {
        return paymentInstructionProcedureBusinessUnitReference;
    }

    public void setPaymentInstructionProcedureServiceProviderReference(String paymentInstructionProcedureServiceProviderReference) {
        this.paymentInstructionProcedureServiceProviderReference = paymentInstructionProcedureServiceProviderReference;
    }

    public String getPaymentInstructionProcedureServiceProviderReference() {
        return paymentInstructionProcedureServiceProviderReference;
    }

    public void setPaymentInstructionProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility paymentInstructionProcedureFinancialFacilityReference) {
        this.paymentInstructionProcedureFinancialFacilityReference = paymentInstructionProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getPaymentInstructionProcedureFinancialFacilityReference() {
        return paymentInstructionProcedureFinancialFacilityReference;
    }

    public void setPaymentInstructionProcedureEmployeeReference(String paymentInstructionProcedureEmployeeReference) {
        this.paymentInstructionProcedureEmployeeReference = paymentInstructionProcedureEmployeeReference;
    }

    public String getPaymentInstructionProcedureEmployeeReference() {
        return paymentInstructionProcedureEmployeeReference;
    }

    public void setPaymentInstructionProcedureCustomerReference(String paymentInstructionProcedureCustomerReference) {
        this.paymentInstructionProcedureCustomerReference = paymentInstructionProcedureCustomerReference;
    }

    public String getPaymentInstructionProcedureCustomerReference() {
        return paymentInstructionProcedureCustomerReference;
    }

    public void setPaymentInstructionProcedureType(String paymentInstructionProcedureType) {
        this.paymentInstructionProcedureType = paymentInstructionProcedureType;
    }

    public String getPaymentInstructionProcedureType() {
        return paymentInstructionProcedureType;
    }

    public void setPaymentInstructionProcedureServiceProviderSchedule(String paymentInstructionProcedureServiceProviderSchedule) {
        this.paymentInstructionProcedureServiceProviderSchedule = paymentInstructionProcedureServiceProviderSchedule;
    }

    public String getPaymentInstructionProcedureServiceProviderSchedule() {
        return paymentInstructionProcedureServiceProviderSchedule;
    }

    public void setPaymentInstructionProcedureServiceType(String paymentInstructionProcedureServiceType) {
        this.paymentInstructionProcedureServiceType = paymentInstructionProcedureServiceType;
    }

    public String getPaymentInstructionProcedureServiceType() {
        return paymentInstructionProcedureServiceType;
    }

    public void setPaymentInstructionProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct paymentInstructionProcedureProductandServiceInstance) {
        this.paymentInstructionProcedureProductandServiceInstance = paymentInstructionProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getPaymentInstructionProcedureProductandServiceInstance() {
        return paymentInstructionProcedureProductandServiceInstance;
    }

    public void setPaymentInstructionProcedureTransaction(org.museframework.bian.classes.Transaction paymentInstructionProcedureTransaction) {
        this.paymentInstructionProcedureTransaction = paymentInstructionProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getPaymentInstructionProcedureTransaction() {
        return paymentInstructionProcedureTransaction;
    }

    public void setPaymentInstructionProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement paymentInstructionProcedureFinancialTransactionArrangement) {
        this.paymentInstructionProcedureFinancialTransactionArrangement = paymentInstructionProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getPaymentInstructionProcedureFinancialTransactionArrangement() {
        return paymentInstructionProcedureFinancialTransactionArrangement;
    }

    public void setPaymentInstructionProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement paymentInstructionProcedureCustomerAgreementReference) {
        this.paymentInstructionProcedureCustomerAgreementReference = paymentInstructionProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getPaymentInstructionProcedureCustomerAgreementReference() {
        return paymentInstructionProcedureCustomerAgreementReference;
    }

    public void setPaymentInstructionProcedureReference(org.museframework.bian.classes.Procedure paymentInstructionProcedureReference) {
        this.paymentInstructionProcedureReference = paymentInstructionProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getPaymentInstructionProcedureReference() {
        return paymentInstructionProcedureReference;
    }
}