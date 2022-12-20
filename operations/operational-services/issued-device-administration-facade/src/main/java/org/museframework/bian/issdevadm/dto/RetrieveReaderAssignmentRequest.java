package org.museframework.bian.issdevadm.dto;

public class RetrieveReaderAssignmentRequest {
    private String issueddeviceadministrationid;

    private String readerassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setReaderassignmentid(String readerassignmentid) {
        this.readerassignmentid = readerassignmentid;
    }

    public String getReaderassignmentid() {
        return readerassignmentid;
    }
}