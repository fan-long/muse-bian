package org.museframework.bian.marketresearch.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateGeneralMarketResearchDirectoryEntryRequest {
    @MetaField
    private String marketresearchid;

    @MetaField(ref=true)
    private org.museframework.bian.marketresearch.dto.cr.GeneralMarketResearchDirectoryEntry generalMarketResearchDirectoryEntry;

    public void setMarketresearchid(String marketresearchid) {
        this.marketresearchid = marketresearchid;
    }

    public String getMarketresearchid() {
        return marketresearchid;
    }

    public void setGeneralMarketResearchDirectoryEntry(org.museframework.bian.marketresearch.dto.cr.GeneralMarketResearchDirectoryEntry generalMarketResearchDirectoryEntry) {
        this.generalMarketResearchDirectoryEntry = generalMarketResearchDirectoryEntry;
    }

    public org.museframework.bian.marketresearch.dto.cr.GeneralMarketResearchDirectoryEntry getGeneralMarketResearchDirectoryEntry() {
        return generalMarketResearchDirectoryEntry;
    }
}