package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class GrantMutualFundAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan mutualFundAdministrativePlan;

    public void setMutualFundAdministrativePlan(org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan mutualFundAdministrativePlan) {
        this.mutualFundAdministrativePlan = mutualFundAdministrativePlan;
    }

    public org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan getMutualFundAdministrativePlan() {
        return mutualFundAdministrativePlan;
    }
}