package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyOutboundTransactionFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String outboundtransactionfunctionid;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setOutboundtransactionfunctionid(String outboundtransactionfunctionid) {
        this.outboundtransactionfunctionid = outboundtransactionfunctionid;
    }

    public String getOutboundtransactionfunctionid() {
        return outboundtransactionfunctionid;
    }
}