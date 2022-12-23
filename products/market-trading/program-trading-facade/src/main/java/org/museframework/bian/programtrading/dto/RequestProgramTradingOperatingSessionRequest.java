package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProgramTradingOperatingSessionRequest {
    @MetaField
    private String programtradingid;

    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.cr.ProgramTradingOperatingSession programTradingOperatingSession;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramTradingOperatingSession(org.museframework.bian.programtrading.dto.cr.ProgramTradingOperatingSession programTradingOperatingSession) {
        this.programTradingOperatingSession = programTradingOperatingSession;
    }

    public org.museframework.bian.programtrading.dto.cr.ProgramTradingOperatingSession getProgramTradingOperatingSession() {
        return programTradingOperatingSession;
    }
}