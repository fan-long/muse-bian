package org.museframework.bian.internalaudit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAuditResponse {
    @MetaField(ref=true)
    private org.museframework.bian.internalaudit.dto.bq.Audit audit;

    public void setAudit(org.museframework.bian.internalaudit.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.internalaudit.dto.bq.Audit getAudit() {
        return audit;
    }
}