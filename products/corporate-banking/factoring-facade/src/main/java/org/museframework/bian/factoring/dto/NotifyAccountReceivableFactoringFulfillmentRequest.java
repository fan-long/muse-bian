package org.museframework.bian.factoring.dto;

public class NotifyAccountReceivableFactoringFulfillmentRequest {
    private String factoringid;

    private String accountreceivablefactoringfulfillmentid;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountreceivablefactoringfulfillmentid(String accountreceivablefactoringfulfillmentid) {
        this.accountreceivablefactoringfulfillmentid = accountreceivablefactoringfulfillmentid;
    }

    public String getAccountreceivablefactoringfulfillmentid() {
        return accountreceivablefactoringfulfillmentid;
    }
}