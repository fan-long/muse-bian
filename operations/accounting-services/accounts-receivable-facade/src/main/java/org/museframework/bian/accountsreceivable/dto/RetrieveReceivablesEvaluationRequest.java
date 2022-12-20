package org.museframework.bian.accountsreceivable.dto;

public class RetrieveReceivablesEvaluationRequest {
    private String accountsreceivableid;

    private String receivablesevaluationid;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setReceivablesevaluationid(String receivablesevaluationid) {
        this.receivablesevaluationid = receivablesevaluationid;
    }

    public String getReceivablesevaluationid() {
        return receivablesevaluationid;
    }
}