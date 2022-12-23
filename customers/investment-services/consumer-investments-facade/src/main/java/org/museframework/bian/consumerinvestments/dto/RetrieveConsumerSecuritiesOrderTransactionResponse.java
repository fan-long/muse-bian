package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveConsumerSecuritiesOrderTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction;

    public void setConsumerSecuritiesOrderTransaction(org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction) {
        this.consumerSecuritiesOrderTransaction = consumerSecuritiesOrderTransaction;
    }

    public org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction getConsumerSecuritiesOrderTransaction() {
        return consumerSecuritiesOrderTransaction;
    }
}