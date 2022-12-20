package org.museframework.bian.itstaandgui.dto;

public class InitiateProductionPlatformsandInfrastructureRequest {
    private String itstandardsandguidelinesid;

    private String productionplatformsandinfrastructureid;

    private org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure productionPlatformsandInfrastructure;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setProductionplatformsandinfrastructureid(String productionplatformsandinfrastructureid) {
        this.productionplatformsandinfrastructureid = productionplatformsandinfrastructureid;
    }

    public String getProductionplatformsandinfrastructureid() {
        return productionplatformsandinfrastructureid;
    }

    public void setProductionPlatformsandInfrastructure(org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure productionPlatformsandInfrastructure) {
        this.productionPlatformsandInfrastructure = productionPlatformsandInfrastructure;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure getProductionPlatformsandInfrastructure() {
        return productionPlatformsandInfrastructure;
    }
}