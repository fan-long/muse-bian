package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInventoryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.bq.Inventory inventory;

    public void setInventory(org.museframework.bian.systemsadministration.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Inventory getInventory() {
        return inventory;
    }
}