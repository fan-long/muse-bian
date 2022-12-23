package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaymentExecutionProcedureRequest {
    @MetaField
    private String paymentexecutionid;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }
}