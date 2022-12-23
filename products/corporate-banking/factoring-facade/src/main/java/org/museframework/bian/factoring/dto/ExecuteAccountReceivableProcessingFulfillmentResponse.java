package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteAccountReceivableProcessingFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment accountReceivableProcessingFulfillment;

    public void setAccountReceivableProcessingFulfillment(org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment accountReceivableProcessingFulfillment) {
        this.accountReceivableProcessingFulfillment = accountReceivableProcessingFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountReceivableProcessingFulfillment getAccountReceivableProcessingFulfillment() {
        return accountReceivableProcessingFulfillment;
    }
}