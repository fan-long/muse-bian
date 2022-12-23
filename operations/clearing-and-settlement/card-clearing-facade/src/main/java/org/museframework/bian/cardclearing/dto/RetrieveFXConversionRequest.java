package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFXConversionRequest {
    @MetaField
    private String cardclearingid;

    @MetaField
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