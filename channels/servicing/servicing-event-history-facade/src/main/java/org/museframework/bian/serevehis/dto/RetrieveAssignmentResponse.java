package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.serevehis.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.serevehis.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}