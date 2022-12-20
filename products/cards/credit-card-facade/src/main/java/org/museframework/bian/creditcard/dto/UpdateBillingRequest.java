package org.museframework.bian.creditcard.dto;

public class UpdateBillingRequest {
    private String creditcardid;

    private String billingid;

    private org.museframework.bian.creditcard.dto.bq.Billing billing;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setBillingid(String billingid) {
        this.billingid = billingid;
    }

    public String getBillingid() {
        return billingid;
    }

    public void setBilling(org.museframework.bian.creditcard.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.creditcard.dto.bq.Billing getBilling() {
        return billing;
    }
}