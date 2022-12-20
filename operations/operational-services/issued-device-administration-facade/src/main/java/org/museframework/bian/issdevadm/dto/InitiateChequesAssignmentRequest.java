package org.museframework.bian.issdevadm.dto;

public class InitiateChequesAssignmentRequest {
    private String issueddeviceadministrationid;

    private String chequesassignmentid;

    private org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setChequesassignmentid(String chequesassignmentid) {
        this.chequesassignmentid = chequesassignmentid;
    }

    public String getChequesassignmentid() {
        return chequesassignmentid;
    }

    public void setChequesAssignment(org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment) {
        this.chequesAssignment = chequesAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ChequesAssignment getChequesAssignment() {
        return chequesAssignment;
    }
}