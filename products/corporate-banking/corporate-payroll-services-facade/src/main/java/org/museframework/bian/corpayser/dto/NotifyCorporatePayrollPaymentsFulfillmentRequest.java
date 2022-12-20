package org.museframework.bian.corpayser.dto;

public class NotifyCorporatePayrollPaymentsFulfillmentRequest {
    private String corporatepayrollservicesid;

    private String corporatepayrollpaymentsfulfillmentid;

    public void setCorporatepayrollservicesid(String corporatepayrollservicesid) {
        this.corporatepayrollservicesid = corporatepayrollservicesid;
    }

    public String getCorporatepayrollservicesid() {
        return corporatepayrollservicesid;
    }

    public void setCorporatepayrollpaymentsfulfillmentid(String corporatepayrollpaymentsfulfillmentid) {
        this.corporatepayrollpaymentsfulfillmentid = corporatepayrollpaymentsfulfillmentid;
    }

    public String getCorporatepayrollpaymentsfulfillmentid() {
        return corporatepayrollpaymentsfulfillmentid;
    }
}