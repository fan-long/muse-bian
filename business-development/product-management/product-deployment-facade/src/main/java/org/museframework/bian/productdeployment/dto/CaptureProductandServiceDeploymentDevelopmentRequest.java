package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureProductandServiceDeploymentDevelopmentRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.cr.ProductandServiceDeploymentDevelopment productandServiceDeploymentDevelopment;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setProductandServiceDeploymentDevelopment(org.museframework.bian.productdeployment.dto.cr.ProductandServiceDeploymentDevelopment productandServiceDeploymentDevelopment) {
        this.productandServiceDeploymentDevelopment = productandServiceDeploymentDevelopment;
    }

    public org.museframework.bian.productdeployment.dto.cr.ProductandServiceDeploymentDevelopment getProductandServiceDeploymentDevelopment() {
        return productandServiceDeploymentDevelopment;
    }
}