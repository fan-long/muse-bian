package org.museframework.bian.corpayser.dto;

public class RequestCorporatePayrollPaymentsFulfillmentRequest {
    private String corporatepayrollservicesid;

    private String corporatepayrollpaymentsfulfillmentid;

    private org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment;

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

    public void setCorporatePayrollPaymentsFulfillment(org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment) {
        this.corporatePayrollPaymentsFulfillment = corporatePayrollPaymentsFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment getCorporatePayrollPaymentsFulfillment() {
        return corporatePayrollPaymentsFulfillment;
    }
}