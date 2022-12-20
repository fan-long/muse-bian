package org.museframework.bian.brokeredproduct.dto;

public class ExchangeProductionTroubleshootingDutyRequest {
    private String brokeredproductid;

    private String productiontroubleshootingdutyid;

    private org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty productionTroubleshootingDuty;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setProductiontroubleshootingdutyid(String productiontroubleshootingdutyid) {
        this.productiontroubleshootingdutyid = productiontroubleshootingdutyid;
    }

    public String getProductiontroubleshootingdutyid() {
        return productiontroubleshootingdutyid;
    }

    public void setProductionTroubleshootingDuty(org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty productionTroubleshootingDuty) {
        this.productionTroubleshootingDuty = productionTroubleshootingDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ProductionTroubleshootingDuty getProductionTroubleshootingDuty() {
        return productionTroubleshootingDuty;
    }
}