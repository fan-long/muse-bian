package org.museframework.bian.factoring.dto;

public class ExchangeAccountReceivableProcessingFulfillmentRequest {
    private String factoringid;

    private String accountreceivableprocessingfulfillmentid;

    private org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment accountReceivableProcessingFulfillment;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountreceivableprocessingfulfillmentid(String accountreceivableprocessingfulfillmentid) {
        this.accountreceivableprocessingfulfillmentid = accountreceivableprocessingfulfillmentid;
    }

    public String getAccountreceivableprocessingfulfillmentid() {
        return accountreceivableprocessingfulfillmentid;
    }

    public void setAccountReceivableProcessingFulfillment(org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment accountReceivableProcessingFulfillment) {
        this.accountReceivableProcessingFulfillment = accountReceivableProcessingFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment getAccountReceivableProcessingFulfillment() {
        return accountReceivableProcessingFulfillment;
    }
}