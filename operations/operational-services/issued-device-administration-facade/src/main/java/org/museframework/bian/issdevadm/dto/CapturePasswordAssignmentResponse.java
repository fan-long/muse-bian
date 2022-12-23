package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CapturePasswordAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment;

    public void setPasswordAssignment(org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment) {
        this.passwordAssignment = passwordAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.PasswordAssignment getPasswordAssignment() {
        return passwordAssignment;
    }
}