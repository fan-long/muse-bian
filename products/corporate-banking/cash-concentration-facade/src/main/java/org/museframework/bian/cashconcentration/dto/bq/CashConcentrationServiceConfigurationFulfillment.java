/*The configuration and execution of Cash Position Monitoring and Transfer Fulfillment arrangement within the Cash Position Monitoring and Transfer Fulfillment*/
package org.museframework.bian.cashconcentration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CashConcentrationServiceConfigurationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Cash Concentration Service Configuration Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Cash Concentration Service Configuration Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility accountBalanceSweepingFacilityReference;

    /*Reference to Cash Concentration Service Configuration Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object cashConcentrationServiceConfigurationFulfillmentReference;

    /*The type of Cash Concentration Service Configuration Fulfillment*/
    @MetaField
    private String cashConcentrationServiceConfigurationFulfillmentType;

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

    public void setAccountBalanceSweepingFacilityReference(org.museframework.bian.classes.FinancialFacility accountBalanceSweepingFacilityReference) {
        this.accountBalanceSweepingFacilityReference = accountBalanceSweepingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getAccountBalanceSweepingFacilityReference() {
        return accountBalanceSweepingFacilityReference;
    }

    public void setCashConcentrationServiceConfigurationFulfillmentReference(org.museframework.bian.classes.Object cashConcentrationServiceConfigurationFulfillmentReference) {
        this.cashConcentrationServiceConfigurationFulfillmentReference = cashConcentrationServiceConfigurationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getCashConcentrationServiceConfigurationFulfillmentReference() {
        return cashConcentrationServiceConfigurationFulfillmentReference;
    }

    public void setCashConcentrationServiceConfigurationFulfillmentType(String cashConcentrationServiceConfigurationFulfillmentType) {
        this.cashConcentrationServiceConfigurationFulfillmentType = cashConcentrationServiceConfigurationFulfillmentType;
    }

    public String getCashConcentrationServiceConfigurationFulfillmentType() {
        return cashConcentrationServiceConfigurationFulfillmentType;
    }
}