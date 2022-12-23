package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveHedgeFundAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan hedgeFundAdministrativePlan;

    public void setHedgeFundAdministrativePlan(org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan hedgeFundAdministrativePlan) {
        this.hedgeFundAdministrativePlan = hedgeFundAdministrativePlan;
    }

    public org.museframework.bian.hedfunadm.dto.cr.HedgeFundAdministrativePlan getHedgeFundAdministrativePlan() {
        return hedgeFundAdministrativePlan;
    }
}