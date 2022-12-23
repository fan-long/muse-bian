package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureTokenAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment;

    public void setTokenAssignment(org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment) {
        this.tokenAssignment = tokenAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.TokenAssignment getTokenAssignment() {
        return tokenAssignment;
    }
}