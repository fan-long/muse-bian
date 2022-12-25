/*The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment*/
package org.museframework.bian.publicoffering.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PublicPlacementInstrumentRegistrationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Public Placement Instrument Registration Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Public Placement Instrument Registration Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility publicOfferingFacilityReference;

    /*Reference to Public Placement Instrument Registration Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicPlacementInstrumentRegistrationFulfillmentReference;

    /*The type of Public Placement Instrument Registration Fulfillment*/
    @MetaField(0)
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