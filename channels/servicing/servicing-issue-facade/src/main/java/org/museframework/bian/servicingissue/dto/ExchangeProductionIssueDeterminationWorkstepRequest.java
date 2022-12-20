package org.museframework.bian.servicingissue.dto;

public class ExchangeProductionIssueDeterminationWorkstepRequest {
    private String servicingissueid;

    private String productionissuedeterminationworkstepid;

    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep productionIssueDeterminationWorkstep;

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

    public void setProductionIssueDeterminationWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep productionIssueDeterminationWorkstep) {
        this.productionIssueDeterminationWorkstep = productionIssueDeterminationWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep getProductionIssueDeterminationWorkstep() {
        return productionIssueDeterminationWorkstep;
    }
}