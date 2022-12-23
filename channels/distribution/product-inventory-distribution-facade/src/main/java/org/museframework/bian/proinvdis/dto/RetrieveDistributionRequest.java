package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDistributionRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String distributionid;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setDistributionid(String distributionid) {
        this.distributionid = distributionid;
    }

    public String getDistributionid() {
        return distributionid;
    }
}