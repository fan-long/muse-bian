package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveHROperationsRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String hroperationsid;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setHroperationsid(String hroperationsid) {
        this.hroperationsid = hroperationsid;
    }

    public String getHroperationsid() {
        return hroperationsid;
    }
}