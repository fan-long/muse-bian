/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.corporatelease.dto.bq;

public class Fulfill {
    /*The required status/situation prior to the implementation of the feature*/
    private String fulfillPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String fulfillFeatureSchedule;

    /*The Corporate Lease Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService corporateLeaseFulfillment;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String fulfillPostconditions;

    /*Reference to the specific business service type*/
    private String fulfillCorporateLeaseFulfillmentServiceType;

    /*Description of the performed business service*/
    private String fulfillCorporateLeaseFulfillmentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String fulfillCorporateLeaseFulfillmentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String fulfillCorporateLeaseFulfillmentServiceWorkProduct;

    /**/
    private String fulfillCorporateLeaseFulfillmentServiceName;

    public void setFulfillPreconditions(String fulfillPreconditions) {
        this.fulfillPreconditions = fulfillPreconditions;
    }

    public String getFulfillPreconditions() {
        return fulfillPreconditions;
    }

    public void setFulfillFeatureSchedule(String fulfillFeatureSchedule) {
        this.fulfillFeatureSchedule = fulfillFeatureSchedule;
    }

    public String getFulfillFeatureSchedule() {
        return fulfillFeatureSchedule;
    }

    public void setCorporateLeaseFulfillment(org.museframework.bian.classes.BusinessService corporateLeaseFulfillment) {
        this.corporateLeaseFulfillment = corporateLeaseFulfillment;
    }

    public org.museframework.bian.classes.BusinessService getCorporateLeaseFulfillment() {
        return corporateLeaseFulfillment;
    }

    public void setFulfillPostconditions(String fulfillPostconditions) {
        this.fulfillPostconditions = fulfillPostconditions;
    }

    public String getFulfillPostconditions() {
        return fulfillPostconditions;
    }

    public void setFulfillCorporateLeaseFulfillmentServiceType(String fulfillCorporateLeaseFulfillmentServiceType) {
        this.fulfillCorporateLeaseFulfillmentServiceType = fulfillCorporateLeaseFulfillmentServiceType;
    }

    public String getFulfillCorporateLeaseFulfillmentServiceType() {
        return fulfillCorporateLeaseFulfillmentServiceType;
    }

    public void setFulfillCorporateLeaseFulfillmentServiceDescription(String fulfillCorporateLeaseFulfillmentServiceDescription) {
        this.fulfillCorporateLeaseFulfillmentServiceDescription = fulfillCorporateLeaseFulfillmentServiceDescription;
    }

    public String getFulfillCorporateLeaseFulfillmentServiceDescription() {
        return fulfillCorporateLeaseFulfillmentServiceDescription;
    }

    public void setFulfillCorporateLeaseFulfillmentServiceInputsandOuputs(String fulfillCorporateLeaseFulfillmentServiceInputsandOuputs) {
        this.fulfillCorporateLeaseFulfillmentServiceInputsandOuputs = fulfillCorporateLeaseFulfillmentServiceInputsandOuputs;
    }

    public String getFulfillCorporateLeaseFulfillmentServiceInputsandOuputs() {
        return fulfillCorporateLeaseFulfillmentServiceInputsandOuputs;
    }

    public void setFulfillCorporateLeaseFulfillmentServiceWorkProduct(String fulfillCorporateLeaseFulfillmentServiceWorkProduct) {
        this.fulfillCorporateLeaseFulfillmentServiceWorkProduct = fulfillCorporateLeaseFulfillmentServiceWorkProduct;
    }

    public String getFulfillCorporateLeaseFulfillmentServiceWorkProduct() {
        return fulfillCorporateLeaseFulfillmentServiceWorkProduct;
    }

    public void setFulfillCorporateLeaseFulfillmentServiceName(String fulfillCorporateLeaseFulfillmentServiceName) {
        this.fulfillCorporateLeaseFulfillmentServiceName = fulfillCorporateLeaseFulfillmentServiceName;
    }

    public String getFulfillCorporateLeaseFulfillmentServiceName() {
        return fulfillCorporateLeaseFulfillmentServiceName;
    }
}