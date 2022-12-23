package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyInboundTransactionFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String inboundtransactionfunctionid;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setInboundtransactionfunctionid(String inboundtransactionfunctionid) {
        this.inboundtransactionfunctionid = inboundtransactionfunctionid;
    }

    public String getInboundtransactionfunctionid() {
        return inboundtransactionfunctionid;
    }
}