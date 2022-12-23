package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerProcessingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marketorder.dto.bq.CustomerProcessing customerProcessing;

    public void setCustomerProcessing(org.museframework.bian.marketorder.dto.bq.CustomerProcessing customerProcessing) {
        this.customerProcessing = customerProcessing;
    }

    public org.museframework.bian.marketorder.dto.bq.CustomerProcessing getCustomerProcessing() {
        return customerProcessing;
    }
}