package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInstructionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.bq.Instruction instruction;

    public void setInstruction(org.museframework.bian.carfinset.dto.bq.Instruction instruction) {
        this.instruction = instruction;
    }

    public org.museframework.bian.carfinset.dto.bq.Instruction getInstruction() {
        return instruction;
    }
}