package org.museframework.bian.servicingissue.dto;

public class NotifyProductionIssueResolutionWorkstepRequest {
    private String servicingissueid;

    private String productionissueresolutionworkstepid;

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
}