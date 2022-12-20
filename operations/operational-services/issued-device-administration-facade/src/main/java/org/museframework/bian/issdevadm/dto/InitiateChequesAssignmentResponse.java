package org.museframework.bian.issdevadm.dto;

public class InitiateChequesAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment;

    public void setChequesAssignment(org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment) {
        this.chequesAssignment = chequesAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ChequesAssignment getChequesAssignment() {
        return chequesAssignment;
    }
}