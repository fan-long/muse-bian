package org.museframework.bian.regandlegaut.dto;

public class RetrieveRepresentBankInterestsRequest {
    private String regulatoryandlegalauthorityid;

    private String representbankinterestsid;

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
}