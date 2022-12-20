package org.museframework.bian.traandprirep.dto;

public class RetrieveTransactionReportingFunctionResponse {
    private org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction transactionReportingFunction;

    public void setTransactionReportingFunction(org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction transactionReportingFunction) {
        this.transactionReportingFunction = transactionReportingFunction;
    }

    public org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction getTransactionReportingFunction() {
        return transactionReportingFunction;
    }
}