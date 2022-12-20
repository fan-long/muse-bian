package org.museframework.bian.delacchan.dto;

public class UpdatePaymentRequest {
    private String delinquentaccounthandlingid;

    private String paymentid;

    private org.museframework.bian.delacchan.dto.bq.Payment payment;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.delacchan.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.delacchan.dto.bq.Payment getPayment() {
        return payment;
    }
}