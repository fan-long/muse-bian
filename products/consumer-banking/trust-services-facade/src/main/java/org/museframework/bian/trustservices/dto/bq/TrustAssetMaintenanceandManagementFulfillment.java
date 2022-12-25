/*The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment*/
package org.museframework.bian.trustservices.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TrustAssetMaintenanceandManagementFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Trust Asset Maintenance and Management Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Trust Asset Maintenance and Management Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference;

    /*Reference to Trust Asset Maintenance and Management Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object trustAssetMaintenanceandManagementFulfillmentReference;

    /*The type of Trust Asset Maintenance and Management Fulfillment*/
    @MetaField(0)
    private String trustAssetMaintenanceandManagementFulfillmentType;

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

    public void setCorporateTrustServicesFacilityReference(org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference) {
        this.corporateTrustServicesFacilityReference = corporateTrustServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getCorporateTrustServicesFacilityReference() {
        return corporateTrustServicesFacilityReference;
    }

    public void setTrustAssetMaintenanceandManagementFulfillmentReference(org.museframework.bian.classes.Object trustAssetMaintenanceandManagementFulfillmentReference) {
        this.trustAssetMaintenanceandManagementFulfillmentReference = trustAssetMaintenanceandManagementFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getTrustAssetMaintenanceandManagementFulfillmentReference() {
        return trustAssetMaintenanceandManagementFulfillmentReference;
    }

    public void setTrustAssetMaintenanceandManagementFulfillmentType(String trustAssetMaintenanceandManagementFulfillmentType) {
        this.trustAssetMaintenanceandManagementFulfillmentType = trustAssetMaintenanceandManagementFulfillmentType;
    }

    public String getTrustAssetMaintenanceandManagementFulfillmentType() {
        return trustAssetMaintenanceandManagementFulfillmentType;
    }
}