package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSystemsRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String systemsid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.Systems systems;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setSystemsid(String systemsid) {
        this.systemsid = systemsid;
    }

    public String getSystemsid() {
        return systemsid;
    }

    public void setSystems(org.museframework.bian.productdeployment.dto.bq.Systems systems) {
        this.systems = systems;
    }

    public org.museframework.bian.productdeployment.dto.bq.Systems getSystems() {
        return systems;
    }
}