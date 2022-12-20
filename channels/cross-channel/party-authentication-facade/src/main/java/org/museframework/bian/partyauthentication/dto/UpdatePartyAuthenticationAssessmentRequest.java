package org.museframework.bian.partyauthentication.dto;

public class UpdatePartyAuthenticationAssessmentRequest {
    private String partyauthenticationid;

    private org.museframework.bian.partyauthentication.dto.cr.PartyAuthenticationAssessment partyAuthenticationAssessment;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setPartyAuthenticationAssessment(org.museframework.bian.partyauthentication.dto.cr.PartyAuthenticationAssessment partyAuthenticationAssessment) {
        this.partyAuthenticationAssessment = partyAuthenticationAssessment;
    }

    public org.museframework.bian.partyauthentication.dto.cr.PartyAuthenticationAssessment getPartyAuthenticationAssessment() {
        return partyAuthenticationAssessment;
    }
}