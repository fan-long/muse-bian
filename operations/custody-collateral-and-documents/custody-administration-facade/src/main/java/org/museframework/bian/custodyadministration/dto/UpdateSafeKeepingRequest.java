package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateSafeKeepingRequest {
    @MetaField
    private String custodyadministrationid;

    @MetaField
    private String safekeepingid;

    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setSafekeepingid(String safekeepingid) {
        this.safekeepingid = safekeepingid;
    }

    public String getSafekeepingid() {
        return safekeepingid;
    }

    public void setSafeKeeping(org.museframework.bian.custodyadministration.dto.bq.SafeKeeping safeKeeping) {
        this.safeKeeping = safeKeeping;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SafeKeeping getSafeKeeping() {
        return safeKeeping;
    }
}