package org.museframework.bian.partyauthentication.dto;

public class RequestPartyAuthenticationAssessmentResponse {
    private org.museframework.bian.partyauthentication.dto.cr.PartyAuthenticationAssessment partyAuthenticationAssessment;

    public void setPartyAuthenticationAssessment(org.museframework.bian.partyauthentication.dto.cr.PartyAuthenticationAssessment partyAuthenticationAssessment) {
        this.partyAuthenticationAssessment = partyAuthenticationAssessment;
    }

    public org.museframework.bian.partyauthentication.dto.cr.PartyAuthenticationAssessment getPartyAuthenticationAssessment() {
        return partyAuthenticationAssessment;
    }
}