package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestApplicationArchitectureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture applicationArchitecture;

    public void setApplicationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture applicationArchitecture) {
        this.applicationArchitecture = applicationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.ApplicationArchitecture getApplicationArchitecture() {
        return applicationArchitecture;
    }
}