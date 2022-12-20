package org.museframework.bian.competitoranalysis.dto;

public class EvaluateCompetitorAnalysisRequest {
    private org.museframework.bian.competitoranalysis.dto.cr.CompetitorAnalysis competitorAnalysis;

    public void setCompetitorAnalysis(org.museframework.bian.competitoranalysis.dto.cr.CompetitorAnalysis competitorAnalysis) {
        this.competitorAnalysis = competitorAnalysis;
    }

    public org.museframework.bian.competitoranalysis.dto.cr.CompetitorAnalysis getCompetitorAnalysis() {
        return competitorAnalysis;
    }
}