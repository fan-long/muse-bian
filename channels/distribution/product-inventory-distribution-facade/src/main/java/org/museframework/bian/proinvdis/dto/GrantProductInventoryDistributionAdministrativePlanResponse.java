package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class GrantProductInventoryDistributionAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan productInventoryDistributionAdministrativePlan;

    public void setProductInventoryDistributionAdministrativePlan(org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan productInventoryDistributionAdministrativePlan) {
        this.productInventoryDistributionAdministrativePlan = productInventoryDistributionAdministrativePlan;
    }

    public org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan getProductInventoryDistributionAdministrativePlan() {
        return productInventoryDistributionAdministrativePlan;
    }
}