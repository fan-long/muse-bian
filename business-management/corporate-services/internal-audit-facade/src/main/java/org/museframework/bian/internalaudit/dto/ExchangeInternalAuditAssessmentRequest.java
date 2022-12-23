package org.museframework.bian.internalaudit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeInternalAuditAssessmentRequest {
    @MetaField
    private String internalauditid;

    @MetaField(ref=true)
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