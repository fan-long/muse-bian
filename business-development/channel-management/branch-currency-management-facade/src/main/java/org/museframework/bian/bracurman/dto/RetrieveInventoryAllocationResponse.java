package org.museframework.bian.bracurman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInventoryAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation;

    public void setInventoryAllocation(org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation) {
        this.inventoryAllocation = inventoryAllocation;
    }

    public org.museframework.bian.bracurman.dto.bq.InventoryAllocation getInventoryAllocation() {
        return inventoryAllocation;
    }
}