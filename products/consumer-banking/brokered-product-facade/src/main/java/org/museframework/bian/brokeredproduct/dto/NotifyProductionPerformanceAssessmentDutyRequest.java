package org.museframework.bian.brokeredproduct.dto;

public class NotifyProductionPerformanceAssessmentDutyRequest {
    private String brokeredproductid;

    private String productionperformanceassessmentdutyid;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setProductionperformanceassessmentdutyid(String productionperformanceassessmentdutyid) {
        this.productionperformanceassessmentdutyid = productionperformanceassessmentdutyid;
    }

    public String getProductionperformanceassessmentdutyid() {
        return productionperformanceassessmentdutyid;
    }
}