package org.museframework.bian.customeroffer.dto;

public class UpdateAuditResponse {
    private org.museframework.bian.customeroffer.dto.bq.Audit audit;

    public void setAudit(org.museframework.bian.customeroffer.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Audit getAudit() {
        return audit;
    }
}