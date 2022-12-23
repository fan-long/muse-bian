package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBatchRequest {
    @MetaField
    private String cardterminaloperationid;

    @MetaField
    private String batchid;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getBatchid() {
        return batchid;
    }
}