/*The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment*/
package org.museframework.bian.trustservices.dto.bq;

public class TrustCourtAdministrationFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Trust Court Administration Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Trust Court Administration Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference;

    /*Reference to Trust Court Administration Fulfillment*/
    private org.museframework.bian.classes.Object trustCourtAdministrationFulfillmentReference;

    /*The type of Trust Court Administration Fulfillment*/
    private String trustCourtAdministrationFulfillmentType;

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

    public void setTrustCourtAdministrationFulfillmentReference(org.museframework.bian.classes.Object trustCourtAdministrationFulfillmentReference) {
        this.trustCourtAdministrationFulfillmentReference = trustCourtAdministrationFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getTrustCourtAdministrationFulfillmentReference() {
        return trustCourtAdministrationFulfillmentReference;
    }

    public void setTrustCourtAdministrationFulfillmentType(String trustCourtAdministrationFulfillmentType) {
        this.trustCourtAdministrationFulfillmentType = trustCourtAdministrationFulfillmentType;
    }

    public String getTrustCourtAdministrationFulfillmentType() {
        return trustCourtAdministrationFulfillmentType;
    }
}