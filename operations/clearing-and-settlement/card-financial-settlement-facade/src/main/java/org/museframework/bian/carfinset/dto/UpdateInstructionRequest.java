package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInstructionRequest {
    @MetaField
    private String cardfinancialsettlementid;

    @MetaField
    private String instructionid;

    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.bq.Instruction instruction;

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

    public void setInstruction(org.museframework.bian.carfinset.dto.bq.Instruction instruction) {
        this.instruction = instruction;
    }

    public org.museframework.bian.carfinset.dto.bq.Instruction getInstruction() {
        return instruction;
    }
}