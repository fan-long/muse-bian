package org.museframework.bian.servicingissue.dto;

public class InitiateProductionIssueAnalysisWorkstepRequest {
    private String servicingissueid;

    private String productionissueanalysisworkstepid;

    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep productionIssueAnalysisWorkstep;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setProductionissueanalysisworkstepid(String productionissueanalysisworkstepid) {
        this.productionissueanalysisworkstepid = productionissueanalysisworkstepid;
    }

    public String getProductionissueanalysisworkstepid() {
        return productionissueanalysisworkstepid;
    }

    public void setProductionIssueAnalysisWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep productionIssueAnalysisWorkstep) {
        this.productionIssueAnalysisWorkstep = productionIssueAnalysisWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep getProductionIssueAnalysisWorkstep() {
        return productionIssueAnalysisWorkstep;
    }
}