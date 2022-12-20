package org.museframework.bian.programtrading.dto;

public class ExecuteProgramTradedPortfolioAlgorithmFunctionRequest {
    private String programtradingid;

    private String programtradedportfolioalgorithmfunctionid;

    private org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction programTradedPortfolioAlgorithmFunction;

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

    public void setProgramTradedPortfolioAlgorithmFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction programTradedPortfolioAlgorithmFunction) {
        this.programTradedPortfolioAlgorithmFunction = programTradedPortfolioAlgorithmFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioAlgorithmFunction getProgramTradedPortfolioAlgorithmFunction() {
        return programTradedPortfolioAlgorithmFunction;
    }
}