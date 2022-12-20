package org.museframework.bian.traconmat.dto;

public class RetrieveTransactionReportingFunctionRequest {
    private String tradeconfirmationmatchingid;

    private String transactionreportingfunctionid;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setTransactionreportingfunctionid(String transactionreportingfunctionid) {
        this.transactionreportingfunctionid = transactionreportingfunctionid;
    }

    public String getTransactionreportingfunctionid() {
        return transactionreportingfunctionid;
    }
}