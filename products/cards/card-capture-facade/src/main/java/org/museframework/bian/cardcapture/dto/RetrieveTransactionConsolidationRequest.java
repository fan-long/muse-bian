package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionConsolidationRequest {
    @MetaField
    private String cardcaptureid;

    @MetaField
    private String transactionconsolidationid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionconsolidationid(String transactionconsolidationid) {
        this.transactionconsolidationid = transactionconsolidationid;
    }

    public String getTransactionconsolidationid() {
        return transactionconsolidationid;
    }
}