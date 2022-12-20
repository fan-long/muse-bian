package org.museframework.bian.factoring.dto;

public class NotifyAccountReceivableProcessingFulfillmentRequest {
    private String factoringid;

    private String accountreceivableprocessingfulfillmentid;

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
}