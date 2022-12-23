package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCaseAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudresolution.dto.bq.CaseAnalysis caseAnalysis;

    public void setCaseAnalysis(org.museframework.bian.fraudresolution.dto.bq.CaseAnalysis caseAnalysis) {
        this.caseAnalysis = caseAnalysis;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseAnalysis getCaseAnalysis() {
        return caseAnalysis;
    }
}