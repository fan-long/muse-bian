package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAuditRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String auditid;

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
}