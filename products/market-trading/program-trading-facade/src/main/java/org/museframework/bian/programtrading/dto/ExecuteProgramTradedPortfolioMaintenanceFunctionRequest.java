package org.museframework.bian.programtrading.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProgramTradedPortfolioMaintenanceFunctionRequest {
    @MetaField
    private String programtradingid;

    @MetaField
    private String programtradedportfoliomaintenancefunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction programTradedPortfolioMaintenanceFunction;

    public void setProgramtradingid(String programtradingid) {
        this.programtradingid = programtradingid;
    }

    public String getProgramtradingid() {
        return programtradingid;
    }

    public void setProgramtradedportfoliomaintenancefunctionid(String programtradedportfoliomaintenancefunctionid) {
        this.programtradedportfoliomaintenancefunctionid = programtradedportfoliomaintenancefunctionid;
    }

    public String getProgramtradedportfoliomaintenancefunctionid() {
        return programtradedportfoliomaintenancefunctionid;
    }

    public void setProgramTradedPortfolioMaintenanceFunction(org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction programTradedPortfolioMaintenanceFunction) {
        this.programTradedPortfolioMaintenanceFunction = programTradedPortfolioMaintenanceFunction;
    }

    public org.museframework.bian.programtrading.dto.bq.ProgramTradedPortfolioMaintenanceFunction getProgramTradedPortfolioMaintenanceFunction() {
        return programTradedPortfolioMaintenanceFunction;
    }
}