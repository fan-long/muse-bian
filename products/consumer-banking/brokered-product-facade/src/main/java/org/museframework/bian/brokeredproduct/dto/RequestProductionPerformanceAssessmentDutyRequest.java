package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProductionPerformanceAssessmentDutyRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField
    private String productionperformanceassessmentdutyid;

    @MetaField(ref=true)
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