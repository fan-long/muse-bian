package org.museframework.bian.corcuracc.dto;

public class UpdatePaymentsRequest {
    private String corporatecurrentaccountid;

    private String paymentsid;

    private org.museframework.bian.corcuracc.dto.bq.Payments payments;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.corcuracc.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.corcuracc.dto.bq.Payments getPayments() {
        return payments;
    }
}