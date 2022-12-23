package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureProvisioningRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String provisioningid;

    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning;

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

    public void setProvisioning(org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning) {
        this.provisioning = provisioning;
    }

    public org.museframework.bian.proinvdis.dto.bq.Provisioning getProvisioning() {
        return provisioning;
    }
}