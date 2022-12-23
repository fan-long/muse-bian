package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeOutboundTransactionFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String outboundtransactionfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction;

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

    public void setOutboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction) {
        this.outboundTransactionFunction = outboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction getOutboundTransactionFunction() {
        return outboundTransactionFunction;
    }
}