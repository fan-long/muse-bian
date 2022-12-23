package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateReaderAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String readerassignmentid;

    @MetaField(ref=true)
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