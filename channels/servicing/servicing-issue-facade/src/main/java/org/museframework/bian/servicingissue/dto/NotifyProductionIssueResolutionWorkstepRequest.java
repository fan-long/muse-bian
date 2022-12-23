package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyProductionIssueResolutionWorkstepRequest {
    @MetaField
    private String servicingissueid;

    @MetaField
    private String productionissueresolutionworkstepid;

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
}