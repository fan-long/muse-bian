package org.museframework.bian.achoperations.dto;

public class InitiateReconciliationRequest {
    private String achoperationsid;

    private String reconciliationid;

    private org.museframework.bian.achoperations.dto.bq.Reconciliation reconciliation;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setReconciliationid(String reconciliationid) {
        this.reconciliationid = reconciliationid;
    }

    public String getReconciliationid() {
        return reconciliationid;
    }

    public void setReconciliation(org.museframework.bian.achoperations.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.achoperations.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}