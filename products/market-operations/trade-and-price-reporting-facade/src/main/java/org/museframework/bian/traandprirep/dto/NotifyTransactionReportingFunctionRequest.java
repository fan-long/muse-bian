package org.museframework.bian.traandprirep.dto;

public class NotifyTransactionReportingFunctionRequest {
    private String tradeandpricereportingid;

    private String transactionreportingfunctionid;

    public void setTradeandpricereportingid(String tradeandpricereportingid) {
        this.tradeandpricereportingid = tradeandpricereportingid;
    }

    public String getTradeandpricereportingid() {
        return tradeandpricereportingid;
    }

    public void setTransactionreportingfunctionid(String transactionreportingfunctionid) {
        this.transactionreportingfunctionid = transactionreportingfunctionid;
    }

    public String getTransactionreportingfunctionid() {
        return transactionreportingfunctionid;
    }
}