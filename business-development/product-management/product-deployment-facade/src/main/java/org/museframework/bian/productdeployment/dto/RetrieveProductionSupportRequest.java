package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductionSupportRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String productionsupportid;

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
}