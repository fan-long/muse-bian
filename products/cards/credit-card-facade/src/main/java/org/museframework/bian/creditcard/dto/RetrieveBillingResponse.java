package org.museframework.bian.creditcard.dto;

public class RetrieveBillingResponse {
    private org.museframework.bian.creditcard.dto.bq.Billing billing;

    public void setBilling(org.museframework.bian.creditcard.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.creditcard.dto.bq.Billing getBilling() {
        return billing;
    }
}