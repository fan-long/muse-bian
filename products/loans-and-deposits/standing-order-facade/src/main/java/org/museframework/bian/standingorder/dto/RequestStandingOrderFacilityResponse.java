package org.museframework.bian.standingorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestStandingOrderFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility;

    public void setStandingOrderFacility(org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility) {
        this.standingOrderFacility = standingOrderFacility;
    }

    public org.museframework.bian.standingorder.dto.cr.StandingOrderFacility getStandingOrderFacility() {
        return standingOrderFacility;
    }
}