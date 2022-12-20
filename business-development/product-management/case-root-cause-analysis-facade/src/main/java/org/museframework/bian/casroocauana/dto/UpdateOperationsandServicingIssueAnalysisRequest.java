package org.museframework.bian.casroocauana.dto;

public class UpdateOperationsandServicingIssueAnalysisRequest {
    private String caserootcauseanalysisid;

    private String operationsandservicingissueanalysisid;

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