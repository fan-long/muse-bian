package org.museframework.bian.issdevtra.dto;

public class UpdateInternalNotificationRequest {
    private String issueddevicetrackingid;

    private String internalnotificationid;

    private org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification;

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

    public void setInternalNotification(org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification) {
        this.internalNotification = internalNotification;
    }

    public org.museframework.bian.issdevtra.dto.bq.InternalNotification getInternalNotification() {
        return internalNotification;
    }
}