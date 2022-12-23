package org.museframework.bian.cuscamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestAnalysisFeedbackRequest {
    @MetaField
    private String customercampaignexecutionid;

    @MetaField
    private String analysisfeedbackid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback;

    public void setCustomercampaignexecutionid(String customercampaignexecutionid) {
        this.customercampaignexecutionid = customercampaignexecutionid;
    }

    public String getCustomercampaignexecutionid() {
        return customercampaignexecutionid;
    }

    public void setAnalysisfeedbackid(String analysisfeedbackid) {
        this.analysisfeedbackid = analysisfeedbackid;
    }

    public String getAnalysisfeedbackid() {
        return analysisfeedbackid;
    }

    public void setAnalysisFeedback(org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback) {
        this.analysisFeedback = analysisFeedback;
    }

    public org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback getAnalysisFeedback() {
        return analysisFeedback;
    }
}