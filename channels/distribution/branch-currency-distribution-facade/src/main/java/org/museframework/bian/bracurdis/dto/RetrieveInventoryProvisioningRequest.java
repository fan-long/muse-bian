package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInventoryProvisioningRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String inventoryprovisioningid;

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
}