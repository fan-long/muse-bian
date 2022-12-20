package org.museframework.bian.payraiope.dto;

public class NotifyPaymentAccountReconciliationFunctionRequest {
    private String paymentrailoperationsid;

    private String paymentaccountreconciliationfunctionid;

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
}