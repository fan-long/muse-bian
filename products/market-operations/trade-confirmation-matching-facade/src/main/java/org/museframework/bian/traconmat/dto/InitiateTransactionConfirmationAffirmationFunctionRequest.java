package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTransactionConfirmationAffirmationFunctionRequest {
    @MetaField
    private String tradeconfirmationmatchingid;

    @MetaField
    private String transactionconfirmationaffirmationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction transactionConfirmationAffirmationFunction;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setTransactionconfirmationaffirmationfunctionid(String transactionconfirmationaffirmationfunctionid) {
        this.transactionconfirmationaffirmationfunctionid = transactionconfirmationaffirmationfunctionid;
    }

    public String getTransactionconfirmationaffirmationfunctionid() {
        return transactionconfirmationaffirmationfunctionid;
    }

    public void setTransactionConfirmationAffirmationFunction(org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction transactionConfirmationAffirmationFunction) {
        this.transactionConfirmationAffirmationFunction = transactionConfirmationAffirmationFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction getTransactionConfirmationAffirmationFunction() {
        return transactionConfirmationAffirmationFunction;
    }
}