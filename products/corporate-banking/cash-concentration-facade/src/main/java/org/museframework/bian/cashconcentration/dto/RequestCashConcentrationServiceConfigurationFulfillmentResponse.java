package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCashConcentrationServiceConfigurationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment cashConcentrationServiceConfigurationFulfillment;

    public void setCashConcentrationServiceConfigurationFulfillment(org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment cashConcentrationServiceConfigurationFulfillment) {
        this.cashConcentrationServiceConfigurationFulfillment = cashConcentrationServiceConfigurationFulfillment;
    }

    public org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment getCashConcentrationServiceConfigurationFulfillment() {
        return cashConcentrationServiceConfigurationFulfillment;
    }
}