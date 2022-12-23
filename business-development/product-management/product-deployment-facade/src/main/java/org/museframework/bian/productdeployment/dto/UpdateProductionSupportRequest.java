package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductionSupportRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String productionsupportid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setProductionsupportid(String productionsupportid) {
        this.productionsupportid = productionsupportid;
    }

    public String getProductionsupportid() {
        return productionsupportid;
    }

    public void setProductionSupport(org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport) {
        this.productionSupport = productionSupport;
    }

    public org.museframework.bian.productdeployment.dto.bq.ProductionSupport getProductionSupport() {
        return productionSupport;
    }
}