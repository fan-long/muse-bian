package org.museframework.bian.marketresearch.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveGeneralMarketResearchDirectoryEntryRequest {
    @MetaField
    private String marketresearchid;

    public void setMarketresearchid(String marketresearchid) {
        this.marketresearchid = marketresearchid;
    }

    public String getMarketresearchid() {
        return marketresearchid;
    }
}