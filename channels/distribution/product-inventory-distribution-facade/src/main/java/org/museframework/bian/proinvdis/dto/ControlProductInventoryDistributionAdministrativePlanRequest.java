package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlProductInventoryDistributionAdministrativePlanRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan productInventoryDistributionAdministrativePlan;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setProductInventoryDistributionAdministrativePlan(org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan productInventoryDistributionAdministrativePlan) {
        this.productInventoryDistributionAdministrativePlan = productInventoryDistributionAdministrativePlan;
    }

    public org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan getProductInventoryDistributionAdministrativePlan() {
        return productInventoryDistributionAdministrativePlan;
    }
}