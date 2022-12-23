package org.museframework.bian.procamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAnalysisFeedbackRequest {
    @MetaField
    private String prospectcampaignexecutionid;

    @MetaField
    private String analysisfeedbackid;

    public void setProspectcampaignexecutionid(String prospectcampaignexecutionid) {
        this.prospectcampaignexecutionid = prospectcampaignexecutionid;
    }

    public String getProspectcampaignexecutionid() {
        return prospectcampaignexecutionid;
    }

    public void setAnalysisfeedbackid(String analysisfeedbackid) {
        this.analysisfeedbackid = analysisfeedbackid;
    }

    public String getAnalysisfeedbackid() {
        return analysisfeedbackid;
    }
}