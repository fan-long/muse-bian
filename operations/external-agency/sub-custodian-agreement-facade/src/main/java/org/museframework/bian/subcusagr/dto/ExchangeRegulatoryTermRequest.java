package org.museframework.bian.subcusagr.dto;

public class ExchangeRegulatoryTermRequest {
    private String subcustodianagreementid;

    private String regulatorytermid;

    private org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setRegulatorytermid(String regulatorytermid) {
        this.regulatorytermid = regulatorytermid;
    }

    public String getRegulatorytermid() {
        return regulatorytermid;
    }

    public void setRegulatoryTerm(org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}