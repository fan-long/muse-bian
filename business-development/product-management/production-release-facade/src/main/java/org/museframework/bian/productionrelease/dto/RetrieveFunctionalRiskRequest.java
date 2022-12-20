package org.museframework.bian.productionrelease.dto;

public class RetrieveFunctionalRiskRequest {
    private String productionreleaseid;

    private String functionalriskid;

    public void setProductionreleaseid(String productionreleaseid) {
        this.productionreleaseid = productionreleaseid;
    }

    public String getProductionreleaseid() {
        return productionreleaseid;
    }

    public void setFunctionalriskid(String functionalriskid) {
        this.functionalriskid = functionalriskid;
    }

    public String getFunctionalriskid() {
        return functionalriskid;
    }
}