package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteInboundTransactionFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String inboundtransactionfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction;

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

    public void setInboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction) {
        this.inboundTransactionFunction = inboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction getInboundTransactionFunction() {
        return inboundTransactionFunction;
    }
}