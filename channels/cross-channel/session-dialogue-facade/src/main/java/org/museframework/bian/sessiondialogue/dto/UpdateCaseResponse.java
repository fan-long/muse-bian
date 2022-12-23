package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCaseResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Case caseObject;

    public void setCaseObject(org.museframework.bian.sessiondialogue.dto.bq.Case caseObject) {
        this.caseObject = caseObject;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Case getCaseObject() {
        return caseObject;
    }
}