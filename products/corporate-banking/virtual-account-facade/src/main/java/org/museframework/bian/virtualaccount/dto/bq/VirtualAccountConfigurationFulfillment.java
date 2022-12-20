/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

public class VirtualAccountConfigurationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Virtual Account Configuration Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Virtual Account Configuration Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility virtualAccountFacilityReference;

    /*Reference to Virtual Account Configuration Fulfillment*/
    private org.museframework.bian.classes.Object virtualAccountConfigurationFulfillmentReference;

    /*The type of Virtual Account Configuration Fulfillment*/
    private String virtualAccountConfigurationFulfillmentType;

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

    public void setVirtualAccountConfigurationFulfillmentReference(org.museframework.bian.classes.Object virtualAccountConfigurationFulfillmentReference) {
        this.virtualAccountConfigurationFulfillmentReference = virtualAccountConfigurationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getVirtualAccountConfigurationFulfillmentReference() {
        return virtualAccountConfigurationFulfillmentReference;
    }

    public void setVirtualAccountConfigurationFulfillmentType(String virtualAccountConfigurationFulfillmentType) {
        this.virtualAccountConfigurationFulfillmentType = virtualAccountConfigurationFulfillmentType;
    }

    public String getVirtualAccountConfigurationFulfillmentType() {
        return virtualAccountConfigurationFulfillmentType;
    }
}