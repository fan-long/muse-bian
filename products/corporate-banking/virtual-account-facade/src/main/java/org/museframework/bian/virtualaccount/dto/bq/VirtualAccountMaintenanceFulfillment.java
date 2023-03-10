/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class VirtualAccountMaintenanceFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Virtual Account Maintenance Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Virtual Account Maintenance Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility virtualAccountFacilityReference;

    /*Reference to Virtual Account Maintenance Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object virtualAccountMaintenanceFulfillmentReference;

    /*The type of Virtual Account Maintenance Fulfillment*/
    @MetaField(0)
    private String virtualAccountMaintenanceFulfillmentType;

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

    public void setVirtualAccountFacilityReference(org.museframework.bian.classes.FinancialFacility virtualAccountFacilityReference) {
        this.virtualAccountFacilityReference = virtualAccountFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getVirtualAccountFacilityReference() {
        return virtualAccountFacilityReference;
    }

    public void setVirtualAccountMaintenanceFulfillmentReference(org.museframework.bian.classes.Object virtualAccountMaintenanceFulfillmentReference) {
        this.virtualAccountMaintenanceFulfillmentReference = virtualAccountMaintenanceFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getVirtualAccountMaintenanceFulfillmentReference() {
        return virtualAccountMaintenanceFulfillmentReference;
    }

    public void setVirtualAccountMaintenanceFulfillmentType(String virtualAccountMaintenanceFulfillmentType) {
        this.virtualAccountMaintenanceFulfillmentType = virtualAccountMaintenanceFulfillmentType;
    }

    public String getVirtualAccountMaintenanceFulfillmentType() {
        return virtualAccountMaintenanceFulfillmentType;
    }
}