package org.museframework.bian.crerismod.dto;

public class UpdateProductionRequest {
    private String creditriskmodelsid;

    private String productionid;

    private org.museframework.bian.crerismod.dto.bq.Production production;

    public void setCreditriskmodelsid(String creditriskmodelsid) {
        this.creditriskmodelsid = creditriskmodelsid;
    }

    public String getCreditriskmodelsid() {
        return creditriskmodelsid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.crerismod.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.crerismod.dto.bq.Production getProduction() {
        return production;
    }
}