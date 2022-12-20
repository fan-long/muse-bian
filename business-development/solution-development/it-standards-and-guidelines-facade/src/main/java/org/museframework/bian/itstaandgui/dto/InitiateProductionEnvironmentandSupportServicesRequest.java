package org.museframework.bian.itstaandgui.dto;

public class InitiateProductionEnvironmentandSupportServicesRequest {
    private String itstandardsandguidelinesid;

    private String productionenvironmentandsupportservicesid;

    private org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices productionEnvironmentandSupportServices;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setProductionenvironmentandsupportservicesid(String productionenvironmentandsupportservicesid) {
        this.productionenvironmentandsupportservicesid = productionenvironmentandsupportservicesid;
    }

    public String getProductionenvironmentandsupportservicesid() {
        return productionenvironmentandsupportservicesid;
    }

    public void setProductionEnvironmentandSupportServices(org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices productionEnvironmentandSupportServices) {
        this.productionEnvironmentandSupportServices = productionEnvironmentandSupportServices;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices getProductionEnvironmentandSupportServices() {
        return productionEnvironmentandSupportServices;
    }
}