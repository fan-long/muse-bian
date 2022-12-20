package org.museframework.bian.consumerinvestments.dto;

public class RetrieveFundingCheckResponse {
    private org.museframework.bian.consumerinvestments.dto.bq.FundingCheck fundingCheck;

    public void setFundingCheck(org.museframework.bian.consumerinvestments.dto.bq.FundingCheck fundingCheck) {
        this.fundingCheck = fundingCheck;
    }

    public org.museframework.bian.consumerinvestments.dto.bq.FundingCheck getFundingCheck() {
        return fundingCheck;
    }
}