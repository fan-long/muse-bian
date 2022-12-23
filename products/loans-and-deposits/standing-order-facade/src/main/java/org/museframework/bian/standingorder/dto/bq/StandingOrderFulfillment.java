/*The configuration and execution of Standing Order Fulfillment arrangement within the Standing Order Fulfillment*/
package org.museframework.bian.standingorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StandingOrderFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Standing Order Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Standing Order Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility standingOrderFacilityReference;

    /*Reference to Standing Order Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object standingOrderFulfillmentReference;

    /*The type of Standing Order Fulfillment*/
    @MetaField
    private String standingOrderFulfillmentType;

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

    public void setStandingOrderFacilityReference(org.museframework.bian.classes.FinancialFacility standingOrderFacilityReference) {
        this.standingOrderFacilityReference = standingOrderFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getStandingOrderFacilityReference() {
        return standingOrderFacilityReference;
    }

    public void setStandingOrderFulfillmentReference(org.museframework.bian.classes.Object standingOrderFulfillmentReference) {
        this.standingOrderFulfillmentReference = standingOrderFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getStandingOrderFulfillmentReference() {
        return standingOrderFulfillmentReference;
    }

    public void setStandingOrderFulfillmentType(String standingOrderFulfillmentType) {
        this.standingOrderFulfillmentType = standingOrderFulfillmentType;
    }

    public String getStandingOrderFulfillmentType() {
        return standingOrderFulfillmentType;
    }
}