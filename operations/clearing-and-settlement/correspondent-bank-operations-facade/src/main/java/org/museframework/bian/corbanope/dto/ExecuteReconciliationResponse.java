package org.museframework.bian.corbanope.dto;

public class ExecuteReconciliationResponse {
    private org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation;

    public void setReconciliation(org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.corbanope.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}