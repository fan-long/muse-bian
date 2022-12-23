package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveChequesAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment;

    public void setChequesAssignment(org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment) {
        this.chequesAssignment = chequesAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ChequesAssignment getChequesAssignment() {
        return chequesAssignment;
    }
}