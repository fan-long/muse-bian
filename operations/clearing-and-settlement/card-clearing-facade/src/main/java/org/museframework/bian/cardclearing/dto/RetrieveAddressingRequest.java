package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAddressingRequest {
    @MetaField
    private String cardclearingid;

    @MetaField
    private String addressingid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setAddressingid(String addressingid) {
        this.addressingid = addressingid;
    }

    public String getAddressingid() {
        return addressingid;
    }
}