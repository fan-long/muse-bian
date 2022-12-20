package org.museframework.bian.servicingissue.dto;

public class RetrieveProductionIssueAnalysisWorkstepRequest {
    private String servicingissueid;

    private String productionissueanalysisworkstepid;

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
}