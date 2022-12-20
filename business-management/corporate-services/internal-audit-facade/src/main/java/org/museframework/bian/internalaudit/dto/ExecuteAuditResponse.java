package org.museframework.bian.internalaudit.dto;

public class ExecuteAuditResponse {
    private org.museframework.bian.internalaudit.dto.bq.Audit audit;

    public void setAudit(org.museframework.bian.internalaudit.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.internalaudit.dto.bq.Audit getAudit() {
        return audit;
    }
}