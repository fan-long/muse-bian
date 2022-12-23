package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTraderSecurityPositionManagementandAnalysisFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradersecuritypositionmanagementandanalysisfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradersecuritypositionmanagementandanalysisfunctionid(String tradersecuritypositionmanagementandanalysisfunctionid) {
        this.tradersecuritypositionmanagementandanalysisfunctionid = tradersecuritypositionmanagementandanalysisfunctionid;
    }

    public String getTradersecuritypositionmanagementandanalysisfunctionid() {
        return tradersecuritypositionmanagementandanalysisfunctionid;
    }

    public void setTraderSecurityPositionManagementandAnalysisFunction(org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction traderSecurityPositionManagementandAnalysisFunction) {
        this.traderSecurityPositionManagementandAnalysisFunction = traderSecurityPositionManagementandAnalysisFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TraderSecurityPositionManagementandAnalysisFunction getTraderSecurityPositionManagementandAnalysisFunction() {
        return traderSecurityPositionManagementandAnalysisFunction;
    }
}