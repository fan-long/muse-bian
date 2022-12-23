package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaymentMechanismRequest {
    @MetaField
    private String paymentexecutionid;

    @MetaField
    private String paymentmechanismid;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }

    public void setPaymentmechanismid(String paymentmechanismid) {
        this.paymentmechanismid = paymentmechanismid;
    }

    public String getPaymentmechanismid() {
        return paymentmechanismid;
    }
}