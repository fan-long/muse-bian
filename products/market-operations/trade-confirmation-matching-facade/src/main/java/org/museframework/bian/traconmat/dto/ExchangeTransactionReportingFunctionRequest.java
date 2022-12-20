package org.museframework.bian.traconmat.dto;

public class ExchangeTransactionReportingFunctionRequest {
    private String tradeconfirmationmatchingid;

    private String transactionreportingfunctionid;

    private org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction transactionReportingFunction;

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

    public void setTransactionReportingFunction(org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction transactionReportingFunction) {
        this.transactionReportingFunction = transactionReportingFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction getTransactionReportingFunction() {
        return transactionReportingFunction;
    }
}