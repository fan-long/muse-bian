package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateOperationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.Operations operations;

    public void setOperations(org.museframework.bian.productdirectory.dto.bq.Operations operations) {
        this.operations = operations;
    }

    public org.museframework.bian.productdirectory.dto.bq.Operations getOperations() {
        return operations;
    }
}