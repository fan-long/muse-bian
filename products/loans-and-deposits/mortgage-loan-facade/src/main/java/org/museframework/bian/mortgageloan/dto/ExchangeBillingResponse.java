package org.museframework.bian.mortgageloan.dto;

public class ExchangeBillingResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Billing billing;

    public void setBilling(org.museframework.bian.mortgageloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Billing getBilling() {
        return billing;
    }
}