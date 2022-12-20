package org.museframework.bian.carfinset.dto;

public class RetrieveInstructionResponse {
    private org.museframework.bian.carfinset.dto.bq.Instruction instruction;

    public void setInstruction(org.museframework.bian.carfinset.dto.bq.Instruction instruction) {
        this.instruction = instruction;
    }

    public org.museframework.bian.carfinset.dto.bq.Instruction getInstruction() {
        return instruction;
    }
}