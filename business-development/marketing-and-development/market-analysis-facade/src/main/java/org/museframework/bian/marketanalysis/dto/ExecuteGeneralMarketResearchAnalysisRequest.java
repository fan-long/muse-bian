package org.museframework.bian.marketanalysis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteGeneralMarketResearchAnalysisRequest {
    @MetaField
    private String marketanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.marketanalysis.dto.cr.GeneralMarketResearchAnalysis generalMarketResearchAnalysis;

    public void setMarketanalysisid(String marketanalysisid) {
        this.marketanalysisid = marketanalysisid;
    }

    public String getMarketanalysisid() {
        return marketanalysisid;
    }

    public void setGeneralMarketResearchAnalysis(org.museframework.bian.marketanalysis.dto.cr.GeneralMarketResearchAnalysis generalMarketResearchAnalysis) {
        this.generalMarketResearchAnalysis = generalMarketResearchAnalysis;
    }

    public org.museframework.bian.marketanalysis.dto.cr.GeneralMarketResearchAnalysis getGeneralMarketResearchAnalysis() {
        return generalMarketResearchAnalysis;
    }
}