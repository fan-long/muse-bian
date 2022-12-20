package org.museframework.bian.carecogat.dto;

public class InitiateCardAuthenticationRequest {
    private String cardecommercegatewayid;

    private String cardauthenticationid;

    private org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication;

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

    public void setCardAuthentication(org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication) {
        this.cardAuthentication = cardAuthentication;
    }

    public org.museframework.bian.carecogat.dto.bq.CardAuthentication getCardAuthentication() {
        return cardAuthentication;
    }
}