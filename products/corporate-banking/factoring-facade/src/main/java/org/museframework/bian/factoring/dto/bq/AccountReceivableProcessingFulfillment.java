/*The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment*/
package org.museframework.bian.factoring.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountReceivableProcessingFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Account Receivable Processing Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Account Receivable Processing Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility factoringFacilityReference;

    /*Reference to Account Receivable Processing Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object accountReceivableProcessingFulfillmentReference;

    /*The type of Account Receivable Processing Fulfillment*/
    @MetaField
    private String accountReceivableProcessingFulfillmentType;

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

    public void setFactoringFacilityReference(org.museframework.bian.classes.FinancialFacility factoringFacilityReference) {
        this.factoringFacilityReference = factoringFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getFactoringFacilityReference() {
        return factoringFacilityReference;
    }

    public void setAccountReceivableProcessingFulfillmentReference(org.museframework.bian.classes.Object accountReceivableProcessingFulfillmentReference) {
        this.accountReceivableProcessingFulfillmentReference = accountReceivableProcessingFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getAccountReceivableProcessingFulfillmentReference() {
        return accountReceivableProcessingFulfillmentReference;
    }

    public void setAccountReceivableProcessingFulfillmentType(String accountReceivableProcessingFulfillmentType) {
        this.accountReceivableProcessingFulfillmentType = accountReceivableProcessingFulfillmentType;
    }

    public String getAccountReceivableProcessingFulfillmentType() {
        return accountReceivableProcessingFulfillmentType;
    }
}