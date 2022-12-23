package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateServicingRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String servicingid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.Servicing servicing;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setServicingid(String servicingid) {
        this.servicingid = servicingid;
    }

    public String getServicingid() {
        return servicingid;
    }

    public void setServicing(org.museframework.bian.productdeployment.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdeployment.dto.bq.Servicing getServicing() {
        return servicing;
    }
}