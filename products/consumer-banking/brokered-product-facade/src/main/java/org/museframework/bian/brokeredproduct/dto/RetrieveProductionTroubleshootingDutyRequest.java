package org.museframework.bian.brokeredproduct.dto;

public class RetrieveProductionTroubleshootingDutyRequest {
    private String brokeredproductid;

    private String productiontroubleshootingdutyid;

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
}