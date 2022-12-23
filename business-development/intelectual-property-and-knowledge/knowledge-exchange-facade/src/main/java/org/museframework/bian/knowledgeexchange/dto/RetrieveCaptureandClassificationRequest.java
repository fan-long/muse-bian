package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCaptureandClassificationRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String captureandclassificationid;

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
}