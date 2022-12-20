package org.museframework.bian.fraudevaluation.dto;

public class RetrieveModelsRequest {
    private String fraudevaluationid;

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