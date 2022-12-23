package org.museframework.bian.bralocope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBranchLocationAdministrativePlanRequest {
    @MetaField
    private String branchlocationoperationsid;

    public void setBranchlocationoperationsid(String branchlocationoperationsid) {
        this.branchlocationoperationsid = branchlocationoperationsid;
    }

    public String getBranchlocationoperationsid() {
        return branchlocationoperationsid;
    }
}