package org.museframework.bian.issdevadm.dto;

public class UpdateReaderAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.ReaderAssignment readerAssignment;

    public void setReaderAssignment(org.museframework.bian.issdevadm.dto.bq.ReaderAssignment readerAssignment) {
        this.readerAssignment = readerAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ReaderAssignment getReaderAssignment() {
        return readerAssignment;
    }
}