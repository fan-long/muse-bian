package org.museframework.bian.invporana.dto;

public class ExecutePerformanceAnalysisRequest {
    private String investmentportfolioanalysisid;

    private String performanceanalysisid;

    private org.museframework.bian.invporana.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setInvestmentportfolioanalysisid(String investmentportfolioanalysisid) {
        this.investmentportfolioanalysisid = investmentportfolioanalysisid;
    }

    public String getInvestmentportfolioanalysisid() {
        return investmentportfolioanalysisid;
    }

    public void setPerformanceanalysisid(String performanceanalysisid) {
        this.performanceanalysisid = performanceanalysisid;
    }

    public String getPerformanceanalysisid() {
        return performanceanalysisid;
    }

    public void setPerformanceAnalysis(org.museframework.bian.invporana.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.invporana.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}