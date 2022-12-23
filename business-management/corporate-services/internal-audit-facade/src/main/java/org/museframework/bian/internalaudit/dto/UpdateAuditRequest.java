package org.museframework.bian.internalaudit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAuditRequest {
    @MetaField
    private String internalauditid;

    @MetaField
    private String auditid;

    @MetaField(ref=true)
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