package org.museframework.bian.directdebit.dto;

public class ExecutePaymentInitiationRequest {
    private String directdebitid;

    private String paymentinitiationid;

    private org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setPaymentInitiation(org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation) {
        this.paymentInitiation = paymentInitiation;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentInitiation getPaymentInitiation() {
        return paymentInitiation;
    }
}