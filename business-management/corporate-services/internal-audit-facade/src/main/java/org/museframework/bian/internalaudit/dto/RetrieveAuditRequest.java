package org.museframework.bian.internalaudit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAuditRequest {
    @MetaField
    private String internalauditid;

    @MetaField
    private String auditid;

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
}