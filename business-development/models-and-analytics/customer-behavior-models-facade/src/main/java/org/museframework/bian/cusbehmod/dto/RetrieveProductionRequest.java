package org.museframework.bian.cusbehmod.dto;

public class RetrieveProductionRequest {
    private String customerbehaviormodelsid;

    private String productionid;

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
}