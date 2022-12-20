package org.museframework.bian.issdevadm.dto;

public class RetrievePasswordAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment;

    public void setPasswordAssignment(org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment) {
        this.passwordAssignment = passwordAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.PasswordAssignment getPasswordAssignment() {
        return passwordAssignment;
    }
}