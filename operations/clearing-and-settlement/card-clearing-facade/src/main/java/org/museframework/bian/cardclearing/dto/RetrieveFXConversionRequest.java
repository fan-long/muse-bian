package org.museframework.bian.cardclearing.dto;

public class RetrieveFXConversionRequest {
    private String cardclearingid;

    private String fxconversionid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setFxconversionid(String fxconversionid) {
        this.fxconversionid = fxconversionid;
    }

    public String getFxconversionid() {
        return fxconversionid;
    }
}