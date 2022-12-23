package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProgramTradingOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.cr.ProgramTradingOperatingSession programTradingOperatingSession;

    public void setProgramTradingOperatingSession(org.museframework.bian.programtrading.dto.cr.ProgramTradingOperatingSession programTradingOperatingSession) {
        this.programTradingOperatingSession = programTradingOperatingSession;
    }

    public org.museframework.bian.programtrading.dto.cr.ProgramTradingOperatingSession getProgramTradingOperatingSession() {
        return programTradingOperatingSession;
    }
}