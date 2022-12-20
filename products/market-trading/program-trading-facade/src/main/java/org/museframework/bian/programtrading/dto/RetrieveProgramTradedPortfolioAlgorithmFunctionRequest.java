package org.museframework.bian.programtrading.dto;

public class RetrieveProgramTradedPortfolioAlgorithmFunctionRequest {
    private String programtradingid;

    private String programtradedportfolioalgorithmfunctionid;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramtradedportfolioalgorithmfunctionid(String programtradedportfolioalgorithmfunctionid) {
        this.programtradedportfolioalgorithmfunctionid = programtradedportfolioalgorithmfunctionid;
    }

    public String getProgramtradedportfolioalgorithmfunctionid() {
        return programtradedportfolioalgorithmfunctionid;
    }
}