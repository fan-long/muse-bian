package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestUnitTrustAdministrativePlanRequest {
    @MetaField
    private String unittrustadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan unitTrustAdministrativePlan;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setUnitTrustAdministrativePlan(org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan unitTrustAdministrativePlan) {
        this.unitTrustAdministrativePlan = unitTrustAdministrativePlan;
    }

    public org.museframework.bian.unitruadm.dto.cr.UnitTrustAdministrativePlan getUnitTrustAdministrativePlan() {
        return unitTrustAdministrativePlan;
    }
}