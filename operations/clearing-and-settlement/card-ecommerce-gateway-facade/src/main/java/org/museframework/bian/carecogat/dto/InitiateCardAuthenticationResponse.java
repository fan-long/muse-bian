package org.museframework.bian.carecogat.dto;

public class InitiateCardAuthenticationResponse {
    private org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication;

    public void setCardAuthentication(org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication) {
        this.cardAuthentication = cardAuthentication;
    }

    public org.museframework.bian.carecogat.dto.bq.CardAuthentication getCardAuthentication() {
        return cardAuthentication;
    }
}