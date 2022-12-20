package org.museframework.bian.internalaudit.dto;

public class UpdateAuditRequest {
    private String internalauditid;

    private String auditid;

    private org.museframework.bian.internalaudit.dto.bq.Audit audit;

    public void setInternalauditid(String internalauditid) {
        this.internalauditid = internalauditid;
    }

    public String getInternalauditid() {
        return internalauditid;
    }

    public void setAuditid(String auditid) {
        this.auditid = auditid;
    }

    public String getAuditid() {
        return auditid;
    }

    public void setAudit(org.museframework.bian.internalaudit.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.internalaudit.dto.bq.Audit getAudit() {
        return audit;
    }
}