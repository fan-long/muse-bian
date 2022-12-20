/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.syndicatedloan.dto.bq;

public class Structuring {
    /*The required status/situation prior to the implementation of the feature*/
    private String structuringPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String structuringFeatureSchedule;

    /*The Syndicated Loan Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService syndicatedLoanFacility;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String structuringPostconditions;

    /*Reference to the specific business service type*/
    private String structuringSyndicatedLoanFacilityServiceType;

    /*Description of the performed business service*/
    private String structuringSyndicatedLoanFacilityServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String structuringSyndicatedLoanFacilityServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String structuringSyndicatedLoanFacilityServiceWorkProduct;

    /**/
    private String structuringSyndicatedLoanFacilityServiceName;

    public void setStructuringPreconditions(String structuringPreconditions) {
        this.structuringPreconditions = structuringPreconditions;
    }

    public String getStructuringPreconditions() {
        return structuringPreconditions;
    }

    public void setStructuringFeatureSchedule(String structuringFeatureSchedule) {
        this.structuringFeatureSchedule = structuringFeatureSchedule;
    }

    public String getStructuringFeatureSchedule() {
        return structuringFeatureSchedule;
    }

    public void setSyndicatedLoanFacility(org.museframework.bian.classes.BusinessService syndicatedLoanFacility) {
        this.syndicatedLoanFacility = syndicatedLoanFacility;
    }

    public org.museframework.bian.classes.BusinessService getSyndicatedLoanFacility() {
        return syndicatedLoanFacility;
    }

    public void setStructuringPostconditions(String structuringPostconditions) {
        this.structuringPostconditions = structuringPostconditions;
    }

    public String getStructuringPostconditions() {
        return structuringPostconditions;
    }

    public void setStructuringSyndicatedLoanFacilityServiceType(String structuringSyndicatedLoanFacilityServiceType) {
        this.structuringSyndicatedLoanFacilityServiceType = structuringSyndicatedLoanFacilityServiceType;
    }

    public String getStructuringSyndicatedLoanFacilityServiceType() {
        return structuringSyndicatedLoanFacilityServiceType;
    }

    public void setStructuringSyndicatedLoanFacilityServiceDescription(String structuringSyndicatedLoanFacilityServiceDescription) {
        this.structuringSyndicatedLoanFacilityServiceDescription = structuringSyndicatedLoanFacilityServiceDescription;
    }

    public String getStructuringSyndicatedLoanFacilityServiceDescription() {
        return structuringSyndicatedLoanFacilityServiceDescription;
    }

    public void setStructuringSyndicatedLoanFacilityServiceInputsandOuputs(String structuringSyndicatedLoanFacilityServiceInputsandOuputs) {
        this.structuringSyndicatedLoanFacilityServiceInputsandOuputs = structuringSyndicatedLoanFacilityServiceInputsandOuputs;
    }

    public String getStructuringSyndicatedLoanFacilityServiceInputsandOuputs() {
        return structuringSyndicatedLoanFacilityServiceInputsandOuputs;
    }

    public void setStructuringSyndicatedLoanFacilityServiceWorkProduct(String structuringSyndicatedLoanFacilityServiceWorkProduct) {
        this.structuringSyndicatedLoanFacilityServiceWorkProduct = structuringSyndicatedLoanFacilityServiceWorkProduct;
    }

    public String getStructuringSyndicatedLoanFacilityServiceWorkProduct() {
        return structuringSyndicatedLoanFacilityServiceWorkProduct;
    }

    public void setStructuringSyndicatedLoanFacilityServiceName(String structuringSyndicatedLoanFacilityServiceName) {
        this.structuringSyndicatedLoanFacilityServiceName = structuringSyndicatedLoanFacilityServiceName;
    }

    public String getStructuringSyndicatedLoanFacilityServiceName() {
        return structuringSyndicatedLoanFacilityServiceName;
    }
}