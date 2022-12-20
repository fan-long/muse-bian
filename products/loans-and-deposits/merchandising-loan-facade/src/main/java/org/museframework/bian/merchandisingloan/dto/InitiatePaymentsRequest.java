package org.museframework.bian.merchandisingloan.dto;

public class InitiatePaymentsRequest {
    private String merchandisingloanid;

    private String paymentsid;

    private org.museframework.bian.merchandisingloan.dto.bq.Payments payments;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.merchandisingloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Payments getPayments() {
        return payments;
    }
}