package org.museframework.bian.productionrelease.dto;

public class RetrieveProductionRiskRequest {
    private String productionreleaseid;

    private String productionriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setProductionriskid(String productionriskid) {
        this.productionriskid = productionriskid;
    }

    public String getProductionriskid() {
        return productionriskid;
    }
}