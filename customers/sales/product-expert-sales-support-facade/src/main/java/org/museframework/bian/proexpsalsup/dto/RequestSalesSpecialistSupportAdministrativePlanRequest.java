package org.museframework.bian.proexpsalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSalesSpecialistSupportAdministrativePlanRequest {
    @MetaField
    private String productexpertsalessupportid;

    @MetaField(ref=true)
    private org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan salesSpecialistSupportAdministrativePlan;

    public void setProductexpertsalessupportid(String productexpertsalessupportid) {
        this.productexpertsalessupportid = productexpertsalessupportid;
    }

    public String getProductexpertsalessupportid() {
        return productexpertsalessupportid;
    }

    public void setSalesSpecialistSupportAdministrativePlan(org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan salesSpecialistSupportAdministrativePlan) {
        this.salesSpecialistSupportAdministrativePlan = salesSpecialistSupportAdministrativePlan;
    }

    public org.museframework.bian.proexpsalsup.dto.cr.SalesSpecialistSupportAdministrativePlan getSalesSpecialistSupportAdministrativePlan() {
        return salesSpecialistSupportAdministrativePlan;
    }
}