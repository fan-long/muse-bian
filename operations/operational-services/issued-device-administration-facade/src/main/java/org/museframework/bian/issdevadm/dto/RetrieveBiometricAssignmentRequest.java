package org.museframework.bian.issdevadm.dto;

public class RetrieveBiometricAssignmentRequest {
    private String issueddeviceadministrationid;

    private String biometricassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setBiometricassignmentid(String biometricassignmentid) {
        this.biometricassignmentid = biometricassignmentid;
    }

    public String getBiometricassignmentid() {
        return biometricassignmentid;
    }
}