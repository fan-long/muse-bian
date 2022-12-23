package org.museframework.bian.procamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCandidateSelectionRequest {
    @MetaField
    private String prospectcampaignexecutionid;

    @MetaField
    private String candidateselectionid;

    @MetaField(ref=true)
    private org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection;

    public void setProspectcampaignexecutionid(String prospectcampaignexecutionid) {
        this.prospectcampaignexecutionid = prospectcampaignexecutionid;
    }

    public String getProspectcampaignexecutionid() {
        return prospectcampaignexecutionid;
    }

    public void setCandidateselectionid(String candidateselectionid) {
        this.candidateselectionid = candidateselectionid;
    }

    public String getCandidateselectionid() {
        return candidateselectionid;
    }

    public void setCandidateSelection(org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.procamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}