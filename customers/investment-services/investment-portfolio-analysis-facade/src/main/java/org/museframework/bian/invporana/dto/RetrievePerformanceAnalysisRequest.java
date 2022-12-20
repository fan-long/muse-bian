package org.museframework.bian.invporana.dto;

public class RetrievePerformanceAnalysisRequest {
    private String investmentportfolioanalysisid;

    private String performanceanalysisid;

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
}