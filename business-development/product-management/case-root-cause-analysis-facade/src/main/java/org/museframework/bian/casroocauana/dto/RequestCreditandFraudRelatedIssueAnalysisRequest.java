package org.museframework.bian.casroocauana.dto;

public class RequestCreditandFraudRelatedIssueAnalysisRequest {
    private String caserootcauseanalysisid;

    private String creditandfraudrelatedissueanalysisid;

    private org.museframework.bian.casroocauana.dto.bq.CreditandFraudRelatedIssueAnalysis creditandFraudRelatedIssueAnalysis;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setCreditandfraudrelatedissueanalysisid(String creditandfraudrelatedissueanalysisid) {
        this.creditandfraudrelatedissueanalysisid = creditandfraudrelatedissueanalysisid;
    }

    public String getCreditandfraudrelatedissueanalysisid() {
        return creditandfraudrelatedissueanalysisid;
    }

    public void setCreditandFraudRelatedIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.CreditandFraudRelatedIssueAnalysis creditandFraudRelatedIssueAnalysis) {
        this.creditandFraudRelatedIssueAnalysis = creditandFraudRelatedIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.CreditandFraudRelatedIssueAnalysis getCreditandFraudRelatedIssueAnalysis() {
        return creditandFraudRelatedIssueAnalysis;
    }
}