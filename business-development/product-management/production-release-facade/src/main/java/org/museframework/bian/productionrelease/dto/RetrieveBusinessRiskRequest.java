package org.museframework.bian.productionrelease.dto;

public class RetrieveBusinessRiskRequest {
    private String productionreleaseid;

    private String businessriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setBusinessriskid(String businessriskid) {
        this.businessriskid = businessriskid;
    }

    public String getBusinessriskid() {
        return businessriskid;
    }
}