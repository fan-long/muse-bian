package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestHROperationsRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String hroperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.HROperations hROperations;

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

    public void sethROperations(org.museframework.bian.productdeployment.dto.bq.HROperations hROperations) {
        this.hROperations = hROperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.HROperations gethROperations() {
        return hROperations;
    }
}