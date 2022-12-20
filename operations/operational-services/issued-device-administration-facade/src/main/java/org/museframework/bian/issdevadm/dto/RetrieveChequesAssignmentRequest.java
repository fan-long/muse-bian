package org.museframework.bian.issdevadm.dto;

public class RetrieveChequesAssignmentRequest {
    private String issueddeviceadministrationid;

    private String chequesassignmentid;

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
}