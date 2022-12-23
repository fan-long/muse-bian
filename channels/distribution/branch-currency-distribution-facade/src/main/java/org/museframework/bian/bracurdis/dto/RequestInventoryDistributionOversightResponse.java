package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInventoryDistributionOversightResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight inventoryDistributionOversight;

    public void setInventoryDistributionOversight(org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight inventoryDistributionOversight) {
        this.inventoryDistributionOversight = inventoryDistributionOversight;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight getInventoryDistributionOversight() {
        return inventoryDistributionOversight;
    }
}