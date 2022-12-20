package org.museframework.bian.carfinset.dto;

public class UpdateInstructionResponse {
    private org.museframework.bian.carfinset.dto.bq.Instruction instruction;

    public void setInstruction(org.museframework.bian.carfinset.dto.bq.Instruction instruction) {
        this.instruction = instruction;
    }

    public org.museframework.bian.carfinset.dto.bq.Instruction getInstruction() {
        return instruction;
    }
}