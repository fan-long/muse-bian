package org.museframework.bian.merchandisingloan.dto;

public class UpdateBillingResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Billing billing;

    public void setBilling(org.museframework.bian.merchandisingloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Billing getBilling() {
        return billing;
    }
}