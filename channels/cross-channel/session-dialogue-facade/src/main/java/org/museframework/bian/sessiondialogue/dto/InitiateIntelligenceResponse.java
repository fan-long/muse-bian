package org.museframework.bian.sessiondialogue.dto;

public class InitiateIntelligenceResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Intelligence intelligence;

    public void setIntelligence(org.museframework.bian.sessiondialogue.dto.bq.Intelligence intelligence) {
        this.intelligence = intelligence;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Intelligence getIntelligence() {
        return intelligence;
    }
}