package org.museframework.bian.fraudevaluation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveModelsRequest {
    @MetaField
    private String fraudevaluationid;

    @MetaField
    private String modelsid;

    public void setFraudevaluationid(String fraudevaluationid) {
        this.fraudevaluationid = fraudevaluationid;
    }

    public String getFraudevaluationid() {
        return fraudevaluationid;
    }

    public void setModelsid(String modelsid) {
        this.modelsid = modelsid;
    }

    public String getModelsid() {
        return modelsid;
    }
}