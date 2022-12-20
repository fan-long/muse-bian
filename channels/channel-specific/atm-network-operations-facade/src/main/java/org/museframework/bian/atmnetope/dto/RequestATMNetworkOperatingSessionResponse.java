package org.museframework.bian.atmnetope.dto;

public class RequestATMNetworkOperatingSessionResponse {
    private org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession aTMNetworkOperatingSession;

    public void setaTMNetworkOperatingSession(org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession aTMNetworkOperatingSession) {
        this.aTMNetworkOperatingSession = aTMNetworkOperatingSession;
    }

    public org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession getaTMNetworkOperatingSession() {
        return aTMNetworkOperatingSession;
    }
}