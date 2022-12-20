package org.museframework.bian.marketorder.dto;

public class RetrieveFundingCheckResponse {
    private org.museframework.bian.marketorder.dto.bq.FundingCheck fundingCheck;

    public void setFundingCheck(org.museframework.bian.marketorder.dto.bq.FundingCheck fundingCheck) {
        this.fundingCheck = fundingCheck;
    }

    public org.museframework.bian.marketorder.dto.bq.FundingCheck getFundingCheck() {
        return fundingCheck;
    }
}