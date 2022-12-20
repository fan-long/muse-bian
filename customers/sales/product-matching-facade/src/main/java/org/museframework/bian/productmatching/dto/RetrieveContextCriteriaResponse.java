package org.museframework.bian.productmatching.dto;

public class RetrieveContextCriteriaResponse {
    private org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria;

    public void setContextCriteria(org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria) {
        this.contextCriteria = contextCriteria;
    }

    public org.museframework.bian.productmatching.dto.bq.ContextCriteria getContextCriteria() {
        return contextCriteria;
    }
}