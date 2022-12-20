/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange. 
Example: Execute a payment transaction.*/
package org.museframework.bian.currencyexchange.dto.bq;

public class DocumentHandling {
    /*The required status/situation prior to the execution of the task*/
    private String documentHandlingPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    private String documentHandlingTaskSchedule;

    /*The Currency Exchange Transaction specific Business Service*/
    private org.museframework.bian.classes.BusinessService documentServices;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    private String documentHandlingPostconditions;

    /*Reference to the specific business service type*/
    private String documentHandlingDocumentServicesServiceType;

    /*Description of the performed business service*/
    private String documentHandlingDocumentServicesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String documentHandlingDocumentServicesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String documentHandlingDocumentServicesServiceWorkProduct;

    /**/
    private String documentHandlingDocumentServicesServiceName;

    public void setDocumentHandlingPreconditions(String documentHandlingPreconditions) {
        this.documentHandlingPreconditions = documentHandlingPreconditions;
    }

    public String getDocumentHandlingPreconditions() {
        return documentHandlingPreconditions;
    }

    public void setDocumentHandlingTaskSchedule(String documentHandlingTaskSchedule) {
        this.documentHandlingTaskSchedule = documentHandlingTaskSchedule;
    }

    public String getDocumentHandlingTaskSchedule() {
        return documentHandlingTaskSchedule;
    }

    public void setDocumentServices(org.museframework.bian.classes.BusinessService documentServices) {
        this.documentServices = documentServices;
    }

    public org.museframework.bian.classes.BusinessService getDocumentServices() {
        return documentServices;
    }

    public void setDocumentHandlingPostconditions(String documentHandlingPostconditions) {
        this.documentHandlingPostconditions = documentHandlingPostconditions;
    }

    public String getDocumentHandlingPostconditions() {
        return documentHandlingPostconditions;
    }

    public void setDocumentHandlingDocumentServicesServiceType(String documentHandlingDocumentServicesServiceType) {
        this.documentHandlingDocumentServicesServiceType = documentHandlingDocumentServicesServiceType;
    }

    public String getDocumentHandlingDocumentServicesServiceType() {
        return documentHandlingDocumentServicesServiceType;
    }

    public void setDocumentHandlingDocumentServicesServiceDescription(String documentHandlingDocumentServicesServiceDescription) {
        this.documentHandlingDocumentServicesServiceDescription = documentHandlingDocumentServicesServiceDescription;
    }

    public String getDocumentHandlingDocumentServicesServiceDescription() {
        return documentHandlingDocumentServicesServiceDescription;
    }

    public void setDocumentHandlingDocumentServicesServiceInputsandOuputs(String documentHandlingDocumentServicesServiceInputsandOuputs) {
        this.documentHandlingDocumentServicesServiceInputsandOuputs = documentHandlingDocumentServicesServiceInputsandOuputs;
    }

    public String getDocumentHandlingDocumentServicesServiceInputsandOuputs() {
        return documentHandlingDocumentServicesServiceInputsandOuputs;
    }

    public void setDocumentHandlingDocumentServicesServiceWorkProduct(String documentHandlingDocumentServicesServiceWorkProduct) {
        this.documentHandlingDocumentServicesServiceWorkProduct = documentHandlingDocumentServicesServiceWorkProduct;
    }

    public String getDocumentHandlingDocumentServicesServiceWorkProduct() {
        return documentHandlingDocumentServicesServiceWorkProduct;
    }

    public void setDocumentHandlingDocumentServicesServiceName(String documentHandlingDocumentServicesServiceName) {
        this.documentHandlingDocumentServicesServiceName = documentHandlingDocumentServicesServiceName;
    }

    public String getDocumentHandlingDocumentServicesServiceName() {
        return documentHandlingDocumentServicesServiceName;
    }
}