package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProcessingRequest {
    @MetaField
    private String cardfinancialsettlementid;

    @MetaField
    private String processingid;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setProcessingid(String processingid) {
        this.processingid = processingid;
    }

    public String getProcessingid() {
        return processingid;
    }
}