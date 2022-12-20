package org.museframework.bian.customeragreement.dto;

public class UpdateLegalTermsRequest {
    private String customeragreementid;

    private String legaltermsid;

    private org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms;

    public void setCustomeragreementid(String customeragreementid) {
        this.customeragreementid = customeragreementid;
    }

    public String getCustomeragreementid() {
        return customeragreementid;
    }

    public void setLegaltermsid(String legaltermsid) {
        this.legaltermsid = legaltermsid;
    }

    public String getLegaltermsid() {
        return legaltermsid;
    }

    public void setLegalTerms(org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}