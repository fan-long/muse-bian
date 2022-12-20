package org.museframework.bian.servicingmandate.dto;

public class EvaluateCustomerMandateRequest {
    private String servicingmandateid;

    private String customermandateid;

    private org.museframework.bian.servicingmandate.dto.bq.CustomerMandate customerMandate;

    public void setServicingmandateid(String servicingmandateid) {
        this.servicingmandateid = servicingmandateid;
    }

    public String getServicingmandateid() {
        return servicingmandateid;
    }

    public void setCustomermandateid(String customermandateid) {
        this.customermandateid = customermandateid;
    }

    public String getCustomermandateid() {
        return customermandateid;
    }

    public void setCustomerMandate(org.museframework.bian.servicingmandate.dto.bq.CustomerMandate customerMandate) {
        this.customerMandate = customerMandate;
    }

    public org.museframework.bian.servicingmandate.dto.bq.CustomerMandate getCustomerMandate() {
        return customerMandate;
    }
}