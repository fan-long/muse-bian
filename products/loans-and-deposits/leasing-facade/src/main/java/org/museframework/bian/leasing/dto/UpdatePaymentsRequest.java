package org.museframework.bian.leasing.dto;

public class UpdatePaymentsRequest {
    private String leasingid;

    private String paymentsid;

    private org.museframework.bian.leasing.dto.bq.Payments payments;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.leasing.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.leasing.dto.bq.Payments getPayments() {
        return payments;
    }
}