package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateImpactAssessmentRequest {
    @MetaField
    private String promotionaleventsid;

    @MetaField
    private String impactassessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setImpactassessmentid(String impactassessmentid) {
        this.impactassessmentid = impactassessmentid;
    }

    public String getImpactassessmentid() {
        return impactassessmentid;
    }

    public void setImpactAssessment(org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment) {
        this.impactAssessment = impactAssessment;
    }

    public org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment getImpactAssessment() {
        return impactAssessment;
    }
}