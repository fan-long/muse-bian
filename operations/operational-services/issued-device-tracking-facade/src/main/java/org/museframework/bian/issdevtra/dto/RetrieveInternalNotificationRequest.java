package org.museframework.bian.issdevtra.dto;

public class RetrieveInternalNotificationRequest {
    private String issueddevicetrackingid;

    private String internalnotificationid;

    public void setIssueddevicetrackingid(String issueddevicetrackingid) {
        this.issueddevicetrackingid = issueddevicetrackingid;
    }

    public String getIssueddevicetrackingid() {
        return issueddevicetrackingid;
    }

    public void setInternalnotificationid(String internalnotificationid) {
        this.internalnotificationid = internalnotificationid;
    }

    public String getInternalnotificationid() {
        return internalnotificationid;
    }
}