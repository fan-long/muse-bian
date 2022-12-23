package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveImpactAssessmentRequest {
    @MetaField
    private String promotionaleventsid;

    @MetaField
    private String impactassessmentid;

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
}