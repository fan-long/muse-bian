package org.museframework.bian.proserage.dto;

public class EvaluateRegulatoryTermRequest {
    private String productserviceagencyid;

    private String regulatorytermid;

    private org.museframework.bian.proserage.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setProductserviceagencyid(String productserviceagencyid) {
        this.productserviceagencyid = productserviceagencyid;
    }

    public String getProductserviceagencyid() {
        return productserviceagencyid;
    }

    public void setRegulatorytermid(String regulatorytermid) {
        this.regulatorytermid = regulatorytermid;
    }

    public String getRegulatorytermid() {
        return regulatorytermid;
    }

    public void setRegulatoryTerm(org.museframework.bian.proserage.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.proserage.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}