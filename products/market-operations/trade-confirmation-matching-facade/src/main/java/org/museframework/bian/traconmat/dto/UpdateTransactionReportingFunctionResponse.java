package org.museframework.bian.traconmat.dto;

public class UpdateTransactionReportingFunctionResponse {
    private org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction transactionReportingFunction;

    public void setTransactionReportingFunction(org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction transactionReportingFunction) {
        this.transactionReportingFunction = transactionReportingFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction getTransactionReportingFunction() {
        return transactionReportingFunction;
    }
}