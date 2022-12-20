package org.museframework.bian.cardauthorization.dto;

public class UpdateAuthenticationRequest {
    private String cardauthorizationid;

    private String authenticationid;

    private org.museframework.bian.cardauthorization.dto.bq.Authentication authentication;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setAuthenticationid(String authenticationid) {
        this.authenticationid = authenticationid;
    }

    public String getAuthenticationid() {
        return authenticationid;
    }

    public void setAuthentication(org.museframework.bian.cardauthorization.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.cardauthorization.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}