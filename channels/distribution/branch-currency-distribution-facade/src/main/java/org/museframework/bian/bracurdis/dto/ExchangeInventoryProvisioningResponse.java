package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeInventoryProvisioningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning;

    public void setInventoryProvisioning(org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning) {
        this.inventoryProvisioning = inventoryProvisioning;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning getInventoryProvisioning() {
        return inventoryProvisioning;
    }
}