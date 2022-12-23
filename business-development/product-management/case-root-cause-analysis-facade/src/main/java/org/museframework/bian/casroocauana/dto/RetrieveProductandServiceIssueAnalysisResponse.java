package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductandServiceIssueAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis productandServiceIssueAnalysis;

    public void setProductandServiceIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis productandServiceIssueAnalysis) {
        this.productandServiceIssueAnalysis = productandServiceIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis getProductandServiceIssueAnalysis() {
        return productandServiceIssueAnalysis;
    }
}