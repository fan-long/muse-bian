package org.museframework.bian.factoring.dto;

public class RetrieveAccountsReceivableEvaluationFulfillmentRequest {
    private String factoringid;

    private String accountsreceivableevaluationfulfillmentid;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountsreceivableevaluationfulfillmentid(String accountsreceivableevaluationfulfillmentid) {
        this.accountsreceivableevaluationfulfillmentid = accountsreceivableevaluationfulfillmentid;
    }

    public String getAccountsreceivableevaluationfulfillmentid() {
        return accountsreceivableevaluationfulfillmentid;
    }
}