package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveHROperationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.HROperations hROperations;

    public void sethROperations(org.museframework.bian.productdeployment.dto.bq.HROperations hROperations) {
        this.hROperations = hROperations;
    }

    public org.museframework.bian.productdeployment.dto.bq.HROperations gethROperations() {
        return hROperations;
    }
}