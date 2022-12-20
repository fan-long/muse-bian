package org.museframework.bian.sessiondialogue.dto;

public class RetrieveIntelligenceRequest {
    private String sessiondialogueid;

    private String intelligenceid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setIntelligenceid(String intelligenceid) {
        this.intelligenceid = intelligenceid;
    }

    public String getIntelligenceid() {
        return intelligenceid;
    }
}