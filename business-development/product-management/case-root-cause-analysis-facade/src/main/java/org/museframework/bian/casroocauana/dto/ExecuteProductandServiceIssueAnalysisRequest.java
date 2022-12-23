package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductandServiceIssueAnalysisRequest {
    @MetaField
    private String caserootcauseanalysisid;

    @MetaField
    private String productandserviceissueanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis productandServiceIssueAnalysis;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setProductandserviceissueanalysisid(String productandserviceissueanalysisid) {
        this.productandserviceissueanalysisid = productandserviceissueanalysisid;
    }

    public String getProductandserviceissueanalysisid() {
        return productandserviceissueanalysisid;
    }

    public void setProductandServiceIssueAnalysis(org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis productandServiceIssueAnalysis) {
        this.productandServiceIssueAnalysis = productandServiceIssueAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.bq.ProductandServiceIssueAnalysis getProductandServiceIssueAnalysis() {
        return productandServiceIssueAnalysis;
    }
}