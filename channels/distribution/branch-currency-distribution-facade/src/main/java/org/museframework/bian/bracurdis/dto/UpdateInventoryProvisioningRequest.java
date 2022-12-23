package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInventoryProvisioningRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String inventoryprovisioningid;

    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setInventoryprovisioningid(String inventoryprovisioningid) {
        this.inventoryprovisioningid = inventoryprovisioningid;
    }

    public String getInventoryprovisioningid() {
        return inventoryprovisioningid;
    }

    public void setInventoryProvisioning(org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning) {
        this.inventoryProvisioning = inventoryProvisioning;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning getInventoryProvisioning() {
        return inventoryProvisioning;
    }
}