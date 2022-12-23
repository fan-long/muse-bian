package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestBusinessArchitectureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture;

    public void setBusinessArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture) {
        this.businessArchitecture = businessArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture getBusinessArchitecture() {
        return businessArchitecture;
    }
}