/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.bq;

public class FinancialDocumentHandling {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private String financialDocumentHandlingPreconditions;

    /*The schedule and timing of the function*/
    private String financialDocumentHandlingFunctionSchedule;

    /*The ATMNetwork Operating Session specific Business Service*/
    private org.museframework.bian.classes.BusinessService documentGenerationandHandling;

    /*Reference to the specific business service type*/
    private String documentGenerationandHandlingServiceType;

    /*Description of the performed business service*/
    private String documentGenerationandHandlingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String documentGenerationandHandlingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String documentGenerationandHandlingServiceWorkProduct;

    /**/
    private String documentGenerationandHandlingServiceName;

    public void setFinancialDocumentHandlingPreconditions(String financialDocumentHandlingPreconditions) {
        this.financialDocumentHandlingPreconditions = financialDocumentHandlingPreconditions;
    }

    public String getFinancialDocumentHandlingPreconditions() {
        return financialDocumentHandlingPreconditions;
    }

    public void setFinancialDocumentHandlingFunctionSchedule(String financialDocumentHandlingFunctionSchedule) {
        this.financialDocumentHandlingFunctionSchedule = financialDocumentHandlingFunctionSchedule;
    }

    public String getFinancialDocumentHandlingFunctionSchedule() {
        return financialDocumentHandlingFunctionSchedule;
    }

    public void setDocumentGenerationandHandling(org.museframework.bian.classes.BusinessService documentGenerationandHandling) {
        this.documentGenerationandHandling = documentGenerationandHandling;
    }

    public org.museframework.bian.classes.BusinessService getDocumentGenerationandHandling() {
        return documentGenerationandHandling;
    }

    public void setDocumentGenerationandHandlingServiceType(String documentGenerationandHandlingServiceType) {
        this.documentGenerationandHandlingServiceType = documentGenerationandHandlingServiceType;
    }

    public String getDocumentGenerationandHandlingServiceType() {
        return documentGenerationandHandlingServiceType;
    }

    public void setDocumentGenerationandHandlingServiceDescription(String documentGenerationandHandlingServiceDescription) {
        this.documentGenerationandHandlingServiceDescription = documentGenerationandHandlingServiceDescription;
    }

    public String getDocumentGenerationandHandlingServiceDescription() {
        return documentGenerationandHandlingServiceDescription;
    }

    public void setDocumentGenerationandHandlingServiceInputsandOuputs(String documentGenerationandHandlingServiceInputsandOuputs) {
        this.documentGenerationandHandlingServiceInputsandOuputs = documentGenerationandHandlingServiceInputsandOuputs;
    }

    public String getDocumentGenerationandHandlingServiceInputsandOuputs() {
        return documentGenerationandHandlingServiceInputsandOuputs;
    }

    public void setDocumentGenerationandHandlingServiceWorkProduct(String documentGenerationandHandlingServiceWorkProduct) {
        this.documentGenerationandHandlingServiceWorkProduct = documentGenerationandHandlingServiceWorkProduct;
    }

    public String getDocumentGenerationandHandlingServiceWorkProduct() {
        return documentGenerationandHandlingServiceWorkProduct;
    }

    public void setDocumentGenerationandHandlingServiceName(String documentGenerationandHandlingServiceName) {
        this.documentGenerationandHandlingServiceName = documentGenerationandHandlingServiceName;
    }

    public String getDocumentGenerationandHandlingServiceName() {
        return documentGenerationandHandlingServiceName;
    }
}