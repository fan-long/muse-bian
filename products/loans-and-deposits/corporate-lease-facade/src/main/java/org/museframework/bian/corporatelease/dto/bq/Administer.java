/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.corporatelease.dto.bq;

public class Administer {
    /*The required status/situation prior to the implementation of the feature*/
    private String administerPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String administerFeatureSchedule;

    /*The Corporate Lease Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService corporateLeaseAdministration;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String administerPostconditions;

    /*Reference to the specific business service type*/
    private String administerCorporateLeaseAdministrationServiceType;

    /*Description of the performed business service*/
    private String administerCorporateLeaseAdministrationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String administerCorporateLeaseAdministrationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String administerCorporateLeaseAdministrationServiceWorkProduct;

    /**/
    private String administerCorporateLeaseAdministrationServiceName;

    public void setAdministerPreconditions(String administerPreconditions) {
        this.administerPreconditions = administerPreconditions;
    }

    public String getAdministerPreconditions() {
        return administerPreconditions;
    }

    public void setAdministerFeatureSchedule(String administerFeatureSchedule) {
        this.administerFeatureSchedule = administerFeatureSchedule;
    }

    public String getAdministerFeatureSchedule() {
        return administerFeatureSchedule;
    }

    public void setCorporateLeaseAdministration(org.museframework.bian.classes.BusinessService corporateLeaseAdministration) {
        this.corporateLeaseAdministration = corporateLeaseAdministration;
    }

    public org.museframework.bian.classes.BusinessService getCorporateLeaseAdministration() {
        return corporateLeaseAdministration;
    }

    public void setAdministerPostconditions(String administerPostconditions) {
        this.administerPostconditions = administerPostconditions;
    }

    public String getAdministerPostconditions() {
        return administerPostconditions;
    }

    public void setAdministerCorporateLeaseAdministrationServiceType(String administerCorporateLeaseAdministrationServiceType) {
        this.administerCorporateLeaseAdministrationServiceType = administerCorporateLeaseAdministrationServiceType;
    }

    public String getAdministerCorporateLeaseAdministrationServiceType() {
        return administerCorporateLeaseAdministrationServiceType;
    }

    public void setAdministerCorporateLeaseAdministrationServiceDescription(String administerCorporateLeaseAdministrationServiceDescription) {
        this.administerCorporateLeaseAdministrationServiceDescription = administerCorporateLeaseAdministrationServiceDescription;
    }

    public String getAdministerCorporateLeaseAdministrationServiceDescription() {
        return administerCorporateLeaseAdministrationServiceDescription;
    }

    public void setAdministerCorporateLeaseAdministrationServiceInputsandOuputs(String administerCorporateLeaseAdministrationServiceInputsandOuputs) {
        this.administerCorporateLeaseAdministrationServiceInputsandOuputs = administerCorporateLeaseAdministrationServiceInputsandOuputs;
    }

    public String getAdministerCorporateLeaseAdministrationServiceInputsandOuputs() {
        return administerCorporateLeaseAdministrationServiceInputsandOuputs;
    }

    public void setAdministerCorporateLeaseAdministrationServiceWorkProduct(String administerCorporateLeaseAdministrationServiceWorkProduct) {
        this.administerCorporateLeaseAdministrationServiceWorkProduct = administerCorporateLeaseAdministrationServiceWorkProduct;
    }

    public String getAdministerCorporateLeaseAdministrationServiceWorkProduct() {
        return administerCorporateLeaseAdministrationServiceWorkProduct;
    }

    public void setAdministerCorporateLeaseAdministrationServiceName(String administerCorporateLeaseAdministrationServiceName) {
        this.administerCorporateLeaseAdministrationServiceName = administerCorporateLeaseAdministrationServiceName;
    }

    public String getAdministerCorporateLeaseAdministrationServiceName() {
        return administerCorporateLeaseAdministrationServiceName;
    }
}