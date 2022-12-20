package org.museframework.bian.marketresearch.dto;

public class UpdateGeneralMarketResearchDirectoryEntryRequest {
    private String marketresearchid;

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