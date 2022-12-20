package org.museframework.bian.programtrading.dto;

public class UpdateProgramTradedPortfolioMaintenanceFunctionRequest {
    private String programtradingid;

    private String programtradedportfoliomaintenancefunctionid;

    private org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction programTradedPortfolioMaintenanceFunction;

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

    public void setProgramTradedPortfolioMaintenanceFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction programTradedPortfolioMaintenanceFunction) {
        this.programTradedPortfolioMaintenanceFunction = programTradedPortfolioMaintenanceFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction getProgramTradedPortfolioMaintenanceFunction() {
        return programTradedPortfolioMaintenanceFunction;
    }
}