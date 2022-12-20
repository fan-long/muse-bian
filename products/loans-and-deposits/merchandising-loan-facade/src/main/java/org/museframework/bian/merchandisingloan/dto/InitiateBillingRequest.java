package org.museframework.bian.merchandisingloan.dto;

public class InitiateBillingRequest {
    private String merchandisingloanid;

    private String billingid;

    private org.museframework.bian.merchandisingloan.dto.bq.Billing billing;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setBillingid(String billingid) {
        this.billingid = billingid;
    }

    public String getBillingid() {
        return billingid;
    }

    public void setBilling(org.museframework.bian.merchandisingloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Billing getBilling() {
        return billing;
    }
}