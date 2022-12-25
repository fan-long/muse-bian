/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Order Allocation. */
package org.museframework.bian.orderallocation.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SecuritiesAllocationProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureParameterType;

    /*A selected optional business service as subject matter of Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature securitiesAllocationProcedureSelectedOption;

    /*Request to process Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction securitiesAllocationProcedureRequest;

    /*Timetable to process Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureSchedule;

    /*The status of Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureStatus;

    /*Reference to the party who is involved in Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility securitiesAllocationProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureEmployeeReference;

    /*Reference to the customer who is involved in Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureType;

    /*The schedule according to which the service provider will process the Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Securities Allocation Procedure*/
    @MetaField(0)
    private String securitiesAllocationProcedureServiceType;

    /*Reference to the product or service that is related to Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct securitiesAllocationProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction securitiesAllocationProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement securitiesAllocationProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement securitiesAllocationProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Securities Allocation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure securitiesAllocationProcedureReference;

    public void setSecuritiesAllocationProcedureParameterType(String securitiesAllocationProcedureParameterType) {
        this.securitiesAllocationProcedureParameterType = securitiesAllocationProcedureParameterType;
    }

    public String getSecuritiesAllocationProcedureParameterType() {
        return securitiesAllocationProcedureParameterType;
    }

    public void setSecuritiesAllocationProcedureSelectedOption(org.museframework.bian.classes.Feature securitiesAllocationProcedureSelectedOption) {
        this.securitiesAllocationProcedureSelectedOption = securitiesAllocationProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getSecuritiesAllocationProcedureSelectedOption() {
        return securitiesAllocationProcedureSelectedOption;
    }

    public void setSecuritiesAllocationProcedureRequest(org.museframework.bian.classes.Instruction securitiesAllocationProcedureRequest) {
        this.securitiesAllocationProcedureRequest = securitiesAllocationProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getSecuritiesAllocationProcedureRequest() {
        return securitiesAllocationProcedureRequest;
    }

    public void setSecuritiesAllocationProcedureSchedule(String securitiesAllocationProcedureSchedule) {
        this.securitiesAllocationProcedureSchedule = securitiesAllocationProcedureSchedule;
    }

    public String getSecuritiesAllocationProcedureSchedule() {
        return securitiesAllocationProcedureSchedule;
    }

    public void setSecuritiesAllocationProcedureStatus(String securitiesAllocationProcedureStatus) {
        this.securitiesAllocationProcedureStatus = securitiesAllocationProcedureStatus;
    }

    public String getSecuritiesAllocationProcedureStatus() {
        return securitiesAllocationProcedureStatus;
    }

    public void setSecuritiesAllocationProcedureAssociatedPartyReference(String securitiesAllocationProcedureAssociatedPartyReference) {
        this.securitiesAllocationProcedureAssociatedPartyReference = securitiesAllocationProcedureAssociatedPartyReference;
    }

    public String getSecuritiesAllocationProcedureAssociatedPartyReference() {
        return securitiesAllocationProcedureAssociatedPartyReference;
    }

    public void setSecuritiesAllocationProcedureBusinessUnitReference(String securitiesAllocationProcedureBusinessUnitReference) {
        this.securitiesAllocationProcedureBusinessUnitReference = securitiesAllocationProcedureBusinessUnitReference;
    }

    public String getSecuritiesAllocationProcedureBusinessUnitReference() {
        return securitiesAllocationProcedureBusinessUnitReference;
    }

    public void setSecuritiesAllocationProcedureServiceProviderReference(String securitiesAllocationProcedureServiceProviderReference) {
        this.securitiesAllocationProcedureServiceProviderReference = securitiesAllocationProcedureServiceProviderReference;
    }

    public String getSecuritiesAllocationProcedureServiceProviderReference() {
        return securitiesAllocationProcedureServiceProviderReference;
    }

    public void setSecuritiesAllocationProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility securitiesAllocationProcedureFinancialFacilityReference) {
        this.securitiesAllocationProcedureFinancialFacilityReference = securitiesAllocationProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getSecuritiesAllocationProcedureFinancialFacilityReference() {
        return securitiesAllocationProcedureFinancialFacilityReference;
    }

    public void setSecuritiesAllocationProcedureEmployeeReference(String securitiesAllocationProcedureEmployeeReference) {
        this.securitiesAllocationProcedureEmployeeReference = securitiesAllocationProcedureEmployeeReference;
    }

    public String getSecuritiesAllocationProcedureEmployeeReference() {
        return securitiesAllocationProcedureEmployeeReference;
    }

    public void setSecuritiesAllocationProcedureCustomerReference(String securitiesAllocationProcedureCustomerReference) {
        this.securitiesAllocationProcedureCustomerReference = securitiesAllocationProcedureCustomerReference;
    }

    public String getSecuritiesAllocationProcedureCustomerReference() {
        return securitiesAllocationProcedureCustomerReference;
    }

    public void setSecuritiesAllocationProcedureType(String securitiesAllocationProcedureType) {
        this.securitiesAllocationProcedureType = securitiesAllocationProcedureType;
    }

    public String getSecuritiesAllocationProcedureType() {
        return securitiesAllocationProcedureType;
    }

    public void setSecuritiesAllocationProcedureServiceProviderSchedule(String securitiesAllocationProcedureServiceProviderSchedule) {
        this.securitiesAllocationProcedureServiceProviderSchedule = securitiesAllocationProcedureServiceProviderSchedule;
    }

    public String getSecuritiesAllocationProcedureServiceProviderSchedule() {
        return securitiesAllocationProcedureServiceProviderSchedule;
    }

    public void setSecuritiesAllocationProcedureServiceType(String securitiesAllocationProcedureServiceType) {
        this.securitiesAllocationProcedureServiceType = securitiesAllocationProcedureServiceType;
    }

    public String getSecuritiesAllocationProcedureServiceType() {
        return securitiesAllocationProcedureServiceType;
    }

    public void setSecuritiesAllocationProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct securitiesAllocationProcedureProductandServiceInstance) {
        this.securitiesAllocationProcedureProductandServiceInstance = securitiesAllocationProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getSecuritiesAllocationProcedureProductandServiceInstance() {
        return securitiesAllocationProcedureProductandServiceInstance;
    }

    public void setSecuritiesAllocationProcedureTransaction(org.museframework.bian.classes.Transaction securitiesAllocationProcedureTransaction) {
        this.securitiesAllocationProcedureTransaction = securitiesAllocationProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getSecuritiesAllocationProcedureTransaction() {
        return securitiesAllocationProcedureTransaction;
    }

    public void setSecuritiesAllocationProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement securitiesAllocationProcedureFinancialTransactionArrangement) {
        this.securitiesAllocationProcedureFinancialTransactionArrangement = securitiesAllocationProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getSecuritiesAllocationProcedureFinancialTransactionArrangement() {
        return securitiesAllocationProcedureFinancialTransactionArrangement;
    }

    public void setSecuritiesAllocationProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement securitiesAllocationProcedureCustomerAgreementReference) {
        this.securitiesAllocationProcedureCustomerAgreementReference = securitiesAllocationProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSecuritiesAllocationProcedureCustomerAgreementReference() {
        return securitiesAllocationProcedureCustomerAgreementReference;
    }

    public void setSecuritiesAllocationProcedureReference(org.museframework.bian.classes.Procedure securitiesAllocationProcedureReference) {
        this.securitiesAllocationProcedureReference = securitiesAllocationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getSecuritiesAllocationProcedureReference() {
        return securitiesAllocationProcedureReference;
    }
}