package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInventoryRequest {
    @MetaField
    private String systemsadministrationid;

    @MetaField
    private String inventoryid;

    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.bq.Inventory inventory;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid;
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventory(org.museframework.bian.systemsadministration.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Inventory getInventory() {
        return inventory;
    }
}