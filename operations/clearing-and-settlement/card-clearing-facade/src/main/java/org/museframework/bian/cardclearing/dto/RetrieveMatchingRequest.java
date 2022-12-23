package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMatchingRequest {
    @MetaField
    private String cardclearingid;

    @MetaField
    private String matchingid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setMatchingid(String matchingid) {
        this.matchingid = matchingid;
    }

    public String getMatchingid() {
        return matchingid;
    }
}