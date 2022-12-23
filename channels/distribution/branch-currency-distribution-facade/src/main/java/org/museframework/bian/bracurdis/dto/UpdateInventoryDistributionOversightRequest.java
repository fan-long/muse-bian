package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInventoryDistributionOversightRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String inventorydistributionoversightid;

    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight inventoryDistributionOversight;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setInventorydistributionoversightid(String inventorydistributionoversightid) {
        this.inventorydistributionoversightid = inventorydistributionoversightid;
    }

    public String getInventorydistributionoversightid() {
        return inventorydistributionoversightid;
    }

    public void setInventoryDistributionOversight(org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight inventoryDistributionOversight) {
        this.inventoryDistributionOversight = inventoryDistributionOversight;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight getInventoryDistributionOversight() {
        return inventoryDistributionOversight;
    }
}