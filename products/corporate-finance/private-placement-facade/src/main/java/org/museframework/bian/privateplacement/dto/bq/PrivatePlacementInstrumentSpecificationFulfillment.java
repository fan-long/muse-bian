/*The configuration and execution of Private Placement Fulfillment arrangement within the Private Placement Fulfillment*/
package org.museframework.bian.privateplacement.dto.bq;

public class PrivatePlacementInstrumentSpecificationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Private Placement Instrument Specification Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Private Placement Instrument Specification Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility privatePlacementFacilityReference;

    /*Reference to Private Placement Instrument Specification Fulfillment*/
    private org.museframework.bian.classes.Object privatePlacementInstrumentSpecificationFulfillmentReference;

    /*The type of Private Placement Instrument Specification Fulfillment*/
    private String privatePlacementInstrumentSpecificationFulfillmentType;

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

    public void setPrivatePlacementFacilityReference(org.museframework.bian.classes.FinancialFacility privatePlacementFacilityReference) {
        this.privatePlacementFacilityReference = privatePlacementFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getPrivatePlacementFacilityReference() {
        return privatePlacementFacilityReference;
    }

    public void setPrivatePlacementInstrumentSpecificationFulfillmentReference(org.museframework.bian.classes.Object privatePlacementInstrumentSpecificationFulfillmentReference) {
        this.privatePlacementInstrumentSpecificationFulfillmentReference = privatePlacementInstrumentSpecificationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getPrivatePlacementInstrumentSpecificationFulfillmentReference() {
        return privatePlacementInstrumentSpecificationFulfillmentReference;
    }

    public void setPrivatePlacementInstrumentSpecificationFulfillmentType(String privatePlacementInstrumentSpecificationFulfillmentType) {
        this.privatePlacementInstrumentSpecificationFulfillmentType = privatePlacementInstrumentSpecificationFulfillmentType;
    }

    public String getPrivatePlacementInstrumentSpecificationFulfillmentType() {
        return privatePlacementInstrumentSpecificationFulfillmentType;
    }
}