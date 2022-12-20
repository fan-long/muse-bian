package org.museframework.bian.cardclearing.dto;

public class RetrieveReconciliationResponse {
    private org.museframework.bian.cardclearing.dto.bq.Reconciliation reconciliation;

    public void setReconciliation(org.museframework.bian.cardclearing.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.cardclearing.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}