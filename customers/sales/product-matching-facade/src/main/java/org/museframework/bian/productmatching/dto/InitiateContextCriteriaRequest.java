package org.museframework.bian.productmatching.dto;

public class InitiateContextCriteriaRequest {
    private String productmatchingid;

    private String contextcriteriaid;

    private org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setContextcriteriaid(String contextcriteriaid) {
        this.contextcriteriaid = contextcriteriaid;
    }

    public String getContextcriteriaid() {
        return contextcriteriaid;
    }

    public void setContextCriteria(org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria) {
        this.contextCriteria = contextCriteria;
    }

    public org.museframework.bian.productmatching.dto.bq.ContextCriteria getContextCriteria() {
        return contextCriteria;
    }
}