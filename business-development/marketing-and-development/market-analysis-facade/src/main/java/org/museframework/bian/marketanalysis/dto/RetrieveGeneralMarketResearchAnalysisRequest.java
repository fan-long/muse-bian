package org.museframework.bian.marketanalysis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveGeneralMarketResearchAnalysisRequest {
    @MetaField
    private String marketanalysisid;

    public void setMarketanalysisid(String marketanalysisid) {
        this.marketanalysisid = marketanalysisid;
    }

    public String getMarketanalysisid() {
        return marketanalysisid;
    }
}