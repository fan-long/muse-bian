package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionBatchRequest {
    @MetaField
    private String cardecommercegatewayid;

    @MetaField
    private String transactionbatchid;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setTransactionbatchid(String transactionbatchid) {
        this.transactionbatchid = transactionbatchid;
    }

    public String getTransactionbatchid() {
        return transactionbatchid;
    }
}