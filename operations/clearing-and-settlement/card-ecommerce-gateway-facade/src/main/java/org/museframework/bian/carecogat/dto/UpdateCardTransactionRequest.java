package org.museframework.bian.carecogat.dto;

public class UpdateCardTransactionRequest {
    private String cardecommercegatewayid;

    private String cardtransactionid;

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