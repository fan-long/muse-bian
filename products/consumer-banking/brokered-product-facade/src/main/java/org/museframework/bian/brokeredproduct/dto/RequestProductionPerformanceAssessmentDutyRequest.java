package org.museframework.bian.brokeredproduct.dto;

public class RequestProductionPerformanceAssessmentDutyRequest {
    private String brokeredproductid;

    private String productionperformanceassessmentdutyid;

    private org.museframework.bian.brokeredproduct.dto.bq.ProductionPerformanceAssessmentDuty productionPerformanceAssessmentDuty;

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

    public void setProductionPerformanceAssessmentDuty(org.museframework.bian.brokeredproduct.dto.bq.ProductionPerformanceAssessmentDuty productionPerformanceAssessmentDuty) {
        this.productionPerformanceAssessmentDuty = productionPerformanceAssessmentDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ProductionPerformanceAssessmentDuty getProductionPerformanceAssessmentDuty() {
        return productionPerformanceAssessmentDuty;
    }
}