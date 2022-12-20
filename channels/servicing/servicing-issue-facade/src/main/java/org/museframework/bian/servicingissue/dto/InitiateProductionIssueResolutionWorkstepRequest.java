package org.museframework.bian.servicingissue.dto;

public class InitiateProductionIssueResolutionWorkstepRequest {
    private String servicingissueid;

    private String productionissueresolutionworkstepid;

    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep productionIssueResolutionWorkstep;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setProductionissueresolutionworkstepid(String productionissueresolutionworkstepid) {
        this.productionissueresolutionworkstepid = productionissueresolutionworkstepid;
    }

    public String getProductionissueresolutionworkstepid() {
        return productionissueresolutionworkstepid;
    }

    public void setProductionIssueResolutionWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep productionIssueResolutionWorkstep) {
        this.productionIssueResolutionWorkstep = productionIssueResolutionWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep getProductionIssueResolutionWorkstep() {
        return productionIssueResolutionWorkstep;
    }
}