package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCaptureandClassificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification captureandClassification;

    public void setCaptureandClassification(org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification captureandClassification) {
        this.captureandClassification = captureandClassification;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification getCaptureandClassification() {
        return captureandClassification;
    }
}