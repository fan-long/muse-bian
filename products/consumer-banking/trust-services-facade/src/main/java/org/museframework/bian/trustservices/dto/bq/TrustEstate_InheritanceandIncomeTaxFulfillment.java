/*The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment*/
package org.museframework.bian.trustservices.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TrustEstate_InheritanceandIncomeTaxFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Trust Estate, Inheritance and Income Tax Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Trust Estate, Inheritance and Income Tax Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference;

    /*Reference to Trust Estate, Inheritance and Income Tax Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object trustEstate_InheritanceandIncomeTaxFulfillmentReference;

    /*The type of Trust Estate, Inheritance and Income Tax Fulfillment*/
    @MetaField
    private String trustEstate_InheritanceandIncomeTaxFulfillmentType;

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

    public void setTrustEstate_InheritanceandIncomeTaxFulfillmentReference(org.museframework.bian.classes.Object trustEstate_InheritanceandIncomeTaxFulfillmentReference) {
        this.trustEstate_InheritanceandIncomeTaxFulfillmentReference = trustEstate_InheritanceandIncomeTaxFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getTrustEstate_InheritanceandIncomeTaxFulfillmentReference() {
        return trustEstate_InheritanceandIncomeTaxFulfillmentReference;
    }

    public void setTrustEstate_InheritanceandIncomeTaxFulfillmentType(String trustEstate_InheritanceandIncomeTaxFulfillmentType) {
        this.trustEstate_InheritanceandIncomeTaxFulfillmentType = trustEstate_InheritanceandIncomeTaxFulfillmentType;
    }

    public String getTrustEstate_InheritanceandIncomeTaxFulfillmentType() {
        return trustEstate_InheritanceandIncomeTaxFulfillmentType;
    }
}