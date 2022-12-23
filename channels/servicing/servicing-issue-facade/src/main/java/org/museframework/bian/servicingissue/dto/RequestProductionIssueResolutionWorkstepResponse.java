package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestProductionIssueResolutionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep productionIssueResolutionWorkstep;

    public void setProductionIssueResolutionWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep productionIssueResolutionWorkstep) {
        this.productionIssueResolutionWorkstep = productionIssueResolutionWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep getProductionIssueResolutionWorkstep() {
        return productionIssueResolutionWorkstep;
    }
}