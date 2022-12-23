package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductionIssueDeterminationWorkstepRequest {
    @MetaField
    private String servicingissueid;

    @MetaField
    private String productionissuedeterminationworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep productionIssueDeterminationWorkstep;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setProductionissuedeterminationworkstepid(String productionissuedeterminationworkstepid) {
        this.productionissuedeterminationworkstepid = productionissuedeterminationworkstepid;
    }

    public String getProductionissuedeterminationworkstepid() {
        return productionissuedeterminationworkstepid;
    }

    public void setProductionIssueDeterminationWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep productionIssueDeterminationWorkstep) {
        this.productionIssueDeterminationWorkstep = productionIssueDeterminationWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep getProductionIssueDeterminationWorkstep() {
        return productionIssueDeterminationWorkstep;
    }
}