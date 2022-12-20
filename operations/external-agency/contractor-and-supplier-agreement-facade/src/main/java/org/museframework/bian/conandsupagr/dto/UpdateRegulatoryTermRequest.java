package org.museframework.bian.conandsupagr.dto;

public class UpdateRegulatoryTermRequest {
    private String contractorandsupplieragreementid;

    private String regulatorytermid;

    private org.museframework.bian.conandsupagr.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setRegulatorytermid(String regulatorytermid) {
        this.regulatorytermid = regulatorytermid;
    }

    public String getRegulatorytermid() {
        return regulatorytermid;
    }

    public void setRegulatoryTerm(org.museframework.bian.conandsupagr.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}