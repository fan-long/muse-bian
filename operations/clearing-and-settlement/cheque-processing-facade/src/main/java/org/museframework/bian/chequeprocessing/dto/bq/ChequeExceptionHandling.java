/*Operate equipment and/or a largely automated facility  within Cheque Processing. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.chequeprocessing.dto.bq;

public class ChequeExceptionHandling {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private String chequeExceptionHandlingPreconditions;

    /*The schedule and timing of the function*/
    private String chequeExceptionHandlingFunctionSchedule;

    /*The Cheque Processing Operating Session specific Business Service*/
    private org.museframework.bian.classes.BusinessService chequeExceptionHandling;

    /*Reference to the specific business service type*/
    private String chequeExceptionHandlingServiceType;

    /*Description of the performed business service*/
    private String chequeExceptionHandlingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String chequeExceptionHandlingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String chequeExceptionHandlingServiceWorkProduct;

    /**/
    private String chequeExceptionHandlingServiceName;

    public void setChequeExceptionHandlingPreconditions(String chequeExceptionHandlingPreconditions) {
        this.chequeExceptionHandlingPreconditions = chequeExceptionHandlingPreconditions;
    }

    public String getChequeExceptionHandlingPreconditions() {
        return chequeExceptionHandlingPreconditions;
    }

    public void setChequeExceptionHandlingFunctionSchedule(String chequeExceptionHandlingFunctionSchedule) {
        this.chequeExceptionHandlingFunctionSchedule = chequeExceptionHandlingFunctionSchedule;
    }

    public String getChequeExceptionHandlingFunctionSchedule() {
        return chequeExceptionHandlingFunctionSchedule;
    }

    public void setChequeExceptionHandling(org.museframework.bian.classes.BusinessService chequeExceptionHandling) {
        this.chequeExceptionHandling = chequeExceptionHandling;
    }

    public org.museframework.bian.classes.BusinessService getChequeExceptionHandling() {
        return chequeExceptionHandling;
    }

    public void setChequeExceptionHandlingServiceType(String chequeExceptionHandlingServiceType) {
        this.chequeExceptionHandlingServiceType = chequeExceptionHandlingServiceType;
    }

    public String getChequeExceptionHandlingServiceType() {
        return chequeExceptionHandlingServiceType;
    }

    public void setChequeExceptionHandlingServiceDescription(String chequeExceptionHandlingServiceDescription) {
        this.chequeExceptionHandlingServiceDescription = chequeExceptionHandlingServiceDescription;
    }

    public String getChequeExceptionHandlingServiceDescription() {
        return chequeExceptionHandlingServiceDescription;
    }

    public void setChequeExceptionHandlingServiceInputsandOuputs(String chequeExceptionHandlingServiceInputsandOuputs) {
        this.chequeExceptionHandlingServiceInputsandOuputs = chequeExceptionHandlingServiceInputsandOuputs;
    }

    public String getChequeExceptionHandlingServiceInputsandOuputs() {
        return chequeExceptionHandlingServiceInputsandOuputs;
    }

    public void setChequeExceptionHandlingServiceWorkProduct(String chequeExceptionHandlingServiceWorkProduct) {
        this.chequeExceptionHandlingServiceWorkProduct = chequeExceptionHandlingServiceWorkProduct;
    }

    public String getChequeExceptionHandlingServiceWorkProduct() {
        return chequeExceptionHandlingServiceWorkProduct;
    }

    public void setChequeExceptionHandlingServiceName(String chequeExceptionHandlingServiceName) {
        this.chequeExceptionHandlingServiceName = chequeExceptionHandlingServiceName;
    }

    public String getChequeExceptionHandlingServiceName() {
        return chequeExceptionHandlingServiceName;
    }
}