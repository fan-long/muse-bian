/*The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment*/
package org.museframework.bian.factoring.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountsReceivablePurchaseFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Accounts Receivable Purchase Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Accounts Receivable Purchase Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility factoringFacilityReference;

    /*Reference to Accounts Receivable Purchase Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object accountsReceivablePurchaseFulfillmentReference;

    /*The type of Accounts Receivable Purchase Fulfillment*/
    @MetaField(0)
    private String accountsReceivablePurchaseFulfillmentType;

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

    public void setAccountsReceivablePurchaseFulfillmentReference(org.museframework.bian.classes.Object accountsReceivablePurchaseFulfillmentReference) {
        this.accountsReceivablePurchaseFulfillmentReference = accountsReceivablePurchaseFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivablePurchaseFulfillmentReference() {
        return accountsReceivablePurchaseFulfillmentReference;
    }

    public void setAccountsReceivablePurchaseFulfillmentType(String accountsReceivablePurchaseFulfillmentType) {
        this.accountsReceivablePurchaseFulfillmentType = accountsReceivablePurchaseFulfillmentType;
    }

    public String getAccountsReceivablePurchaseFulfillmentType() {
        return accountsReceivablePurchaseFulfillmentType;
    }
}