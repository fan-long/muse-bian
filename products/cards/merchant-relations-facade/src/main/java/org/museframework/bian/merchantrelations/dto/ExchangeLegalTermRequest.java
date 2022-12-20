package org.museframework.bian.merchantrelations.dto;

public class ExchangeLegalTermRequest {
    private String merchantrelationsid;

    private String legaltermid;

    private org.museframework.bian.merchantrelations.dto.bq.LegalTerm legalTerm;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }

    public void setLegalTerm(org.museframework.bian.merchantrelations.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}