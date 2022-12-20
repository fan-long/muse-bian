package org.museframework.bian.contacthandler.dto;

public class RetrieveAuthenticationResponse {
    private org.museframework.bian.contacthandler.dto.bq.Authentication authentication;

    public void setAuthentication(org.museframework.bian.contacthandler.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.contacthandler.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}