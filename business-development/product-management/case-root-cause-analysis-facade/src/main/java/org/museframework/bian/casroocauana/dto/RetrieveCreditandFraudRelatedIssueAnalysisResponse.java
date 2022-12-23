package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCreditandFraudRelatedIssueAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.bq.CreditandFraudRelatedIssueAnalysis creditandFraudRelatedIssueAnalysis;

    public void setCreditandFraudRelatedIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.CreditandFraudRelatedIssueAnalysis creditandFraudRelatedIssueAnalysis) {
        this.creditandFraudRelatedIssueAnalysis = creditandFraudRelatedIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.CreditandFraudRelatedIssueAnalysis getCreditandFraudRelatedIssueAnalysis() {
        return creditandFraudRelatedIssueAnalysis;
    }
}