/*Operate equipment and/or a largely automated facility  within Cheque Processing. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.chequeprocessing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialTransactionInitiation {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(0)
    private String financialTransactionInitiationPreconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String financialTransactionInitiationFunctionSchedule;

    /*The Cheque Processing Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService financialTransactionInitiation;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String financialTransactionInitiationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String financialTransactionInitiationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String financialTransactionInitiationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String financialTransactionInitiationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String financialTransactionInitiationServiceName;

    public void setFinancialTransactionInitiationPreconditions(String financialTransactionInitiationPreconditions) {
        this.financialTransactionInitiationPreconditions = financialTransactionInitiationPreconditions;
    }

    public String getFinancialTransactionInitiationPreconditions() {
        return financialTransactionInitiationPreconditions;
    }

    public void setFinancialTransactionInitiationFunctionSchedule(String financialTransactionInitiationFunctionSchedule) {
        this.financialTransactionInitiationFunctionSchedule = financialTransactionInitiationFunctionSchedule;
    }

    public String getFinancialTransactionInitiationFunctionSchedule() {
        return financialTransactionInitiationFunctionSchedule;
    }

    public void setFinancialTransactionInitiation(org.museframework.bian.classes.BusinessService financialTransactionInitiation) {
        this.financialTransactionInitiation = financialTransactionInitiation;
    }

    public org.museframework.bian.classes.BusinessService getFinancialTransactionInitiation() {
        return financialTransactionInitiation;
    }

    public void setFinancialTransactionInitiationServiceType(String financialTransactionInitiationServiceType) {
        this.financialTransactionInitiationServiceType = financialTransactionInitiationServiceType;
    }

    public String getFinancialTransactionInitiationServiceType() {
        return financialTransactionInitiationServiceType;
    }

    public void setFinancialTransactionInitiationServiceDescription(String financialTransactionInitiationServiceDescription) {
        this.financialTransactionInitiationServiceDescription = financialTransactionInitiationServiceDescription;
    }

    public String getFinancialTransactionInitiationServiceDescription() {
        return financialTransactionInitiationServiceDescription;
    }

    public void setFinancialTransactionInitiationServiceInputsandOuputs(String financialTransactionInitiationServiceInputsandOuputs) {
        this.financialTransactionInitiationServiceInputsandOuputs = financialTransactionInitiationServiceInputsandOuputs;
    }

    public String getFinancialTransactionInitiationServiceInputsandOuputs() {
        return financialTransactionInitiationServiceInputsandOuputs;
    }

    public void setFinancialTransactionInitiationServiceWorkProduct(String financialTransactionInitiationServiceWorkProduct) {
        this.financialTransactionInitiationServiceWorkProduct = financialTransactionInitiationServiceWorkProduct;
    }

    public String getFinancialTransactionInitiationServiceWorkProduct() {
        return financialTransactionInitiationServiceWorkProduct;
    }

    public void setFinancialTransactionInitiationServiceName(String financialTransactionInitiationServiceName) {
        this.financialTransactionInitiationServiceName = financialTransactionInitiationServiceName;
    }

    public String getFinancialTransactionInitiationServiceName() {
        return financialTransactionInitiationServiceName;
    }
}