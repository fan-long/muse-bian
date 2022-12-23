package org.museframework.bian.proinviteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinviteman.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.proinviteman.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.proinviteman.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}