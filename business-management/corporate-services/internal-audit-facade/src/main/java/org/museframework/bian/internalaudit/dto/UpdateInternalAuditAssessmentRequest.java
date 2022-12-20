package org.museframework.bian.internalaudit.dto;

public class UpdateInternalAuditAssessmentRequest {
    private String internalauditid;

    private org.museframework.bian.internalaudit.dto.cr.InternalAuditAssessment internalAuditAssessment;

    public void setInternalauditid(String internalauditid) {
        this.internalauditid = internalauditid;
    }

    public String getInternalauditid() {
        return internalauditid;
    }

    public void setInternalAuditAssessment(org.museframework.bian.internalaudit.dto.cr.InternalAuditAssessment internalAuditAssessment) {
        this.internalAuditAssessment = internalAuditAssessment;
    }

    public org.museframework.bian.internalaudit.dto.cr.InternalAuditAssessment getInternalAuditAssessment() {
        return internalAuditAssessment;
    }
}