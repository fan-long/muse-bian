package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSystemsRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String systemsid;

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
}