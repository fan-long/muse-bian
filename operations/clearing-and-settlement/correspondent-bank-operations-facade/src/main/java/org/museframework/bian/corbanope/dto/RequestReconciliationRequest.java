package org.museframework.bian.corbanope.dto;

public class RequestReconciliationRequest {
    private String correspondentbankoperationsid;

    private String reconciliationid;

    private org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setReconciliationid(String reconciliationid) {
        this.reconciliationid = reconciliationid;
    }

    public String getReconciliationid() {
        return reconciliationid;
    }

    public void setReconciliation(org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.corbanope.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}