package org.museframework.bian.issdevadm.dto;

public class CaptureDeviceAssignmentRequest {
    private String issueddeviceadministrationid;

    private String deviceassignmentid;

    private org.museframework.bian.issdevadm.dto.bq.DeviceAssignment deviceAssignment;

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

    public void setDeviceAssignment(org.museframework.bian.issdevadm.dto.bq.DeviceAssignment deviceAssignment) {
        this.deviceAssignment = deviceAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.DeviceAssignment getDeviceAssignment() {
        return deviceAssignment;
    }
}