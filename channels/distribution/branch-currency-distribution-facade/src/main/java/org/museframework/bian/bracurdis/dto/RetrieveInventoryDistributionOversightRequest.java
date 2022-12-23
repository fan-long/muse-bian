package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInventoryDistributionOversightRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String inventorydistributionoversightid;

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
}