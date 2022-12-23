package org.museframework.bian.paymentorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveExecutionInitiationRequest {
    @MetaField
    private String paymentorderid;

    @MetaField
    private String executioninitiationid;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }

    public void setExecutioninitiationid(String executioninitiationid) {
        this.executioninitiationid = executioninitiationid;
    }

    public String getExecutioninitiationid() {
        return executioninitiationid;
    }
}