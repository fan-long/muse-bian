package org.museframework.bian.proexpsalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSalesSpecialistSupportAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan salesSpecialistSupportAdministrativePlan;

    public void setSalesSpecialistSupportAdministrativePlan(org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan salesSpecialistSupportAdministrativePlan) {
        this.salesSpecialistSupportAdministrativePlan = salesSpecialistSupportAdministrativePlan;
    }

    public org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan getSalesSpecialistSupportAdministrativePlan() {
        return salesSpecialistSupportAdministrativePlan;
    }
}