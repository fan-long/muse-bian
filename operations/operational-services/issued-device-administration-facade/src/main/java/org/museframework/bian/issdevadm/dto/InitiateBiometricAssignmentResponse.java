package org.museframework.bian.issdevadm.dto;

public class InitiateBiometricAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment;

    public void setBiometricAssignment(org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment) {
        this.biometricAssignment = biometricAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.BiometricAssignment getBiometricAssignment() {
        return biometricAssignment;
    }
}