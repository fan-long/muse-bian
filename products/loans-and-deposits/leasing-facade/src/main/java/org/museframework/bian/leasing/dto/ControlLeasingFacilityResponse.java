package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlLeasingFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility;

    public void setLeasingFacility(org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility) {
        this.leasingFacility = leasingFacility;
    }

    public org.museframework.bian.leasing.dto.cr.LeasingFacility getLeasingFacility() {
        return leasingFacility;
    }
}