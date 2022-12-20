/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization. 
Example: Execute a payment transaction.*/
package org.museframework.bian.assetsecuritization.dto.bq;

public class Placement {
    /*The required status/situation prior to the execution of the task*/
    private String placementPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    private String placementTaskSchedule;

    /*The Asset Securitization Transaction specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    private String placementPostconditions;

    /*Reference to the specific business service type*/
    private String placementServiceType;

    /*Description of the performed business service*/
    private String placementServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String placementServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String placementServiceWorkProduct;

    /**/
    private String placementServiceName;

    public void setPlacementPreconditions(String placementPreconditions) {
        this.placementPreconditions = placementPreconditions;
    }

    public String getPlacementPreconditions() {
        return placementPreconditions;
    }

    public void setPlacementTaskSchedule(String placementTaskSchedule) {
        this.placementTaskSchedule = placementTaskSchedule;
    }

    public String getPlacementTaskSchedule() {
        return placementTaskSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPlacementPostconditions(String placementPostconditions) {
        this.placementPostconditions = placementPostconditions;
    }

    public String getPlacementPostconditions() {
        return placementPostconditions;
    }

    public void setPlacementServiceType(String placementServiceType) {
        this.placementServiceType = placementServiceType;
    }

    public String getPlacementServiceType() {
        return placementServiceType;
    }

    public void setPlacementServiceDescription(String placementServiceDescription) {
        this.placementServiceDescription = placementServiceDescription;
    }

    public String getPlacementServiceDescription() {
        return placementServiceDescription;
    }

    public void setPlacementServiceInputsandOuputs(String placementServiceInputsandOuputs) {
        this.placementServiceInputsandOuputs = placementServiceInputsandOuputs;
    }

    public String getPlacementServiceInputsandOuputs() {
        return placementServiceInputsandOuputs;
    }

    public void setPlacementServiceWorkProduct(String placementServiceWorkProduct) {
        this.placementServiceWorkProduct = placementServiceWorkProduct;
    }

    public String getPlacementServiceWorkProduct() {
        return placementServiceWorkProduct;
    }

    public void setPlacementServiceName(String placementServiceName) {
        this.placementServiceName = placementServiceName;
    }

    public String getPlacementServiceName() {
        return placementServiceName;
    }
}