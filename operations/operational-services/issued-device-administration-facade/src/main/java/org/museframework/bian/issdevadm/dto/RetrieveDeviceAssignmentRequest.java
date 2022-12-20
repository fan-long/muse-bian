package org.museframework.bian.issdevadm.dto;

public class RetrieveDeviceAssignmentRequest {
    private String issueddeviceadministrationid;

    private String deviceassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setDeviceassignmentid(String deviceassignmentid) {
        this.deviceassignmentid = deviceassignmentid;
    }

    public String getDeviceassignmentid() {
        return deviceassignmentid;
    }
}