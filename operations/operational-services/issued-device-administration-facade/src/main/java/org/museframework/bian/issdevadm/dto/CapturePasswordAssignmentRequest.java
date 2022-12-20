package org.museframework.bian.issdevadm.dto;

public class CapturePasswordAssignmentRequest {
    private String issueddeviceadministrationid;

    private String passwordassignmentid;

    private org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setPasswordassignmentid(String passwordassignmentid) {
        this.passwordassignmentid = passwordassignmentid;
    }

    public String getPasswordassignmentid() {
        return passwordassignmentid;
    }

    public void setPasswordAssignment(org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment) {
        this.passwordAssignment = passwordAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.PasswordAssignment getPasswordAssignment() {
        return passwordAssignment;
    }
}