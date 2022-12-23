package org.museframework.bian.prosalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlProductSalesSupportAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.prosalsup.dto.cr.ProductSalesSupportAdministrativePlan productSalesSupportAdministrativePlan;

    public void setProductSalesSupportAdministrativePlan(org.museframework.bian.prosalsup.dto.cr.ProductSalesSupportAdministrativePlan productSalesSupportAdministrativePlan) {
        this.productSalesSupportAdministrativePlan = productSalesSupportAdministrativePlan;
    }

    public org.museframework.bian.prosalsup.dto.cr.ProductSalesSupportAdministrativePlan getProductSalesSupportAdministrativePlan() {
        return productSalesSupportAdministrativePlan;
    }
}