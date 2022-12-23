package org.museframework.bian.competitoranalysis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCompetitorAnalysisRequest {
    @MetaField
    private String competitoranalysisid;

    public void setCompetitoranalysisid(String competitoranalysisid) {
        this.competitoranalysisid = competitoranalysisid;
    }

    public String getCompetitoranalysisid() {
        return competitoranalysisid;
    }
}