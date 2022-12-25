/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Loan Syndication. */
package org.museframework.bian.loansyndication.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SyndicatedLoanApplicationProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureParameterType;

    /*A selected optional business service as subject matter of Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature syndicatedLoanApplicationProcedureSelectedOption;

    /*Request to process Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction syndicatedLoanApplicationProcedureRequest;

    /*Timetable to process Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureSchedule;

    /*The status of Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureStatus;

    /*Reference to the party who is involved in Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility syndicatedLoanApplicationProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureEmployeeReference;

    /*Reference to the customer who is involved in Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureType;

    /*The schedule according to which the service provider will process the Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Syndicated Loan Application Procedure.*/
    @MetaField(0)
    private String syndicatedLoanApplicationProcedureServiceType;

    /*Reference to the product or service that is related to Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct syndicatedLoanApplicationProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction syndicatedLoanApplicationProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement syndicatedLoanApplicationProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement syndicatedLoanApplicationProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Syndicated Loan Application Procedure.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure syndicatedLoanApplicationProcedureReference;

    public void setSyndicatedLoanApplicationProcedureParameterType(String syndicatedLoanApplicationProcedureParameterType) {
        this.syndicatedLoanApplicationProcedureParameterType = syndicatedLoanApplicationProcedureParameterType;
    }

    public String getSyndicatedLoanApplicationProcedureParameterType() {
        return syndicatedLoanApplicationProcedureParameterType;
    }

    public void setSyndicatedLoanApplicationProcedureSelectedOption(org.museframework.bian.classes.Feature syndicatedLoanApplicationProcedureSelectedOption) {
        this.syndicatedLoanApplicationProcedureSelectedOption = syndicatedLoanApplicationProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getSyndicatedLoanApplicationProcedureSelectedOption() {
        return syndicatedLoanApplicationProcedureSelectedOption;
    }

    public void setSyndicatedLoanApplicationProcedureRequest(org.museframework.bian.classes.Instruction syndicatedLoanApplicationProcedureRequest) {
        this.syndicatedLoanApplicationProcedureRequest = syndicatedLoanApplicationProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getSyndicatedLoanApplicationProcedureRequest() {
        return syndicatedLoanApplicationProcedureRequest;
    }

    public void setSyndicatedLoanApplicationProcedureSchedule(String syndicatedLoanApplicationProcedureSchedule) {
        this.syndicatedLoanApplicationProcedureSchedule = syndicatedLoanApplicationProcedureSchedule;
    }

    public String getSyndicatedLoanApplicationProcedureSchedule() {
        return syndicatedLoanApplicationProcedureSchedule;
    }

    public void setSyndicatedLoanApplicationProcedureStatus(String syndicatedLoanApplicationProcedureStatus) {
        this.syndicatedLoanApplicationProcedureStatus = syndicatedLoanApplicationProcedureStatus;
    }

    public String getSyndicatedLoanApplicationProcedureStatus() {
        return syndicatedLoanApplicationProcedureStatus;
    }

    public void setSyndicatedLoanApplicationProcedureAssociatedPartyReference(String syndicatedLoanApplicationProcedureAssociatedPartyReference) {
        this.syndicatedLoanApplicationProcedureAssociatedPartyReference = syndicatedLoanApplicationProcedureAssociatedPartyReference;
    }

    public String getSyndicatedLoanApplicationProcedureAssociatedPartyReference() {
        return syndicatedLoanApplicationProcedureAssociatedPartyReference;
    }

    public void setSyndicatedLoanApplicationProcedureBusinessUnitReference(String syndicatedLoanApplicationProcedureBusinessUnitReference) {
        this.syndicatedLoanApplicationProcedureBusinessUnitReference = syndicatedLoanApplicationProcedureBusinessUnitReference;
    }

    public String getSyndicatedLoanApplicationProcedureBusinessUnitReference() {
        return syndicatedLoanApplicationProcedureBusinessUnitReference;
    }

    public void setSyndicatedLoanApplicationProcedureServiceProviderReference(String syndicatedLoanApplicationProcedureServiceProviderReference) {
        this.syndicatedLoanApplicationProcedureServiceProviderReference = syndicatedLoanApplicationProcedureServiceProviderReference;
    }

    public String getSyndicatedLoanApplicationProcedureServiceProviderReference() {
        return syndicatedLoanApplicationProcedureServiceProviderReference;
    }

    public void setSyndicatedLoanApplicationProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility syndicatedLoanApplicationProcedureFinancialFacilityReference) {
        this.syndicatedLoanApplicationProcedureFinancialFacilityReference = syndicatedLoanApplicationProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getSyndicatedLoanApplicationProcedureFinancialFacilityReference() {
        return syndicatedLoanApplicationProcedureFinancialFacilityReference;
    }

    public void setSyndicatedLoanApplicationProcedureEmployeeReference(String syndicatedLoanApplicationProcedureEmployeeReference) {
        this.syndicatedLoanApplicationProcedureEmployeeReference = syndicatedLoanApplicationProcedureEmployeeReference;
    }

    public String getSyndicatedLoanApplicationProcedureEmployeeReference() {
        return syndicatedLoanApplicationProcedureEmployeeReference;
    }

    public void setSyndicatedLoanApplicationProcedureCustomerReference(String syndicatedLoanApplicationProcedureCustomerReference) {
        this.syndicatedLoanApplicationProcedureCustomerReference = syndicatedLoanApplicationProcedureCustomerReference;
    }

    public String getSyndicatedLoanApplicationProcedureCustomerReference() {
        return syndicatedLoanApplicationProcedureCustomerReference;
    }

    public void setSyndicatedLoanApplicationProcedureType(String syndicatedLoanApplicationProcedureType) {
        this.syndicatedLoanApplicationProcedureType = syndicatedLoanApplicationProcedureType;
    }

    public String getSyndicatedLoanApplicationProcedureType() {
        return syndicatedLoanApplicationProcedureType;
    }

    public void setSyndicatedLoanApplicationProcedureServiceProviderSchedule(String syndicatedLoanApplicationProcedureServiceProviderSchedule) {
        this.syndicatedLoanApplicationProcedureServiceProviderSchedule = syndicatedLoanApplicationProcedureServiceProviderSchedule;
    }

    public String getSyndicatedLoanApplicationProcedureServiceProviderSchedule() {
        return syndicatedLoanApplicationProcedureServiceProviderSchedule;
    }

    public void setSyndicatedLoanApplicationProcedureServiceType(String syndicatedLoanApplicationProcedureServiceType) {
        this.syndicatedLoanApplicationProcedureServiceType = syndicatedLoanApplicationProcedureServiceType;
    }

    public String getSyndicatedLoanApplicationProcedureServiceType() {
        return syndicatedLoanApplicationProcedureServiceType;
    }

    public void setSyndicatedLoanApplicationProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct syndicatedLoanApplicationProcedureProductandServiceInstance) {
        this.syndicatedLoanApplicationProcedureProductandServiceInstance = syndicatedLoanApplicationProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getSyndicatedLoanApplicationProcedureProductandServiceInstance() {
        return syndicatedLoanApplicationProcedureProductandServiceInstance;
    }

    public void setSyndicatedLoanApplicationProcedureTransaction(org.museframework.bian.classes.Transaction syndicatedLoanApplicationProcedureTransaction) {
        this.syndicatedLoanApplicationProcedureTransaction = syndicatedLoanApplicationProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getSyndicatedLoanApplicationProcedureTransaction() {
        return syndicatedLoanApplicationProcedureTransaction;
    }

    public void setSyndicatedLoanApplicationProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement syndicatedLoanApplicationProcedureFinancialTransactionArrangement) {
        this.syndicatedLoanApplicationProcedureFinancialTransactionArrangement = syndicatedLoanApplicationProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getSyndicatedLoanApplicationProcedureFinancialTransactionArrangement() {
        return syndicatedLoanApplicationProcedureFinancialTransactionArrangement;
    }

    public void setSyndicatedLoanApplicationProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement syndicatedLoanApplicationProcedureCustomerAgreementReference) {
        this.syndicatedLoanApplicationProcedureCustomerAgreementReference = syndicatedLoanApplicationProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSyndicatedLoanApplicationProcedureCustomerAgreementReference() {
        return syndicatedLoanApplicationProcedureCustomerAgreementReference;
    }

    public void setSyndicatedLoanApplicationProcedureReference(org.museframework.bian.classes.Procedure syndicatedLoanApplicationProcedureReference) {
        this.syndicatedLoanApplicationProcedureReference = syndicatedLoanApplicationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getSyndicatedLoanApplicationProcedureReference() {
        return syndicatedLoanApplicationProcedureReference;
    }
}