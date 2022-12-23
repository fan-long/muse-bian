package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAuditResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Audit audit;

    public void setAudit(org.museframework.bian.customeroffer.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Audit getAudit() {
        return audit;
    }
}