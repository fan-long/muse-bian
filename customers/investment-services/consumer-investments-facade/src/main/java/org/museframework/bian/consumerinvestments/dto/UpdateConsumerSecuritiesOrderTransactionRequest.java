package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateConsumerSecuritiesOrderTransactionRequest {
    @MetaField
    private String consumerinvestmentsid;

    @MetaField(ref=true)
    private org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setConsumerSecuritiesOrderTransaction(org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction consumerSecuritiesOrderTransaction) {
        this.consumerSecuritiesOrderTransaction = consumerSecuritiesOrderTransaction;
    }

    public org.museframework.bian.consumerinvestments.dto.cr.ConsumerSecuritiesOrderTransaction getConsumerSecuritiesOrderTransaction() {
        return consumerSecuritiesOrderTransaction;
    }
}