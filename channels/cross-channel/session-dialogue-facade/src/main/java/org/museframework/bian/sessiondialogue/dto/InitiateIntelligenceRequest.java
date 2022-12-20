package org.museframework.bian.sessiondialogue.dto;

public class InitiateIntelligenceRequest {
    private String sessiondialogueid;

    private String intelligenceid;

    private org.museframework.bian.sessiondialogue.dto.bq.Intelligence intelligence;

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

    public void setIntelligence(org.museframework.bian.sessiondialogue.dto.bq.Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Intelligence getIntelligence() {
        return intelligence;
    }
}