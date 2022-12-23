package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProductionRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String productionid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.Production production;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.productdeployment.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdeployment.dto.bq.Production getProduction() {
        return production;
    }
}