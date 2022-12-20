package org.museframework.bian.issdevadm.dto;

public class RetrievePasswordAssignmentRequest {
    private String issueddeviceadministrationid;

    private String passwordassignmentid;

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
}