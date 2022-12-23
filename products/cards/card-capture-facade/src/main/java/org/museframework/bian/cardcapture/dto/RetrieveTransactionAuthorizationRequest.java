package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionAuthorizationRequest {
    @MetaField
    private String cardcaptureid;

    @MetaField
    private String transactionauthorizationid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }
}