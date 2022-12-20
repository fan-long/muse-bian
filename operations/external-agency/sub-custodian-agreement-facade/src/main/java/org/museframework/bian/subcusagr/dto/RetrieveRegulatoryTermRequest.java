package org.museframework.bian.subcusagr.dto;

public class RetrieveRegulatoryTermRequest {
    private String subcustodianagreementid;

    private String regulatorytermid;

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
}