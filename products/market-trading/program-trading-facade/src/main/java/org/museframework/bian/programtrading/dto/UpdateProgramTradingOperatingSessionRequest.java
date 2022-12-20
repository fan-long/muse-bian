package org.museframework.bian.programtrading.dto;

public class UpdateProgramTradingOperatingSessionRequest {
    private String programtradingid;

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