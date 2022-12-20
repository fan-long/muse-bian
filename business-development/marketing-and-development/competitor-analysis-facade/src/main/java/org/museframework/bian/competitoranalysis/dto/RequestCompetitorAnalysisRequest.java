package org.museframework.bian.competitoranalysis.dto;

public class RequestCompetitorAnalysisRequest {
    private String competitoranalysisid;

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