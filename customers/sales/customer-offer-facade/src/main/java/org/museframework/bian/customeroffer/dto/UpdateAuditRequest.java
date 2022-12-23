package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAuditRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String auditid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Audit audit;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setAuditid(String auditid) {
        this.auditid = auditid;
    }

    public String getAuditid() {
        return auditid;
    }

    public void setAudit(org.museframework.bian.customeroffer.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Audit getAudit() {
        return audit;
    }
}