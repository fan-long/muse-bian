/*The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment*/
package org.museframework.bian.cortruser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TrustTaxandExpenseFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Trust Tax and Expense Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Trust Tax and Expense Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference;

    /*Reference to Trust Tax and Expense Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object trustTaxandExpenseFulfillmentReference;

    /*The type of Trust Tax and Expense Fulfillment*/
    @MetaField
    private String trustTaxandExpenseFulfillmentType;

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

    public void setTrustTaxandExpenseFulfillmentReference(org.museframework.bian.classes.Object trustTaxandExpenseFulfillmentReference) {
        this.trustTaxandExpenseFulfillmentReference = trustTaxandExpenseFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getTrustTaxandExpenseFulfillmentReference() {
        return trustTaxandExpenseFulfillmentReference;
    }

    public void setTrustTaxandExpenseFulfillmentType(String trustTaxandExpenseFulfillmentType) {
        this.trustTaxandExpenseFulfillmentType = trustTaxandExpenseFulfillmentType;
    }

    public String getTrustTaxandExpenseFulfillmentType() {
        return trustTaxandExpenseFulfillmentType;
    }
}