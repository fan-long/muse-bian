package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCreditandFraudRelatedIssueAnalysisRequest {
    @MetaField
    private String caserootcauseanalysisid;

    @MetaField
    private String creditandfraudrelatedissueanalysisid;

    @MetaField(ref=true)
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