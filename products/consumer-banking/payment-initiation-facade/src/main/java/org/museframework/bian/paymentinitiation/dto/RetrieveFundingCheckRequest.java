package org.museframework.bian.paymentinitiation.dto;

public class RetrieveFundingCheckRequest {
    private String paymentinitiationid;

    private String fundingcheckid;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setFundingcheckid(String fundingcheckid) {
        this.fundingcheckid = fundingcheckid;
    }

    public String getFundingcheckid() {
        return fundingcheckid;
    }
}