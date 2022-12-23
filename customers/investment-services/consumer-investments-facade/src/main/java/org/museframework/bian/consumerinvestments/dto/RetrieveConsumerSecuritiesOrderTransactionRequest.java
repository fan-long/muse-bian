package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveConsumerSecuritiesOrderTransactionRequest {
    @MetaField
    private String consumerinvestmentsid;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }
}