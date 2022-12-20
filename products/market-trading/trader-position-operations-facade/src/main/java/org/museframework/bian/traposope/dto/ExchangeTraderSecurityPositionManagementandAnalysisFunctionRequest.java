package org.museframework.bian.traposope.dto;

public class ExchangeTraderSecurityPositionManagementandAnalysisFunctionRequest {
    private String traderpositionoperationsid;

    private String tradersecuritypositionmanagementandanalysisfunctionid;

    private org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradersecuritypositionmanagementandanalysisfunctionid(String tradersecuritypositionmanagementandanalysisfunctionid) {
        this.tradersecuritypositionmanagementandanalysisfunctionid = tradersecuritypositionmanagementandanalysisfunctionid;
    }

    public String getTradersecuritypositionmanagementandanalysisfunctionid() {
        return tradersecuritypositionmanagementandanalysisfunctionid;
    }

    public void setTraderSecurityPositionManagementandAnalysisFunction(org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction) {
        this.traderSecurityPositionManagementandAnalysisFunction = traderSecurityPositionManagementandAnalysisFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction getTraderSecurityPositionManagementandAnalysisFunction() {
        return traderSecurityPositionManagementandAnalysisFunction;
    }
}