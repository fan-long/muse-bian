package org.museframework.bian.probroagr.dto;

public class RetrieveRegulatoryTermsRequest {
    private String productbrokeragreementid;

    private String regulatorytermsid;

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
}