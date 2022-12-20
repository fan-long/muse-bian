/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Reward Points Awards & Redemption. 
Example: Execute a payment transaction.*/
package org.museframework.bian.rewpoiawaandred.dto.bq;

public class Redemption {
    /*The required status/situation prior to the execution of the task*/
    private String redemptionPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    private String redemptionTaskSchedule;

    /*The Reward Points Transaction specific Business Service*/
    private org.museframework.bian.classes.BusinessService awardsRedemption;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    private String redemptionPostconditions;

    /*Reference to the specific business service type*/
    private String redemptionAwardsRedemptionServiceType;

    /*Description of the performed business service*/
    private String redemptionAwardsRedemptionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String redemptionAwardsRedemptionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String redemptionAwardsRedemptionServiceWorkProduct;

    /**/
    private String redemptionAwardsRedemptionServiceName;

    public void setRedemptionPreconditions(String redemptionPreconditions) {
        this.redemptionPreconditions = redemptionPreconditions;
    }

    public String getRedemptionPreconditions() {
        return redemptionPreconditions;
    }

    public void setRedemptionTaskSchedule(String redemptionTaskSchedule) {
        this.redemptionTaskSchedule = redemptionTaskSchedule;
    }

    public String getRedemptionTaskSchedule() {
        return redemptionTaskSchedule;
    }

    public void setAwardsRedemption(org.museframework.bian.classes.BusinessService awardsRedemption) {
        this.awardsRedemption = awardsRedemption;
    }

    public org.museframework.bian.classes.BusinessService getAwardsRedemption() {
        return awardsRedemption;
    }

    public void setRedemptionPostconditions(String redemptionPostconditions) {
        this.redemptionPostconditions = redemptionPostconditions;
    }

    public String getRedemptionPostconditions() {
        return redemptionPostconditions;
    }

    public void setRedemptionAwardsRedemptionServiceType(String redemptionAwardsRedemptionServiceType) {
        this.redemptionAwardsRedemptionServiceType = redemptionAwardsRedemptionServiceType;
    }

    public String getRedemptionAwardsRedemptionServiceType() {
        return redemptionAwardsRedemptionServiceType;
    }

    public void setRedemptionAwardsRedemptionServiceDescription(String redemptionAwardsRedemptionServiceDescription) {
        this.redemptionAwardsRedemptionServiceDescription = redemptionAwardsRedemptionServiceDescription;
    }

    public String getRedemptionAwardsRedemptionServiceDescription() {
        return redemptionAwardsRedemptionServiceDescription;
    }

    public void setRedemptionAwardsRedemptionServiceInputsandOuputs(String redemptionAwardsRedemptionServiceInputsandOuputs) {
        this.redemptionAwardsRedemptionServiceInputsandOuputs = redemptionAwardsRedemptionServiceInputsandOuputs;
    }

    public String getRedemptionAwardsRedemptionServiceInputsandOuputs() {
        return redemptionAwardsRedemptionServiceInputsandOuputs;
    }

    public void setRedemptionAwardsRedemptionServiceWorkProduct(String redemptionAwardsRedemptionServiceWorkProduct) {
        this.redemptionAwardsRedemptionServiceWorkProduct = redemptionAwardsRedemptionServiceWorkProduct;
    }

    public String getRedemptionAwardsRedemptionServiceWorkProduct() {
        return redemptionAwardsRedemptionServiceWorkProduct;
    }

    public void setRedemptionAwardsRedemptionServiceName(String redemptionAwardsRedemptionServiceName) {
        this.redemptionAwardsRedemptionServiceName = redemptionAwardsRedemptionServiceName;
    }

    public String getRedemptionAwardsRedemptionServiceName() {
        return redemptionAwardsRedemptionServiceName;
    }
}