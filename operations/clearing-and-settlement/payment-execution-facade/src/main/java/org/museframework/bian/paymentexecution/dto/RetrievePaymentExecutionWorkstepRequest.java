package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaymentExecutionWorkstepRequest {
    @MetaField
    private String paymentexecutionid;

    @MetaField
    private String paymentexecutionworkstepid;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }

    public void setPaymentexecutionworkstepid(String paymentexecutionworkstepid) {
        this.paymentexecutionworkstepid = paymentexecutionworkstepid;
    }

    public String getPaymentexecutionworkstepid() {
        return paymentexecutionworkstepid;
    }
}