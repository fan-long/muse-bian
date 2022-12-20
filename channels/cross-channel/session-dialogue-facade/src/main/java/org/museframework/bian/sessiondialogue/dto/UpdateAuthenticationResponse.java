package org.museframework.bian.sessiondialogue.dto;

public class UpdateAuthenticationResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication;

    public void setAuthentication(org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}