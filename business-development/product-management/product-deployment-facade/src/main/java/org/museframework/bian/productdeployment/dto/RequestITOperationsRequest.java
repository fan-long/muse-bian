package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestITOperationsRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String itoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations;

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

    public void setiTOperations(org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations) {
        this.iTOperations = iTOperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.ITOperations getiTOperations() {
        return iTOperations;
    }
}