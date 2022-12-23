package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDistributionRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String distributionid;

    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Distribution distribution;

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

    public void setDistribution(org.museframework.bian.proinvdis.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.proinvdis.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}