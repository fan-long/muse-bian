package org.museframework.bian.regandlegaut.dto;

public class InitiateRepresentBankInterestsRequest {
    private String regulatoryandlegalauthorityid;

    private String representbankinterestsid;

    private org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests representBankInterests;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setRepresentbankinterestsid(String representbankinterestsid) {
        this.representbankinterestsid = representbankinterestsid;
    }

    public String getRepresentbankinterestsid() {
        return representbankinterestsid;
    }

    public void setRepresentBankInterests(org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests representBankInterests) {
        this.representBankInterests = representBankInterests;
    }

    public org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests getRepresentBankInterests() {
        return representBankInterests;
    }
}