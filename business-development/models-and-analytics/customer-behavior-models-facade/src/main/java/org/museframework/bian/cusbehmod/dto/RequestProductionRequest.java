package org.museframework.bian.cusbehmod.dto;

public class RequestProductionRequest {
    private String customerbehaviormodelsid;

    private String productionid;

    private org.museframework.bian.cusbehmod.dto.bq.Production production;

    public void setCustomerbehaviormodelsid(String customerbehaviormodelsid) {
        this.customerbehaviormodelsid = customerbehaviormodelsid;
    }

    public String getCustomerbehaviormodelsid() {
        return customerbehaviormodelsid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.cusbehmod.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.cusbehmod.dto.bq.Production getProduction() {
        return production;
    }
}