package org.museframework.bian.marinfman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateFinancialMarketInformationAdministrativePlanRequest {
    @MetaField(ref=true)
    private org.museframework.bian.marinfman.dto.cr.FinancialMarketInformationAdministrativePlan financialMarketInformationAdministrativePlan;

    public void setFinancialMarketInformationAdministrativePlan(org.museframework.bian.marinfman.dto.cr.FinancialMarketInformationAdministrativePlan financialMarketInformationAdministrativePlan) {
        this.financialMarketInformationAdministrativePlan = financialMarketInformationAdministrativePlan;
    }

    public org.museframework.bian.marinfman.dto.cr.FinancialMarketInformationAdministrativePlan getFinancialMarketInformationAdministrativePlan() {
        return financialMarketInformationAdministrativePlan;
    }
}