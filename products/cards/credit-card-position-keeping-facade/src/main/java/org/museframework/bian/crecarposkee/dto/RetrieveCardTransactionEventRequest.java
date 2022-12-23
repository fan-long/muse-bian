package org.museframework.bian.crecarposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCardTransactionEventRequest {
    @MetaField
    private String creditcardpositionkeepingid;

    @MetaField
    private String cardtransactioneventid;

    public void setCreditcardpositionkeepingid(String creditcardpositionkeepingid) {
        this.creditcardpositionkeepingid = creditcardpositionkeepingid;
    }

    public String getCreditcardpositionkeepingid() {
        return creditcardpositionkeepingid;
    }

    public void setCardtransactioneventid(String cardtransactioneventid) {
        this.cardtransactioneventid = cardtransactioneventid;
    }

    public String getCardtransactioneventid() {
        return cardtransactioneventid;
    }
}