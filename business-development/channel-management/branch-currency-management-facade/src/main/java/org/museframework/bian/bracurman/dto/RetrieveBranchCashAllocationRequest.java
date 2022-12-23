package org.museframework.bian.bracurman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBranchCashAllocationRequest {
    @MetaField
    private String branchcurrencymanagementid;

    public void setBranchcurrencymanagementid(String branchcurrencymanagementid) {
        this.branchcurrencymanagementid = branchcurrencymanagementid;
    }

    public String getBranchcurrencymanagementid() {
        return branchcurrencymanagementid;
    }
}