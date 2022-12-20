package org.museframework.bian.carfinset.dto;

public class UpdateInstructionRequest {
    private String cardfinancialsettlementid;

    private String instructionid;

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