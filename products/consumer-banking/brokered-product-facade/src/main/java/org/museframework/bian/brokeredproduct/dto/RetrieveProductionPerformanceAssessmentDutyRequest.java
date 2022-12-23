package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductionPerformanceAssessmentDutyRequest {
    @MetaField
    private String brokeredproductid;

    @MetaField
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