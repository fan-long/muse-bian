package org.museframework.bian.etradingworkbench.dto;

public class UpdateeTradingWorkbenchOperatingSessionRequest {
    private String etradingworkbenchid;

    private org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession eTradingWorkbenchOperatingSession;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void seteTradingWorkbenchOperatingSession(org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession eTradingWorkbenchOperatingSession) {
        this.eTradingWorkbenchOperatingSession = eTradingWorkbenchOperatingSession;
    }

    public org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession geteTradingWorkbenchOperatingSession() {
        return eTradingWorkbenchOperatingSession;
    }
}