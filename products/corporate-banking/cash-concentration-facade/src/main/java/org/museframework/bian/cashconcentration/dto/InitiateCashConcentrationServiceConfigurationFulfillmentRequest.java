package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCashConcentrationServiceConfigurationFulfillmentRequest {
    @MetaField
    private String cashconcentrationid;

    @MetaField
    private String cashconcentrationserviceconfigurationfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment cashConcentrationServiceConfigurationFulfillment;

    public void setCashconcentrationid(String cashconcentrationid) {
        this.cashconcentrationid = cashconcentrationid;
    }

    public String getCashconcentrationid() {
        return cashconcentrationid;
    }

    public void setCashconcentrationserviceconfigurationfulfillmentid(String cashconcentrationserviceconfigurationfulfillmentid) {
        this.cashconcentrationserviceconfigurationfulfillmentid = cashconcentrationserviceconfigurationfulfillmentid;
    }

    public String getCashconcentrationserviceconfigurationfulfillmentid() {
        return cashconcentrationserviceconfigurationfulfillmentid;
    }

    public void setCashConcentrationServiceConfigurationFulfillment(org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment cashConcentrationServiceConfigurationFulfillment) {
        this.cashConcentrationServiceConfigurationFulfillment = cashConcentrationServiceConfigurationFulfillment;
    }

    public org.museframework.bian.cashconcentration.dto.bq.CashConcentrationServiceConfigurationFulfillment getCashConcentrationServiceConfigurationFulfillment() {
        return cashConcentrationServiceConfigurationFulfillment;
    }
}