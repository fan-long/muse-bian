package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePartyAuthenticationAssessmentRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField(ref=true)
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