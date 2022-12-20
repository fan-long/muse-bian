package org.museframework.bian.salproagr.dto;

public class RetrieveRegulatoryTermsRequest {
    private String salesproductagreementid;

    private String regulatorytermsid;

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
}