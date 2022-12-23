package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProgramTradedPortfolioMaintenanceFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction programTradedPortfolioMaintenanceFunction;

    public void setProgramTradedPortfolioMaintenanceFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction programTradedPortfolioMaintenanceFunction) {
        this.programTradedPortfolioMaintenanceFunction = programTradedPortfolioMaintenanceFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction getProgramTradedPortfolioMaintenanceFunction() {
        return programTradedPortfolioMaintenanceFunction;
    }
}