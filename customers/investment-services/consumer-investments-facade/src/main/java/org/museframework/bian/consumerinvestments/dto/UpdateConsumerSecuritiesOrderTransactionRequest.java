package org.museframework.bian.consumerinvestments.dto;

public class UpdateConsumerSecuritiesOrderTransactionRequest {
    private String consumerinvestmentsid;

    private org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setConsumerSecuritiesOrderTransaction(org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction) {
        this.consumerSecuritiesOrderTransaction = consumerSecuritiesOrderTransaction;
    }

    public org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction getConsumerSecuritiesOrderTransaction() {
        return consumerSecuritiesOrderTransaction;
    }
}