package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveEnterpriseArchitectureSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification enterpriseArchitectureSpecification;

    public void setEnterpriseArchitectureSpecification(org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification enterpriseArchitectureSpecification) {
        this.enterpriseArchitectureSpecification = enterpriseArchitectureSpecification;
    }

    public org.museframework.bian.enterprisearchitecture.dto.cr.EnterpriseArchitectureSpecification getEnterpriseArchitectureSpecification() {
        return enterpriseArchitectureSpecification;
    }
}