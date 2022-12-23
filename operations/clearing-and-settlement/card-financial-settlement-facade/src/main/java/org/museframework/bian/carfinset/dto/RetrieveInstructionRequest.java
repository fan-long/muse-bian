package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInstructionRequest {
    @MetaField
    private String cardfinancialsettlementid;

    @MetaField
    private String instructionid;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setInstructionid(String instructionid) {
        this.instructionid = instructionid;
    }

    public String getInstructionid() {
        return instructionid;
    }
}