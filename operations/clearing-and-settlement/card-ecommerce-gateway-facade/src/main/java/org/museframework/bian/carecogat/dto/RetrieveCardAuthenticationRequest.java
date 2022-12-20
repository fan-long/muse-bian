package org.museframework.bian.carecogat.dto;

public class RetrieveCardAuthenticationRequest {
    private String cardecommercegatewayid;

    private String cardauthenticationid;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setCardauthenticationid(String cardauthenticationid) {
        this.cardauthenticationid = cardauthenticationid;
    }

    public String getCardauthenticationid() {
        return cardauthenticationid;
    }
}