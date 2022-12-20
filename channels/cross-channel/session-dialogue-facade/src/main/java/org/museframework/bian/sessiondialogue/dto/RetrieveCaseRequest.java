package org.museframework.bian.sessiondialogue.dto;

public class RetrieveCaseRequest {
    private String sessiondialogueid;

    private String caseid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getCaseid() {
        return caseid;
    }
}