package org.museframework.bian.salproagr.dto;

public class EvaluateLegalTermsRequest {
    private String salesproductagreementid;

    private String legaltermsid;

    private org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms;

    public void setSalesproductagreementid(String salesproductagreementid) {
        this.salesproductagreementid = salesproductagreementid;
    }

    public String getSalesproductagreementid() {
        return salesproductagreementid;
    }

    public void setLegaltermsid(String legaltermsid) {
        this.legaltermsid = legaltermsid;
    }

    public String getLegaltermsid() {
        return legaltermsid;
    }

    public void setLegalTerms(org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}