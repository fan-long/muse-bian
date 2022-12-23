package org.museframework.bian.intpropor.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateIntellectualPropertyAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.intpropor.dto.cr.IntellectualPropertyAdministrativePlan intellectualPropertyAdministrativePlan;

    public void setIntellectualPropertyAdministrativePlan(org.museframework.bian.intpropor.dto.cr.IntellectualPropertyAdministrativePlan intellectualPropertyAdministrativePlan) {
        this.intellectualPropertyAdministrativePlan = intellectualPropertyAdministrativePlan;
    }

    public org.museframework.bian.intpropor.dto.cr.IntellectualPropertyAdministrativePlan getIntellectualPropertyAdministrativePlan() {
        return intellectualPropertyAdministrativePlan;
    }
}