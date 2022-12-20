package org.museframework.bian.servicingissue.dto;

public class RetrieveProductionIssueDeterminationWorkstepRequest {
    private String servicingissueid;

    private String productionissuedeterminationworkstepid;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setProductionissuedeterminationworkstepid(String productionissuedeterminationworkstepid) {
        this.productionissuedeterminationworkstepid = productionissuedeterminationworkstepid;
    }

    public String getProductionissuedeterminationworkstepid() {
        return productionissuedeterminationworkstepid;
    }
}