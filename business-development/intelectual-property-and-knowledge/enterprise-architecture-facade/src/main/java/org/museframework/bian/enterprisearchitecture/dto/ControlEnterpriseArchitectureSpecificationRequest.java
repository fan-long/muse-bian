package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlEnterpriseArchitectureSpecificationRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification enterpriseArchitectureSpecification;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setEnterpriseArchitectureSpecification(org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification enterpriseArchitectureSpecification) {
        this.enterpriseArchitectureSpecification = enterpriseArchitectureSpecification;
    }

    public org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification getEnterpriseArchitectureSpecification() {
        return enterpriseArchitectureSpecification;
    }
}