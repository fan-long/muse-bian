/*The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment*/
package org.museframework.bian.publicoffering.dto.bq;

public class PublicPlacementInstrumentRegistrationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Public Placement Instrument Registration Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Public Placement Instrument Registration Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility publicOfferingFacilityReference;

    /*Reference to Public Placement Instrument Registration Fulfillment*/
    private org.museframework.bian.classes.Object publicPlacementInstrumentRegistrationFulfillmentReference;

    /*The type of Public Placement Instrument Registration Fulfillment*/
    private String publicPlacementInstrumentRegistrationFulfillmentType;

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

    public void setPublicOfferingFacilityReference(org.museframework.bian.classes.FinancialFacility publicOfferingFacilityReference) {
        this.publicOfferingFacilityReference = publicOfferingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getPublicOfferingFacilityReference() {
        return publicOfferingFacilityReference;
    }

    public void setPublicPlacementInstrumentRegistrationFulfillmentReference(org.museframework.bian.classes.Object publicPlacementInstrumentRegistrationFulfillmentReference) {
        this.publicPlacementInstrumentRegistrationFulfillmentReference = publicPlacementInstrumentRegistrationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getPublicPlacementInstrumentRegistrationFulfillmentReference() {
        return publicPlacementInstrumentRegistrationFulfillmentReference;
    }

    public void setPublicPlacementInstrumentRegistrationFulfillmentType(String publicPlacementInstrumentRegistrationFulfillmentType) {
        this.publicPlacementInstrumentRegistrationFulfillmentType = publicPlacementInstrumentRegistrationFulfillmentType;
    }

    public String getPublicPlacementInstrumentRegistrationFulfillmentType() {
        return publicPlacementInstrumentRegistrationFulfillmentType;
    }
}