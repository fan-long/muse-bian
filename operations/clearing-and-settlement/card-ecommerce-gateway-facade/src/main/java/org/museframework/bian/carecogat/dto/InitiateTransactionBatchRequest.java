package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTransactionBatchRequest {
    @MetaField
    private String cardecommercegatewayid;

    @MetaField
    private String transactionbatchid;

    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch;

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

    public void setTransactionBatch(org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch) {
        this.transactionBatch = transactionBatch;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionBatch getTransactionBatch() {
        return transactionBatch;
    }
}