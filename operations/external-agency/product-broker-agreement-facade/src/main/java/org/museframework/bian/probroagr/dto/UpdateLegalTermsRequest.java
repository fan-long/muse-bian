package org.museframework.bian.probroagr.dto;

public class UpdateLegalTermsRequest {
    private String productbrokeragreementid;

    private String legaltermsid;

    private org.museframework.bian.probroagr.dto.bq.LegalTerms legalTerms;

    public void setProductbrokeragreementid(String productbrokeragreementid) {
        this.productbrokeragreementid = productbrokeragreementid;
    }

    public String getProductbrokeragreementid() {
        return productbrokeragreementid;
    }

    public void setLegaltermsid(String legaltermsid) {
        this.legaltermsid = legaltermsid;
    }

    public String getLegaltermsid() {
        return legaltermsid;
    }

    public void setLegalTerms(org.museframework.bian.probroagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}