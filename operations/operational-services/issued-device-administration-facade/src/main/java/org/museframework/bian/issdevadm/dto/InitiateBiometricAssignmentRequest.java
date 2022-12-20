package org.museframework.bian.issdevadm.dto;

public class InitiateBiometricAssignmentRequest {
    private String issueddeviceadministrationid;

    private String biometricassignmentid;

    private org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment;

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

    public void setBiometricAssignment(org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment) {
        this.biometricAssignment = biometricAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.BiometricAssignment getBiometricAssignment() {
        return biometricAssignment;
    }
}