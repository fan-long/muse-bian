package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOrderInitiationRequest {
    @MetaField
    private String consumerinvestmentsid;

    @MetaField
    private String orderinitiationid;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setOrderinitiationid(String orderinitiationid) {
        this.orderinitiationid = orderinitiationid;
    }

    public String getOrderinitiationid() {
        return orderinitiationid;
    }
}