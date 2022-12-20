package org.museframework.bian.marketorder.dto;

public class RetrieveFundingCheckRequest {
    private String marketorderid;

    private String fundingcheckid;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setFundingcheckid(String fundingcheckid) {
        this.fundingcheckid = fundingcheckid;
    }

    public String getFundingcheckid() {
        return fundingcheckid;
    }
}