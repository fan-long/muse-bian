package org.museframework.bian.probroagr.dto;

public class EvaluateRegulatoryTermsRequest {
    private String productbrokeragreementid;

    private String regulatorytermsid;

    private org.museframework.bian.probroagr.dto.bq.RegulatoryTerms regulatoryTerms;

    public void setProductbrokeragreementid(String productbrokeragreementid) {
        this.productbrokeragreementid = productbrokeragreementid;
    }

    public String getProductbrokeragreementid() {
        return productbrokeragreementid;
    }

    public void setRegulatorytermsid(String regulatorytermsid) {
        this.regulatorytermsid = regulatorytermsid;
    }

    public String getRegulatorytermsid() {
        return regulatorytermsid;
    }

    public void setRegulatoryTerms(org.museframework.bian.probroagr.dto.bq.RegulatoryTerms regulatoryTerms) {
        this.regulatoryTerms = regulatoryTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.RegulatoryTerms getRegulatoryTerms() {
        return regulatoryTerms;
    }
}