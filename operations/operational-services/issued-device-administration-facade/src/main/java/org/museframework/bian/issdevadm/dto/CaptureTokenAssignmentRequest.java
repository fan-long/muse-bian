package org.museframework.bian.issdevadm.dto;

public class CaptureTokenAssignmentRequest {
    private String issueddeviceadministrationid;

    private String tokenassignmentid;

    private org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setTokenassignmentid(String tokenassignmentid) {
        this.tokenassignmentid = tokenassignmentid;
    }

    public String getTokenassignmentid() {
        return tokenassignmentid;
    }

    public void setTokenAssignment(org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment) {
        this.tokenAssignment = tokenAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.TokenAssignment getTokenAssignment() {
        return tokenAssignment;
    }
}