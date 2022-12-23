package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductionIssueResolutionWorkstepRequest {
    @MetaField
    private String servicingissueid;

    @MetaField
    private String productionissueresolutionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep productionIssueResolutionWorkstep;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setProductionissueresolutionworkstepid(String productionissueresolutionworkstepid) {
        this.productionissueresolutionworkstepid = productionissueresolutionworkstepid;
    }

    public String getProductionissueresolutionworkstepid() {
        return productionissueresolutionworkstepid;
    }

    public void setProductionIssueResolutionWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep productionIssueResolutionWorkstep) {
        this.productionIssueResolutionWorkstep = productionIssueResolutionWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueResolutionWorkstep getProductionIssueResolutionWorkstep() {
        return productionIssueResolutionWorkstep;
    }
}