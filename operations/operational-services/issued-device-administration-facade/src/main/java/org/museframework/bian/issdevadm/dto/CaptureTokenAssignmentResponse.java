package org.museframework.bian.issdevadm.dto;

public class CaptureTokenAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment;

    public void setTokenAssignment(org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment) {
        this.tokenAssignment = tokenAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.TokenAssignment getTokenAssignment() {
        return tokenAssignment;
    }
}