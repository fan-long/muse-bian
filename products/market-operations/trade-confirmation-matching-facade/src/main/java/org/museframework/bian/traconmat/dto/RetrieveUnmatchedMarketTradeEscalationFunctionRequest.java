package org.museframework.bian.traconmat.dto;

public class RetrieveUnmatchedMarketTradeEscalationFunctionRequest {
    private String tradeconfirmationmatchingid;

    private String unmatchedmarkettradeescalationfunctionid;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setUnmatchedmarkettradeescalationfunctionid(String unmatchedmarkettradeescalationfunctionid) {
        this.unmatchedmarkettradeescalationfunctionid = unmatchedmarkettradeescalationfunctionid;
    }

    public String getUnmatchedmarkettradeescalationfunctionid() {
        return unmatchedmarkettradeescalationfunctionid;
    }
}