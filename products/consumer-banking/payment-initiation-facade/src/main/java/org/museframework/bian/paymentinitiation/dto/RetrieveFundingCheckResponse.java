package org.museframework.bian.paymentinitiation.dto;

public class RetrieveFundingCheckResponse {
    private org.museframework.bian.paymentinitiation.dto.bq.FundingCheck fundingCheck;

    public void setFundingCheck(org.museframework.bian.paymentinitiation.dto.bq.FundingCheck fundingCheck) {
        this.fundingCheck = fundingCheck;
    }

    public org.museframework.bian.paymentinitiation.dto.bq.FundingCheck getFundingCheck() {
        return fundingCheck;
    }
}