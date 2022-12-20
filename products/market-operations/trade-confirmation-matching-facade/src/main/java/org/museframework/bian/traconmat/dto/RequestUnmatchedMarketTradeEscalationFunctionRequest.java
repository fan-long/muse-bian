package org.museframework.bian.traconmat.dto;

public class RequestUnmatchedMarketTradeEscalationFunctionRequest {
    private String tradeconfirmationmatchingid;

    private String unmatchedmarkettradeescalationfunctionid;

    private org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction unmatchedMarketTradeEscalationFunction;

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

    public void setUnmatchedMarketTradeEscalationFunction(org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction unmatchedMarketTradeEscalationFunction) {
        this.unmatchedMarketTradeEscalationFunction = unmatchedMarketTradeEscalationFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction getUnmatchedMarketTradeEscalationFunction() {
        return unmatchedMarketTradeEscalationFunction;
    }
}