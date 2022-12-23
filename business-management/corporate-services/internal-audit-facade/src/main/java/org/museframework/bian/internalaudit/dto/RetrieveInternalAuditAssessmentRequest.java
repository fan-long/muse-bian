package org.museframework.bian.internalaudit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInternalAuditAssessmentRequest {
    @MetaField
    private String internalauditid;

    public void setInternalauditid(String internalauditid) {
        this.internalauditid = internalauditid;
    }

    public String getInternalauditid() {
        return internalauditid;
    }
}