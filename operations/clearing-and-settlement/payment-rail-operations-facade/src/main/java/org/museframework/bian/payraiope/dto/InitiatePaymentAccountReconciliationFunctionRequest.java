package org.museframework.bian.payraiope.dto;

public class InitiatePaymentAccountReconciliationFunctionRequest {
    private String paymentrailoperationsid;

    private String paymentaccountreconciliationfunctionid;

    private org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setPaymentaccountreconciliationfunctionid(String paymentaccountreconciliationfunctionid) {
        this.paymentaccountreconciliationfunctionid = paymentaccountreconciliationfunctionid;
    }

    public String getPaymentaccountreconciliationfunctionid() {
        return paymentaccountreconciliationfunctionid;
    }

    public void setPaymentAccountReconciliationFunction(org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction) {
        this.paymentAccountReconciliationFunction = paymentAccountReconciliationFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction getPaymentAccountReconciliationFunction() {
        return paymentAccountReconciliationFunction;
    }
}