package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBatchRequest {
    @MetaField
    private String cardterminaloperationid;

    @MetaField
    private String batchid;

    @MetaField(ref=true)
    private org.museframework.bian.carterope.dto.bq.Batch batch;

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

    public void setBatch(org.museframework.bian.carterope.dto.bq.Batch batch) {
        this.batch = batch;
    }

    public org.museframework.bian.carterope.dto.bq.Batch getBatch() {
        return batch;
    }
}