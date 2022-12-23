package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTraderSecurityPositionManagementandAnalysisFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction;

    public void setTraderSecurityPositionManagementandAnalysisFunction(org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction) {
        this.traderSecurityPositionManagementandAnalysisFunction = traderSecurityPositionManagementandAnalysisFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction getTraderSecurityPositionManagementandAnalysisFunction() {
        return traderSecurityPositionManagementandAnalysisFunction;
    }
}