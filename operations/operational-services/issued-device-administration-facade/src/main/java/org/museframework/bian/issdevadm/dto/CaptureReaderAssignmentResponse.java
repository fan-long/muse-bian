package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureReaderAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.ReaderAssignment readerAssignment;

    public void setReaderAssignment(org.museframework.bian.issdevadm.dto.bq.ReaderAssignment readerAssignment) {
        this.readerAssignment = readerAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ReaderAssignment getReaderAssignment() {
        return readerAssignment;
    }
}