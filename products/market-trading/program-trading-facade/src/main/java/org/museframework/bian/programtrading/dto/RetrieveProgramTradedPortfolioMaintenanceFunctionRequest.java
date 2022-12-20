package org.museframework.bian.programtrading.dto;

public class RetrieveProgramTradedPortfolioMaintenanceFunctionRequest {
    private String programtradingid;

    private String programtradedportfoliomaintenancefunctionid;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramtradedportfoliomaintenancefunctionid(String programtradedportfoliomaintenancefunctionid) {
        this.programtradedportfoliomaintenancefunctionid = programtradedportfoliomaintenancefunctionid;
    }

    public String getProgramtradedportfoliomaintenancefunctionid() {
        return programtradedportfoliomaintenancefunctionid;
    }
}