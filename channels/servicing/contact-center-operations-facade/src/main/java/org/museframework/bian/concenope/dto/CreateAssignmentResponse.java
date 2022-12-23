package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.concenope.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.concenope.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.concenope.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}