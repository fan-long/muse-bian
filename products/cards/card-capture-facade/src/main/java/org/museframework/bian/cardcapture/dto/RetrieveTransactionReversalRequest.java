package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionReversalRequest {
    @MetaField
    private String cardcaptureid;

    @MetaField
    private String transactionreversalid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionreversalid(String transactionreversalid) {
        this.transactionreversalid = transactionreversalid;
    }

    public String getTransactionreversalid() {
        return transactionreversalid;
    }
}