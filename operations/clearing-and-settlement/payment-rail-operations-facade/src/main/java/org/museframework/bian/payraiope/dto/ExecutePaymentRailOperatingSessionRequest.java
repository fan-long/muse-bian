package org.museframework.bian.payraiope.dto;

public class ExecutePaymentRailOperatingSessionRequest {
    private String paymentrailoperationsid;

    private org.museframework.bian.payraiope.dto.cr.PaymentRailOperatingSession paymentRailOperatingSession;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setPaymentRailOperatingSession(org.museframework.bian.payraiope.dto.cr.PaymentRailOperatingSession paymentRailOperatingSession) {
        this.paymentRailOperatingSession = paymentRailOperatingSession;
    }

    public org.museframework.bian.payraiope.dto.cr.PaymentRailOperatingSession getPaymentRailOperatingSession() {
        return paymentRailOperatingSession;
    }
}