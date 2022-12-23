/*The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment*/
package org.museframework.bian.publicoffering.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PublicPlacementProspectusFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Public Placement Prospectus Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Public Placement Prospectus Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility publicOfferingFacilityReference;

    /*Reference to Public Placement Prospectus Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object publicPlacementProspectusFulfillmentReference;

    /*The type of Public Placement Prospectus Fulfillment*/
    @MetaField
    private String publicPlacementProspectusFulfillmentType;

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

    public void setPublicPlacementProspectusFulfillmentReference(org.museframework.bian.classes.Object publicPlacementProspectusFulfillmentReference) {
        this.publicPlacementProspectusFulfillmentReference = publicPlacementProspectusFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getPublicPlacementProspectusFulfillmentReference() {
        return publicPlacementProspectusFulfillmentReference;
    }

    public void setPublicPlacementProspectusFulfillmentType(String publicPlacementProspectusFulfillmentType) {
        this.publicPlacementProspectusFulfillmentType = publicPlacementProspectusFulfillmentType;
    }

    public String getPublicPlacementProspectusFulfillmentType() {
        return publicPlacementProspectusFulfillmentType;
    }
}