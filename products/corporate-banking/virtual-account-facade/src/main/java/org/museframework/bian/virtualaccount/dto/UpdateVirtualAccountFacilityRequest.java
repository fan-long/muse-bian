package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateVirtualAccountFacilityRequest {
    @MetaField
    private String virtualaccountid;

    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility virtualAccountFacility;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setVirtualAccountFacility(org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility virtualAccountFacility) {
        this.virtualAccountFacility = virtualAccountFacility;
    }

    public org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility getVirtualAccountFacility() {
        return virtualAccountFacility;
    }
}