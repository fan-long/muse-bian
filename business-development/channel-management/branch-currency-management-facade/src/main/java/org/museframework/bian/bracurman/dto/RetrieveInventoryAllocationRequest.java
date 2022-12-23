package org.museframework.bian.bracurman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInventoryAllocationRequest {
    @MetaField
    private String branchcurrencymanagementid;

    @MetaField
    private String inventoryallocationid;

    public void setBranchcurrencymanagementid(String branchcurrencymanagementid) {
        this.branchcurrencymanagementid = branchcurrencymanagementid;
    }

    public String getBranchcurrencymanagementid() {
        return branchcurrencymanagementid;
    }

    public void setInventoryallocationid(String inventoryallocationid) {
        this.inventoryallocationid = inventoryallocationid;
    }

    public String getInventoryallocationid() {
        return inventoryallocationid;
    }
}