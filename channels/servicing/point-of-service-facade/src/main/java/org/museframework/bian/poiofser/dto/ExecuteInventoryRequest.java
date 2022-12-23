package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteInventoryRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String inventoryid;

    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Inventory inventory;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid;
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventory(org.museframework.bian.poiofser.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.poiofser.dto.bq.Inventory getInventory() {
        return inventory;
    }
}