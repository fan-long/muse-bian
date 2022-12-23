package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeLeasingFacilityRequest {
    @MetaField
    private String leasingid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setLeasingFacility(org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility) {
        this.leasingFacility = leasingFacility;
    }

    public org.museframework.bian.leasing.dto.cr.LeasingFacility getLeasingFacility() {
        return leasingFacility;
    }
}