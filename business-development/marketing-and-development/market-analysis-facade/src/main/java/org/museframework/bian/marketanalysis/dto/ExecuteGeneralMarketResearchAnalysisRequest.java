package org.museframework.bian.marketanalysis.dto;

public class ExecuteGeneralMarketResearchAnalysisRequest {
    private String marketanalysisid;

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