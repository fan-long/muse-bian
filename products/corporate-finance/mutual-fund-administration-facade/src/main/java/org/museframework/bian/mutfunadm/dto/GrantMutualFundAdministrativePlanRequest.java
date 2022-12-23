package org.museframework.bian.mutfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantMutualFundAdministrativePlanRequest {
    @MetaField
    private String mutualfundadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan mutualFundAdministrativePlan;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setMutualFundAdministrativePlan(org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan mutualFundAdministrativePlan) {
        this.mutualFundAdministrativePlan = mutualFundAdministrativePlan;
    }

    public org.museframework.bian.mutfunadm.dto.cr.MutualFundAdministrativePlan getMutualFundAdministrativePlan() {
        return mutualFundAdministrativePlan;
    }
}