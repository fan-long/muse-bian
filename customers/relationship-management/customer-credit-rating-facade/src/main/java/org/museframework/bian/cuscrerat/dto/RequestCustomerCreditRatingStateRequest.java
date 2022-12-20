package org.museframework.bian.cuscrerat.dto;

public class RequestCustomerCreditRatingStateRequest {
    private String customercreditratingid;

    private org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState customerCreditRatingState;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setCustomerCreditRatingState(org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState customerCreditRatingState) {
        this.customerCreditRatingState = customerCreditRatingState;
    }

    public org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState getCustomerCreditRatingState() {
        return customerCreditRatingState;
    }
}