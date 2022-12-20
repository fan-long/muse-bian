package org.museframework.bian.traandprirep.dto;

public class InitiateTransactionReportingFunctionRequest {
    private String tradeandpricereportingid;

    private String transactionreportingfunctionid;

    private org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction transactionReportingFunction;

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

    public void setTransactionReportingFunction(org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction transactionReportingFunction) {
        this.transactionReportingFunction = transactionReportingFunction;
    }

    public org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction getTransactionReportingFunction() {
        return transactionReportingFunction;
    }
}