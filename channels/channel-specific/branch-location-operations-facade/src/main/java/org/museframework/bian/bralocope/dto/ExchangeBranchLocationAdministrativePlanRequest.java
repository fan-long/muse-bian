package org.museframework.bian.bralocope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeBranchLocationAdministrativePlanRequest {
    @MetaField
    private String branchlocationoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan branchLocationAdministrativePlan;

    public void setBranchlocationoperationsid(String branchlocationoperationsid) {
        this.branchlocationoperationsid = branchlocationoperationsid;
    }

    public String getBranchlocationoperationsid() {
        return branchlocationoperationsid;
    }

    public void setBranchLocationAdministrativePlan(org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan branchLocationAdministrativePlan) {
        this.branchLocationAdministrativePlan = branchLocationAdministrativePlan;
    }

    public org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan getBranchLocationAdministrativePlan() {
        return branchLocationAdministrativePlan;
    }
}