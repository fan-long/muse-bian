package org.museframework.bian.factoring.dto;

public class RetrieveAccountsReceivablePurchaseFulfillmentRequest {
    private String factoringid;

    private String accountsreceivablepurchasefulfillmentid;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountsreceivablepurchasefulfillmentid(String accountsreceivablepurchasefulfillmentid) {
        this.accountsreceivablepurchasefulfillmentid = accountsreceivablepurchasefulfillmentid;
    }

    public String getAccountsreceivablepurchasefulfillmentid() {
        return accountsreceivablepurchasefulfillmentid;
    }
}