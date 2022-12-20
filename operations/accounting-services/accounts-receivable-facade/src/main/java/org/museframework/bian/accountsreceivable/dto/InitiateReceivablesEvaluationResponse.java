package org.museframework.bian.accountsreceivable.dto;

public class InitiateReceivablesEvaluationResponse {
    private org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation;

    public void setReceivablesEvaluation(org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation) {
        this.receivablesEvaluation = receivablesEvaluation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation getReceivablesEvaluation() {
        return receivablesEvaluation;
    }
}