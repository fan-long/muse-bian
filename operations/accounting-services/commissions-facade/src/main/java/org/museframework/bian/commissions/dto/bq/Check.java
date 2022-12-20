/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions. 
Example: Execute a payment transaction.*/
package org.museframework.bian.commissions.dto.bq;

public class Check {
    /*The required status/situation prior to the execution of the task*/
    private String checkPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    private String checkTaskSchedule;

    /*The Commission Transaction specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    private String checkPostconditions;

    /*Reference to the specific business service type*/
    private String checkServiceType;

    /*Description of the performed business service*/
    private String checkServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String checkServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String checkServiceWorkProduct;

    /**/
    private String checkServiceName;

    public void setCheckPreconditions(String checkPreconditions) {
        this.checkPreconditions = checkPreconditions;
    }

    public String getCheckPreconditions() {
        return checkPreconditions;
    }

    public void setCheckTaskSchedule(String checkTaskSchedule) {
        this.checkTaskSchedule = checkTaskSchedule;
    }

    public String getCheckTaskSchedule() {
        return checkTaskSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setCheckPostconditions(String checkPostconditions) {
        this.checkPostconditions = checkPostconditions;
    }

    public String getCheckPostconditions() {
        return checkPostconditions;
    }

    public void setCheckServiceType(String checkServiceType) {
        this.checkServiceType = checkServiceType;
    }

    public String getCheckServiceType() {
        return checkServiceType;
    }

    public void setCheckServiceDescription(String checkServiceDescription) {
        this.checkServiceDescription = checkServiceDescription;
    }

    public String getCheckServiceDescription() {
        return checkServiceDescription;
    }

    public void setCheckServiceInputsandOuputs(String checkServiceInputsandOuputs) {
        this.checkServiceInputsandOuputs = checkServiceInputsandOuputs;
    }

    public String getCheckServiceInputsandOuputs() {
        return checkServiceInputsandOuputs;
    }

    public void setCheckServiceWorkProduct(String checkServiceWorkProduct) {
        this.checkServiceWorkProduct = checkServiceWorkProduct;
    }

    public String getCheckServiceWorkProduct() {
        return checkServiceWorkProduct;
    }

    public void setCheckServiceName(String checkServiceName) {
        this.checkServiceName = checkServiceName;
    }

    public String getCheckServiceName() {
        return checkServiceName;
    }
}