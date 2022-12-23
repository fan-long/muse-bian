package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateOperationsandServicingIssueAnalysisRequest {
    @MetaField
    private String caserootcauseanalysisid;

    @MetaField
    private String operationsandservicingissueanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.bq.OperationsandServicingIssueAnalysis operationsandServicingIssueAnalysis;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setOperationsandservicingissueanalysisid(String operationsandservicingissueanalysisid) {
        this.operationsandservicingissueanalysisid = operationsandservicingissueanalysisid;
    }

    public String getOperationsandservicingissueanalysisid() {
        return operationsandservicingissueanalysisid;
    }

    public void setOperationsandServicingIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.OperationsandServicingIssueAnalysis operationsandServicingIssueAnalysis) {
        this.operationsandServicingIssueAnalysis = operationsandServicingIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.OperationsandServicingIssueAnalysis getOperationsandServicingIssueAnalysis() {
        return operationsandServicingIssueAnalysis;
    }
}