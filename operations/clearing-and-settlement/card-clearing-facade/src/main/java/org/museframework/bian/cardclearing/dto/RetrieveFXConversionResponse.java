package org.museframework.bian.cardclearing.dto;

public class RetrieveFXConversionResponse {
    private org.museframework.bian.cardclearing.dto.bq.FXConversion fXConversion;

    public void setfXConversion(org.museframework.bian.cardclearing.dto.bq.FXConversion fXConversion) {
        this.fXConversion = fXConversion;
    }

    public org.museframework.bian.cardclearing.dto.bq.FXConversion getfXConversion() {
        return fXConversion;
    }
}