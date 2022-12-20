/*The configuration and execution of Notional Account Interest Allocation Fulfillment arrangement within the Notional Account Interest Allocation Fulfillment*/
package org.museframework.bian.notionalpooling.dto.bq;

public class NotionalAccountInterestAllocationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Notional Account Interest Allocation Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Notional Account Interest Allocation Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility notionalPoolingFacilityReference;

    /*Reference to Notional Account Interest Allocation Fulfillment*/
    private org.museframework.bian.classes.Object notionalAccountInterestAllocationFulfillmentReference;

    /*The type of Notional Account Interest Allocation Fulfillment*/
    private String notionalAccountInterestAllocationFulfillmentType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setNotionalPoolingFacilityReference(org.museframework.bian.classes.FinancialFacility notionalPoolingFacilityReference) {
        this.notionalPoolingFacilityReference = notionalPoolingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getNotionalPoolingFacilityReference() {
        return notionalPoolingFacilityReference;
    }

    public void setNotionalAccountInterestAllocationFulfillmentReference(org.museframework.bian.classes.Object notionalAccountInterestAllocationFulfillmentReference) {
        this.notionalAccountInterestAllocationFulfillmentReference = notionalAccountInterestAllocationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getNotionalAccountInterestAllocationFulfillmentReference() {
        return notionalAccountInterestAllocationFulfillmentReference;
    }

    public void setNotionalAccountInterestAllocationFulfillmentType(String notionalAccountInterestAllocationFulfillmentType) {
        this.notionalAccountInterestAllocationFulfillmentType = notionalAccountInterestAllocationFulfillmentType;
    }

    public String getNotionalAccountInterestAllocationFulfillmentType() {
        return notionalAccountInterestAllocationFulfillmentType;
    }
}