package org.museframework.bian.cuscamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestAnalysisFeedbackResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback;

    public void setAnalysisFeedback(org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback analysisFeedback) {
        this.analysisFeedback = analysisFeedback;
    }

    public org.museframework.bian.cuscamexe.dto.bq.AnalysisFeedback getAnalysisFeedback() {
        return analysisFeedback;
    }
}