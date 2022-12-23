package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCaptureandClassificationRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String captureandclassificationid;

    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification captureandClassification;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setCaptureandclassificationid(String captureandclassificationid) {
        this.captureandclassificationid = captureandclassificationid;
    }

    public String getCaptureandclassificationid() {
        return captureandclassificationid;
    }

    public void setCaptureandClassification(org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification captureandClassification) {
        this.captureandClassification = captureandClassification;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.CaptureandClassification getCaptureandClassification() {
        return captureandClassification;
    }
}