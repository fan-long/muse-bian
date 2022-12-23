package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestProductionIssueAnalysisWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep productionIssueAnalysisWorkstep;

    public void setProductionIssueAnalysisWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep productionIssueAnalysisWorkstep) {
        this.productionIssueAnalysisWorkstep = productionIssueAnalysisWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep getProductionIssueAnalysisWorkstep() {
        return productionIssueAnalysisWorkstep;
    }
}