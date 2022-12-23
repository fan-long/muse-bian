package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeProductionIssueAnalysisWorkstepRequest {
    @MetaField
    private String servicingissueid;

    @MetaField
    private String productionissueanalysisworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep productionIssueAnalysisWorkstep;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setProductionissueanalysisworkstepid(String productionissueanalysisworkstepid) {
        this.productionissueanalysisworkstepid = productionissueanalysisworkstepid;
    }

    public String getProductionissueanalysisworkstepid() {
        return productionissueanalysisworkstepid;
    }

    public void setProductionIssueAnalysisWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep productionIssueAnalysisWorkstep) {
        this.productionIssueAnalysisWorkstep = productionIssueAnalysisWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueAnalysisWorkstep getProductionIssueAnalysisWorkstep() {
        return productionIssueAnalysisWorkstep;
    }
}