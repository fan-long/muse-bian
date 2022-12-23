package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTraderSecurityPositionManagementandAnalysisFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradersecuritypositionmanagementandanalysisfunctionid;

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
}