package org.museframework.bian.competitoranalysis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCompetitorAnalysisRequest {
    @MetaField
    private String competitoranalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.competitoranalysis.dto.cr.CompetitorAnalysis competitorAnalysis;

    public void setCompetitoranalysisid(String competitoranalysisid) {
        this.competitoranalysisid = competitoranalysisid;
    }

    public String getCompetitoranalysisid() {
        return competitoranalysisid;
    }

    public void setCompetitorAnalysis(org.museframework.bian.competitoranalysis.dto.cr.CompetitorAnalysis competitorAnalysis) {
        this.competitorAnalysis = competitorAnalysis;
    }

    public org.museframework.bian.competitoranalysis.dto.cr.CompetitorAnalysis getCompetitorAnalysis() {
        return competitorAnalysis;
    }
}