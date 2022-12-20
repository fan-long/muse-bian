package org.museframework.bian.salproagr.dto;

public class UpdateRegulatoryTermsRequest {
    private String salesproductagreementid;

    private String regulatorytermsid;

    private org.museframework.bian.salproagr.dto.bq.RegulatoryTerms regulatoryTerms;

    public void setSalesproductagreementid(String salesproductagreementid) {
        this.salesproductagreementid = salesproductagreementid;
    }

    public String getSalesproductagreementid() {
        return salesproductagreementid;
    }

    public void setRegulatorytermsid(String regulatorytermsid) {
        this.regulatorytermsid = regulatorytermsid;
    }

    public String getRegulatorytermsid() {
        return regulatorytermsid;
    }

    public void setRegulatoryTerms(org.museframework.bian.salproagr.dto.bq.RegulatoryTerms regulatoryTerms) {
        this.regulatoryTerms = regulatoryTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.RegulatoryTerms getRegulatoryTerms() {
        return regulatoryTerms;
    }
}