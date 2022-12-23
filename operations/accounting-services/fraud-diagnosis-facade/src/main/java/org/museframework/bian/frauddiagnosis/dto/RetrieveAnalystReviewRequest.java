package org.museframework.bian.frauddiagnosis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAnalystReviewRequest {
    @MetaField
    private String frauddiagnosisid;

    @MetaField
    private String analystreviewid;

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
}