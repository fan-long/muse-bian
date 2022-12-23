package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCorporateLeaseFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility;

    public void setCorporateLeaseFacility(org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility) {
        this.corporateLeaseFacility = corporateLeaseFacility;
    }

    public org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility getCorporateLeaseFacility() {
        return corporateLeaseFacility;
    }
}