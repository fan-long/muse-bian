package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveNetworkOperationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation;

    public void setNetworkOperation(org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation) {
        this.networkOperation = networkOperation;
    }

    public org.museframework.bian.atmnetope.dto.bq.NetworkOperation getNetworkOperation() {
        return networkOperation;
    }
}