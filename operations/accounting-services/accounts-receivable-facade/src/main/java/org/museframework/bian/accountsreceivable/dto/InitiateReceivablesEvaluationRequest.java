package org.museframework.bian.accountsreceivable.dto;

public class InitiateReceivablesEvaluationRequest {
    private String accountsreceivableid;

    private String receivablesevaluationid;

    private org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation;

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

    public void setReceivablesEvaluation(org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation) {
        this.receivablesEvaluation = receivablesEvaluation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation getReceivablesEvaluation() {
        return receivablesEvaluation;
    }
}