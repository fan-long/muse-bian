package org.museframework.bian.merchantrelations.dto;

public class EvaluateRegulatoryTermRequest {
    private String merchantrelationsid;

    private String regulatorytermid;

    private org.museframework.bian.merchantrelations.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setRegulatorytermid(String regulatorytermid) {
        this.regulatorytermid = regulatorytermid;
    }

    public String getRegulatorytermid() {
        return regulatorytermid;
    }

    public void setRegulatoryTerm(org.museframework.bian.merchantrelations.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}