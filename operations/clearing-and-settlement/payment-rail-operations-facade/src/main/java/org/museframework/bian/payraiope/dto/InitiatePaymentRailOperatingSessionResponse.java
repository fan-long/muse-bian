package org.museframework.bian.payraiope.dto;

public class InitiatePaymentRailOperatingSessionResponse {
    private org.museframework.bian.payraiope.dto.cr.PaymentRailOperatingSession paymentRailOperatingSession;

    public void setPaymentRailOperatingSession(org.museframework.bian.payraiope.dto.cr.PaymentRailOperatingSession paymentRailOperatingSession) {
        this.paymentRailOperatingSession = paymentRailOperatingSession;
    }

    public org.museframework.bian.payraiope.dto.cr.PaymentRailOperatingSession getPaymentRailOperatingSession() {
        return paymentRailOperatingSession;
    }
}