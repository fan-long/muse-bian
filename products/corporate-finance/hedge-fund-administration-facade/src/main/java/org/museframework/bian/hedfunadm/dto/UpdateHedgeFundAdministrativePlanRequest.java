package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateHedgeFundAdministrativePlanRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan hedgeFundAdministrativePlan;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setHedgeFundAdministrativePlan(org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan hedgeFundAdministrativePlan) {
        this.hedgeFundAdministrativePlan = hedgeFundAdministrativePlan;
    }

    public org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan getHedgeFundAdministrativePlan() {
        return hedgeFundAdministrativePlan;
    }
}