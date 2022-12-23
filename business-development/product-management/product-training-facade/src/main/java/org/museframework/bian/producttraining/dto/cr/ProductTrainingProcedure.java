/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.producttraining.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductTrainingProcedure extends org.museframework.bian.classes.ProductTrainingProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Product Training Procedure*/
    @MetaField
    private String productTrainingProcedureParameterType;

    /*A selected optional business service as subject matter of Product Training Procedure*/
    @MetaField
    private String productTrainingProcedureSelectedOption;

    /*Request to process ProductTraining*/
    @MetaField
    private String productTrainingProcedureRequest;

    /*Timetable to process ProductTraining*/
    @MetaField
    private String productTrainingProcedureSchedule;

    /*The status of Product Training Procedure*/
    @MetaField
    private String productTrainingProcedureStatus;

    /*Reference to the party who is involved in Product Training Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureReference;

    /*Reference to the business unit which is involved in Product Training Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Product Training Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to  Product Training Procedure */
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Product Training Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureEmployeeReference;

    /*Reference to the customer who is involved in Product Training Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Product Training Procedure*/
    @MetaField
    private String productTrainingProcedureType;

    /*The schedule according to which the service provider will process the Product Training Procedure*/
    @MetaField
    private String productTrainingProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Product Training Procedure */
    @MetaField
    private String productTrainingProcedureServiceType;

    /*A Classification value that distinguishes between the type of products/services related to Product Training Procedure */
    @MetaField
    private String productTrainingProcedureProductandServiceType;

    /*Reference to the product or service that is related to  Product Training Procedure*/
    @MetaField
    private String productTrainingProcedureProductandServiceInstance;

    /*A Classification value that distinguishes between the type of transactions in Product Training Procedure */
    @MetaField
    private String productTrainingProcedureTransactionType;

    /*Reference to the transaction that is related to  Product Training Procedure */
    @MetaField
    private String productTrainingProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to  Product Training Procedure */
    @MetaField
    private String productTrainingProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to  Product Training Procedure */
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTrainingProcedureCustomerAgreementReference;

    public void setProductTrainingProcedureParameterType(String productTrainingProcedureParameterType) {
        this.productTrainingProcedureParameterType = productTrainingProcedureParameterType;
    }

    public String getProductTrainingProcedureParameterType() {
        return productTrainingProcedureParameterType;
    }

    public void setProductTrainingProcedureSelectedOption(String productTrainingProcedureSelectedOption) {
        this.productTrainingProcedureSelectedOption = productTrainingProcedureSelectedOption;
    }

    public String getProductTrainingProcedureSelectedOption() {
        return productTrainingProcedureSelectedOption;
    }

    public void setProductTrainingProcedureRequest(String productTrainingProcedureRequest) {
        this.productTrainingProcedureRequest = productTrainingProcedureRequest;
    }

    public String getProductTrainingProcedureRequest() {
        return productTrainingProcedureRequest;
    }

    public void setProductTrainingProcedureSchedule(String productTrainingProcedureSchedule) {
        this.productTrainingProcedureSchedule = productTrainingProcedureSchedule;
    }

    public String getProductTrainingProcedureSchedule() {
        return productTrainingProcedureSchedule;
    }

    public void setProductTrainingProcedureStatus(String productTrainingProcedureStatus) {
        this.productTrainingProcedureStatus = productTrainingProcedureStatus;
    }

    public String getProductTrainingProcedureStatus() {
        return productTrainingProcedureStatus;
    }

    public void setProductTrainingProcedureReference(org.museframework.bian.classes.Object productTrainingProcedureReference) {
        this.productTrainingProcedureReference = productTrainingProcedureReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureReference() {
        return productTrainingProcedureReference;
    }

    public void setProductTrainingProcedureBusinessUnitReference(org.museframework.bian.classes.Object productTrainingProcedureBusinessUnitReference) {
        this.productTrainingProcedureBusinessUnitReference = productTrainingProcedureBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureBusinessUnitReference() {
        return productTrainingProcedureBusinessUnitReference;
    }

    public void setProductTrainingProcedureServiceProviderReference(org.museframework.bian.classes.Object productTrainingProcedureServiceProviderReference) {
        this.productTrainingProcedureServiceProviderReference = productTrainingProcedureServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureServiceProviderReference() {
        return productTrainingProcedureServiceProviderReference;
    }

    public void setProductTrainingProcedureFinancialFacilityReference(org.museframework.bian.classes.Object productTrainingProcedureFinancialFacilityReference) {
        this.productTrainingProcedureFinancialFacilityReference = productTrainingProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureFinancialFacilityReference() {
        return productTrainingProcedureFinancialFacilityReference;
    }

    public void setProductTrainingProcedureEmployeeReference(org.museframework.bian.classes.Object productTrainingProcedureEmployeeReference) {
        this.productTrainingProcedureEmployeeReference = productTrainingProcedureEmployeeReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureEmployeeReference() {
        return productTrainingProcedureEmployeeReference;
    }

    public void setProductTrainingProcedureCustomerReference(org.museframework.bian.classes.Object productTrainingProcedureCustomerReference) {
        this.productTrainingProcedureCustomerReference = productTrainingProcedureCustomerReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureCustomerReference() {
        return productTrainingProcedureCustomerReference;
    }

    public void setProductTrainingProcedureType(String productTrainingProcedureType) {
        this.productTrainingProcedureType = productTrainingProcedureType;
    }

    public String getProductTrainingProcedureType() {
        return productTrainingProcedureType;
    }

    public void setProductTrainingProcedureServiceProviderSchedule(String productTrainingProcedureServiceProviderSchedule) {
        this.productTrainingProcedureServiceProviderSchedule = productTrainingProcedureServiceProviderSchedule;
    }

    public String getProductTrainingProcedureServiceProviderSchedule() {
        return productTrainingProcedureServiceProviderSchedule;
    }

    public void setProductTrainingProcedureServiceType(String productTrainingProcedureServiceType) {
        this.productTrainingProcedureServiceType = productTrainingProcedureServiceType;
    }

    public String getProductTrainingProcedureServiceType() {
        return productTrainingProcedureServiceType;
    }

    public void setProductTrainingProcedureProductandServiceType(String productTrainingProcedureProductandServiceType) {
        this.productTrainingProcedureProductandServiceType = productTrainingProcedureProductandServiceType;
    }

    public String getProductTrainingProcedureProductandServiceType() {
        return productTrainingProcedureProductandServiceType;
    }

    public void setProductTrainingProcedureProductandServiceInstance(String productTrainingProcedureProductandServiceInstance) {
        this.productTrainingProcedureProductandServiceInstance = productTrainingProcedureProductandServiceInstance;
    }

    public String getProductTrainingProcedureProductandServiceInstance() {
        return productTrainingProcedureProductandServiceInstance;
    }

    public void setProductTrainingProcedureTransactionType(String productTrainingProcedureTransactionType) {
        this.productTrainingProcedureTransactionType = productTrainingProcedureTransactionType;
    }

    public String getProductTrainingProcedureTransactionType() {
        return productTrainingProcedureTransactionType;
    }

    public void setProductTrainingProcedureTransaction(String productTrainingProcedureTransaction) {
        this.productTrainingProcedureTransaction = productTrainingProcedureTransaction;
    }

    public String getProductTrainingProcedureTransaction() {
        return productTrainingProcedureTransaction;
    }

    public void setProductTrainingProcedureFinancialTransactionArrangement(String productTrainingProcedureFinancialTransactionArrangement) {
        this.productTrainingProcedureFinancialTransactionArrangement = productTrainingProcedureFinancialTransactionArrangement;
    }

    public String getProductTrainingProcedureFinancialTransactionArrangement() {
        return productTrainingProcedureFinancialTransactionArrangement;
    }

    public void setProductTrainingProcedureCustomerAgreementReference(org.museframework.bian.classes.Object productTrainingProcedureCustomerAgreementReference) {
        this.productTrainingProcedureCustomerAgreementReference = productTrainingProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Object getProductTrainingProcedureCustomerAgreementReference() {
        return productTrainingProcedureCustomerAgreementReference;
    }
}