package org.museframework.bian.factoring.dto;

public class InitiateAccountsReceivablePurchaseFulfillmentRequest {
    private String factoringid;

    private String accountsreceivablepurchasefulfillmentid;

    private org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment accountsReceivablePurchaseFulfillment;

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

    public void setAccountsReceivablePurchaseFulfillment(org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment accountsReceivablePurchaseFulfillment) {
        this.accountsReceivablePurchaseFulfillment = accountsReceivablePurchaseFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment getAccountsReceivablePurchaseFulfillment() {
        return accountsReceivablePurchaseFulfillment;
    }
}