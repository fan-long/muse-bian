package org.museframework.bian.issdevadm.dto;

public class UpdateDeviceAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.DeviceAssignment deviceAssignment;

    public void setDeviceAssignment(org.museframework.bian.issdevadm.dto.bq.DeviceAssignment deviceAssignment) {
        this.deviceAssignment = deviceAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.DeviceAssignment getDeviceAssignment() {
        return deviceAssignment;
    }
}