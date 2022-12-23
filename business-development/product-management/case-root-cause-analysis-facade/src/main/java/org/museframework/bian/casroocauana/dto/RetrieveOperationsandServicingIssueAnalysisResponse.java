package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOperationsandServicingIssueAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.bq.OperationsandServicingIssueAnalysis operationsandServicingIssueAnalysis;

    public void setOperationsandServicingIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.OperationsandServicingIssueAnalysis operationsandServicingIssueAnalysis) {
        this.operationsandServicingIssueAnalysis = operationsandServicingIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.OperationsandServicingIssueAnalysis getOperationsandServicingIssueAnalysis() {
        return operationsandServicingIssueAnalysis;
    }
}