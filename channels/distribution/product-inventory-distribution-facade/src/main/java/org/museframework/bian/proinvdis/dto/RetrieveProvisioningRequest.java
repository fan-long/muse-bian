package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProvisioningRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String provisioningid;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setProvisioningid(String provisioningid) {
        this.provisioningid = provisioningid;
    }

    public String getProvisioningid() {
        return provisioningid;
    }
}