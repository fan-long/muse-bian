package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlCorporateLeaseFacilityRequest {
    @MetaField
    private String corporateleaseid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility;

    public void setCorporateleaseid(String corporateleaseid) {
        this.corporateleaseid = corporateleaseid;
    }

    public String getCorporateleaseid() {
        return corporateleaseid;
    }

    public void setCorporateLeaseFacility(org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility) {
        this.corporateLeaseFacility = corporateLeaseFacility;
    }

    public org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility getCorporateLeaseFacility() {
        return corporateLeaseFacility;
    }
}