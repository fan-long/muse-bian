package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestITOperationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations;

    public void setiTOperations(org.museframework.bian.productdeployment.dto.bq.ITOperations iTOperations) {
        this.iTOperations = iTOperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.ITOperations getiTOperations() {
        return iTOperations;
    }
}