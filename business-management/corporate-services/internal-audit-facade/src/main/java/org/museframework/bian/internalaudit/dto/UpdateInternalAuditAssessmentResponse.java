package org.museframework.bian.internalaudit.dto;

public class UpdateInternalAuditAssessmentResponse {
    private org.museframework.bian.internalaudit.dto.cr.InternalAuditAssessment internalAuditAssessment;

    public void setInternalAuditAssessment(org.museframework.bian.internalaudit.dto.cr.InternalAuditAssessment internalAuditAssessment) {
        this.internalAuditAssessment = internalAuditAssessment;
    }

    public org.museframework.bian.internalaudit.dto.cr.InternalAuditAssessment getInternalAuditAssessment() {
        return internalAuditAssessment;
    }
}