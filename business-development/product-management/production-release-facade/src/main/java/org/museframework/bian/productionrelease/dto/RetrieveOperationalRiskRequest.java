package org.museframework.bian.productionrelease.dto;

public class RetrieveOperationalRiskRequest {
    private String productionreleaseid;

    private String operationalriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setOperationalriskid(String operationalriskid) {
        this.operationalriskid = operationalriskid;
    }

    public String getOperationalriskid() {
        return operationalriskid;
    }
}