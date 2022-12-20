package org.museframework.bian.productmatching.dto;

public class RetrieveContextCriteriaRequest {
    private String productmatchingid;

    private String contextcriteriaid;

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
}