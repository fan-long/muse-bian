package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCashConcentrationServiceConfigurationFulfillmentRequest {
    @MetaField
    private String cashconcentrationid;

    @MetaField
    private String cashconcentrationserviceconfigurationfulfillmentid;

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
}