package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCardTransactionRequest {
    @MetaField
    private String cardecommercegatewayid;

    @MetaField
    private String cardtransactionid;

    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.CardTransaction cardTransaction;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setCardtransactionid(String cardtransactionid) {
        this.cardtransactionid = cardtransactionid;
    }

    public String getCardtransactionid() {
        return cardtransactionid;
    }

    public void setCardTransaction(org.museframework.bian.carecogat.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.carecogat.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}