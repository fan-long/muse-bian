package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestAnalystReviewRequest {
    @MetaField
    private String frauddiagnosisid;

    @MetaField
    private String analystreviewid;

    @MetaField(ref=true)
    private org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setAnalystreviewid(String analystreviewid) {
        this.analystreviewid = analystreviewid;
    }

    public String getAnalystreviewid() {
        return analystreviewid;
    }

    public void setAnalystReview(org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview) {
        this.analystReview = analystReview;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview getAnalystReview() {
        return analystReview;
    }
}