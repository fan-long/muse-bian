package org.museframework.bian.issdevadm.dto;

public class CaptureReaderAssignmentRequest {
    private String issueddeviceadministrationid;

    private String readerassignmentid;

    private org.museframework.bian.issdevadm.dto.bq.ReaderAssignment readerAssignment;

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

    public void setReaderAssignment(org.museframework.bian.issdevadm.dto.bq.ReaderAssignment readerAssignment) {
        this.readerAssignment = readerAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ReaderAssignment getReaderAssignment() {
        return readerAssignment;
    }
}