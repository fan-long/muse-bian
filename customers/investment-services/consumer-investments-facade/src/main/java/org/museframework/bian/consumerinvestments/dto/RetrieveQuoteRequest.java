package org.museframework.bian.consumerinvestments.dto;

public class RetrieveQuoteRequest {
    private String consumerinvestmentsid;

    private String quoteid;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setQuoteid(String quoteid) {
        this.quoteid = quoteid;
    }

    public String getQuoteid() {
        return quoteid;
    }
}