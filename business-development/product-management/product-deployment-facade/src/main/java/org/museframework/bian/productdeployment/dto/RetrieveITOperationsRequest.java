package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveITOperationsRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String itoperationsid;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setItoperationsid(String itoperationsid) {
        this.itoperationsid = itoperationsid;
    }

    public String getItoperationsid() {
        return itoperationsid;
    }
}