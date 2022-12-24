/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CollateralAssetLiquidationProcedure
@MetaDto
public class CollateralAssetLiquidationProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Collateral Asset Liquidation Procedure*/
    @MetaField
    private String collateralAssetLiquidationProcedureParameterType;

    /*A selected optional business service as subject matter of Collateral Asset Liquidation Procedure*/
    @MetaField
    private String collateralAssetLiquidationProcedureSelectedOption;

    /*Request to process CollateralAssetLiquidation*/
    @MetaField
    private String collateralAssetLiquidationProcedureRequest;

    /*Timetable to process CollateralAssetLiquidation*/
    @MetaField
    private String collateralAssetLiquidationProcedureSchedule;

    /*The status of Collateral Asset Liquidation Procedure*/
    @MetaField
    private String collateralAssetLiquidationProcedureStatus;

    /*Reference to the party who is involved in Collateral Asset Liquidation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureReference;

    /*Reference to the business unit which is involved in Collateral Asset Liquidation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Collateral Asset Liquidation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to  Collateral Asset Liquidation Procedure */
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Collateral Asset Liquidation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureEmployeeReference;

    /*Reference to the customer who is involved in Collateral Asset Liquidation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Collateral Asset Liquidation Procedure*/
    @MetaField
    private String collateralAssetLiquidationProcedureType;

    /*The schedule according to which the service provider will process the Collateral Asset Liquidation Procedure*/
    @MetaField
    private String collateralAssetLiquidationProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Collateral Asset Liquidation Procedure */
    @MetaField
    private String collateralAssetLiquidationProcedureServiceType;

    /*A Classification value that distinguishes between the type of products/services related to Collateral Asset Liquidation Procedure */
    @MetaField
    private String collateralAssetLiquidationProcedureProductandServiceType;

    /*Reference to the product or service that is related to  Collateral Asset Liquidation Procedure*/
    @MetaField
    private String collateralAssetLiquidationProcedureProductandServiceInstance;

    /*A Classification value that distinguishes between the type of transactions in Collateral Asset Liquidation Procedure */
    @MetaField
    private String collateralAssetLiquidationProcedureTransactionType;

    /*Reference to the transaction that is related to  Collateral Asset Liquidation Procedure */
    @MetaField
    private String collateralAssetLiquidationProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to  Collateral Asset Liquidation Procedure */
    @MetaField
    private String collateralAssetLiquidationProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to  Collateral Asset Liquidation Procedure */
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetLiquidationProcedureCustomerAgreementReference;

    public void setCollateralAssetLiquidationProcedureParameterType(String collateralAssetLiquidationProcedureParameterType) {
        this.collateralAssetLiquidationProcedureParameterType = collateralAssetLiquidationProcedureParameterType;
    }

    public String getCollateralAssetLiquidationProcedureParameterType() {
        return collateralAssetLiquidationProcedureParameterType;
    }

    public void setCollateralAssetLiquidationProcedureSelectedOption(String collateralAssetLiquidationProcedureSelectedOption) {
        this.collateralAssetLiquidationProcedureSelectedOption = collateralAssetLiquidationProcedureSelectedOption;
    }

    public String getCollateralAssetLiquidationProcedureSelectedOption() {
        return collateralAssetLiquidationProcedureSelectedOption;
    }

    public void setCollateralAssetLiquidationProcedureRequest(String collateralAssetLiquidationProcedureRequest) {
        this.collateralAssetLiquidationProcedureRequest = collateralAssetLiquidationProcedureRequest;
    }

    public String getCollateralAssetLiquidationProcedureRequest() {
        return collateralAssetLiquidationProcedureRequest;
    }

    public void setCollateralAssetLiquidationProcedureSchedule(String collateralAssetLiquidationProcedureSchedule) {
        this.collateralAssetLiquidationProcedureSchedule = collateralAssetLiquidationProcedureSchedule;
    }

    public String getCollateralAssetLiquidationProcedureSchedule() {
        return collateralAssetLiquidationProcedureSchedule;
    }

    public void setCollateralAssetLiquidationProcedureStatus(String collateralAssetLiquidationProcedureStatus) {
        this.collateralAssetLiquidationProcedureStatus = collateralAssetLiquidationProcedureStatus;
    }

    public String getCollateralAssetLiquidationProcedureStatus() {
        return collateralAssetLiquidationProcedureStatus;
    }

    public void setCollateralAssetLiquidationProcedureReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureReference) {
        this.collateralAssetLiquidationProcedureReference = collateralAssetLiquidationProcedureReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureReference() {
        return collateralAssetLiquidationProcedureReference;
    }

    public void setCollateralAssetLiquidationProcedureBusinessUnitReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureBusinessUnitReference) {
        this.collateralAssetLiquidationProcedureBusinessUnitReference = collateralAssetLiquidationProcedureBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureBusinessUnitReference() {
        return collateralAssetLiquidationProcedureBusinessUnitReference;
    }

    public void setCollateralAssetLiquidationProcedureServiceProviderReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureServiceProviderReference) {
        this.collateralAssetLiquidationProcedureServiceProviderReference = collateralAssetLiquidationProcedureServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureServiceProviderReference() {
        return collateralAssetLiquidationProcedureServiceProviderReference;
    }

    public void setCollateralAssetLiquidationProcedureFinancialFacilityReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureFinancialFacilityReference) {
        this.collateralAssetLiquidationProcedureFinancialFacilityReference = collateralAssetLiquidationProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureFinancialFacilityReference() {
        return collateralAssetLiquidationProcedureFinancialFacilityReference;
    }

    public void setCollateralAssetLiquidationProcedureEmployeeReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureEmployeeReference) {
        this.collateralAssetLiquidationProcedureEmployeeReference = collateralAssetLiquidationProcedureEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureEmployeeReference() {
        return collateralAssetLiquidationProcedureEmployeeReference;
    }

    public void setCollateralAssetLiquidationProcedureCustomerReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureCustomerReference) {
        this.collateralAssetLiquidationProcedureCustomerReference = collateralAssetLiquidationProcedureCustomerReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureCustomerReference() {
        return collateralAssetLiquidationProcedureCustomerReference;
    }

    public void setCollateralAssetLiquidationProcedureType(String collateralAssetLiquidationProcedureType) {
        this.collateralAssetLiquidationProcedureType = collateralAssetLiquidationProcedureType;
    }

    public String getCollateralAssetLiquidationProcedureType() {
        return collateralAssetLiquidationProcedureType;
    }

    public void setCollateralAssetLiquidationProcedureServiceProviderSchedule(String collateralAssetLiquidationProcedureServiceProviderSchedule) {
        this.collateralAssetLiquidationProcedureServiceProviderSchedule = collateralAssetLiquidationProcedureServiceProviderSchedule;
    }

    public String getCollateralAssetLiquidationProcedureServiceProviderSchedule() {
        return collateralAssetLiquidationProcedureServiceProviderSchedule;
    }

    public void setCollateralAssetLiquidationProcedureServiceType(String collateralAssetLiquidationProcedureServiceType) {
        this.collateralAssetLiquidationProcedureServiceType = collateralAssetLiquidationProcedureServiceType;
    }

    public String getCollateralAssetLiquidationProcedureServiceType() {
        return collateralAssetLiquidationProcedureServiceType;
    }

    public void setCollateralAssetLiquidationProcedureProductandServiceType(String collateralAssetLiquidationProcedureProductandServiceType) {
        this.collateralAssetLiquidationProcedureProductandServiceType = collateralAssetLiquidationProcedureProductandServiceType;
    }

    public String getCollateralAssetLiquidationProcedureProductandServiceType() {
        return collateralAssetLiquidationProcedureProductandServiceType;
    }

    public void setCollateralAssetLiquidationProcedureProductandServiceInstance(String collateralAssetLiquidationProcedureProductandServiceInstance) {
        this.collateralAssetLiquidationProcedureProductandServiceInstance = collateralAssetLiquidationProcedureProductandServiceInstance;
    }

    public String getCollateralAssetLiquidationProcedureProductandServiceInstance() {
        return collateralAssetLiquidationProcedureProductandServiceInstance;
    }

    public void setCollateralAssetLiquidationProcedureTransactionType(String collateralAssetLiquidationProcedureTransactionType) {
        this.collateralAssetLiquidationProcedureTransactionType = collateralAssetLiquidationProcedureTransactionType;
    }

    public String getCollateralAssetLiquidationProcedureTransactionType() {
        return collateralAssetLiquidationProcedureTransactionType;
    }

    public void setCollateralAssetLiquidationProcedureTransaction(String collateralAssetLiquidationProcedureTransaction) {
        this.collateralAssetLiquidationProcedureTransaction = collateralAssetLiquidationProcedureTransaction;
    }

    public String getCollateralAssetLiquidationProcedureTransaction() {
        return collateralAssetLiquidationProcedureTransaction;
    }

    public void setCollateralAssetLiquidationProcedureFinancialTransactionArrangement(String collateralAssetLiquidationProcedureFinancialTransactionArrangement) {
        this.collateralAssetLiquidationProcedureFinancialTransactionArrangement = collateralAssetLiquidationProcedureFinancialTransactionArrangement;
    }

    public String getCollateralAssetLiquidationProcedureFinancialTransactionArrangement() {
        return collateralAssetLiquidationProcedureFinancialTransactionArrangement;
    }

    public void setCollateralAssetLiquidationProcedureCustomerAgreementReference(org.museframework.bian.classes.Object collateralAssetLiquidationProcedureCustomerAgreementReference) {
        this.collateralAssetLiquidationProcedureCustomerAgreementReference = collateralAssetLiquidationProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetLiquidationProcedureCustomerAgreementReference() {
        return collateralAssetLiquidationProcedureCustomerAgreementReference;
    }
}