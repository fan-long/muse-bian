package org.museframework.bian.parlifman.dto;

public class RetrieveAuthenticationResponse {
    private org.museframework.bian.parlifman.dto.bq.Authentication authentication;

    public void setAuthentication(org.museframework.bian.parlifman.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.parlifman.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}