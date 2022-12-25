/*The configuration and execution of Private Placement Fulfillment arrangement within the Private Placement Fulfillment*/
package org.museframework.bian.privateplacement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PrivatePlacementInstrumentMaintenanceFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Private Placement Instrument Maintenance Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Private Placement Instrument Maintenance Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility privatePlacementFacilityReference;

    /*Reference to Private Placement Instrument Maintenance Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object privatePlacementInstrumentMaintenanceFulfillmentReference;

    /*The type of Private Placement Instrument Maintenance Fulfillment*/
    @MetaField(0)
    private String privatePlacementInstrumentMaintenanceFulfillmentType;

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

    public void setPrivatePlacementInstrumentMaintenanceFulfillmentReference(org.museframework.bian.classes.Object privatePlacementInstrumentMaintenanceFulfillmentReference) {
        this.privatePlacementInstrumentMaintenanceFulfillmentReference = privatePlacementInstrumentMaintenanceFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getPrivatePlacementInstrumentMaintenanceFulfillmentReference() {
        return privatePlacementInstrumentMaintenanceFulfillmentReference;
    }

    public void setPrivatePlacementInstrumentMaintenanceFulfillmentType(String privatePlacementInstrumentMaintenanceFulfillmentType) {
        this.privatePlacementInstrumentMaintenanceFulfillmentType = privatePlacementInstrumentMaintenanceFulfillmentType;
    }

    public String getPrivatePlacementInstrumentMaintenanceFulfillmentType() {
        return privatePlacementInstrumentMaintenanceFulfillmentType;
    }
}