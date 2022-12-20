package org.museframework.bian.mortgageloan.dto;

public class InitiateBillingRequest {
    private String mortgageloanid;

    private String billingid;

    private org.museframework.bian.mortgageloan.dto.bq.Billing billing;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setBillingid(String billingid) {
        this.billingid = billingid;
    }

    public String getBillingid() {
        return billingid;
    }

    public void setBilling(org.museframework.bian.mortgageloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Billing getBilling() {
        return billing;
    }
}