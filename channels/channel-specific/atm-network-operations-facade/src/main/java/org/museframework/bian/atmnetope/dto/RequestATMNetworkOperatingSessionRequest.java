package org.museframework.bian.atmnetope.dto;

public class RequestATMNetworkOperatingSessionRequest {
    private String atmnetworkoperationsid;

    private org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession aTMNetworkOperatingSession;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setaTMNetworkOperatingSession(org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession aTMNetworkOperatingSession) {
        this.aTMNetworkOperatingSession = aTMNetworkOperatingSession;
    }

    public org.museframework.bian.atmnetope.dto.cr.ATMNetworkOperatingSession getaTMNetworkOperatingSession() {
        return aTMNetworkOperatingSession;
    }
}