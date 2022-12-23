package org.museframework.bian.cuscamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCandidateSelectionRequest {
    @MetaField
    private String customercampaignexecutionid;

    @MetaField
    private String candidateselectionid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscamexe.dto.bq.CandidateSelection candidateSelection;

    public void setCustomercampaignexecutionid(String customercampaignexecutionid) {
        this.customercampaignexecutionid = customercampaignexecutionid;
    }

    public String getCustomercampaignexecutionid() {
        return customercampaignexecutionid;
    }

    public void setCandidateselectionid(String candidateselectionid) {
        this.candidateselectionid = candidateselectionid;
    }

    public String getCandidateselectionid() {
        return candidateselectionid;
    }

    public void setCandidateSelection(org.museframework.bian.cuscamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.cuscamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}