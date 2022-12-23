package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCaseResolutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution;

    public void setCaseResolution(org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution) {
        this.caseResolution = caseResolution;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseResolution getCaseResolution() {
        return caseResolution;
    }
}