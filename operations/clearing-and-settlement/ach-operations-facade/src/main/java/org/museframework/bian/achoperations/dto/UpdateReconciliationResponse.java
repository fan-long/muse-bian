package org.museframework.bian.achoperations.dto;

public class UpdateReconciliationResponse {
    private org.museframework.bian.achoperations.dto.bq.Reconciliation reconciliation;

    public void setReconciliation(org.museframework.bian.achoperations.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.achoperations.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}