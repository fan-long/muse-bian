package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateUnitTrustAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan unitTrustAdministrativePlan;

    public void setUnitTrustAdministrativePlan(org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan unitTrustAdministrativePlan) {
        this.unitTrustAdministrativePlan = unitTrustAdministrativePlan;
    }

    public org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan getUnitTrustAdministrativePlan() {
        return unitTrustAdministrativePlan;
    }
}