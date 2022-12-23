package org.museframework.bian.bracurman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureInventoryAllocationRequest {
    @MetaField
    private String branchcurrencymanagementid;

    @MetaField
    private String inventoryallocationid;

    @MetaField(ref=true)
    private org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation;

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

    public void setInventoryAllocation(org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation) {
        this.inventoryAllocation = inventoryAllocation;
    }

    public org.museframework.bian.bracurman.dto.bq.InventoryAllocation getInventoryAllocation() {
        return inventoryAllocation;
    }
}