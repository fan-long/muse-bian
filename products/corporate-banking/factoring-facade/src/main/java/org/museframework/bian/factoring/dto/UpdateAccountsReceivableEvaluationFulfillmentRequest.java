package org.museframework.bian.factoring.dto;

public class UpdateAccountsReceivableEvaluationFulfillmentRequest {
    private String factoringid;

    private String accountsreceivableevaluationfulfillmentid;

    private org.museframework.bian.factoring.dto.bq.AccountsReceivableEvaluationFulfillment accountsReceivableEvaluationFulfillment;

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

    public void setAccountsReceivableEvaluationFulfillment(org.museframework.bian.factoring.dto.bq.AccountsReceivableEvaluationFulfillment accountsReceivableEvaluationFulfillment) {
        this.accountsReceivableEvaluationFulfillment = accountsReceivableEvaluationFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountsReceivableEvaluationFulfillment getAccountsReceivableEvaluationFulfillment() {
        return accountsReceivableEvaluationFulfillment;
    }
}