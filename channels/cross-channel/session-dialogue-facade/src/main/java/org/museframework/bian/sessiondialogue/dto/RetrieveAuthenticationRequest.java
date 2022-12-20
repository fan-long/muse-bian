package org.museframework.bian.sessiondialogue.dto;

public class RetrieveAuthenticationRequest {
    private String sessiondialogueid;

    private String authenticationid;

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
}