package org.museframework.bian.sessiondialogue.dto;

public class UpdateAuthenticationRequest {
    private String sessiondialogueid;

    private String authenticationid;

    private org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setAuthenticationid(String authenticationid) {
        this.authenticationid = authenticationid;
    }

    public String getAuthenticationid() {
        return authenticationid;
    }

    public void setAuthentication(org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}