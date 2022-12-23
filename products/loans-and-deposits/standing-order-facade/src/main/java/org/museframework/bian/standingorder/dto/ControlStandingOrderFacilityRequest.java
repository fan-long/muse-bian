package org.museframework.bian.standingorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlStandingOrderFacilityRequest {
    @MetaField
    private String standingorderid;

    @MetaField(ref=true)
    private org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility;

    public void setStandingorderid(String standingorderid) {
        this.standingorderid = standingorderid;
    }

    public String getStandingorderid() {
        return standingorderid;
    }

    public void setStandingOrderFacility(org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility) {
        this.standingOrderFacility = standingOrderFacility;
    }

    public org.museframework.bian.standingorder.dto.cr.StandingOrderFacility getStandingOrderFacility() {
        return standingOrderFacility;
    }
}