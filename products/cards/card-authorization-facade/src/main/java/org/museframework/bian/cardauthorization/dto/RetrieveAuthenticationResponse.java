package org.museframework.bian.cardauthorization.dto;

public class RetrieveAuthenticationResponse {
    private org.museframework.bian.cardauthorization.dto.bq.Authentication authentication;

    public void setAuthentication(org.museframework.bian.cardauthorization.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.cardauthorization.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}