package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiatePrivatePlacementInstrumentMaintenanceFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment privatePlacementInstrumentMaintenanceFulfillment;

    public void setPrivatePlacementInstrumentMaintenanceFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment privatePlacementInstrumentMaintenanceFulfillment) {
        this.privatePlacementInstrumentMaintenanceFulfillment = privatePlacementInstrumentMaintenanceFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment getPrivatePlacementInstrumentMaintenanceFulfillment() {
        return privatePlacementInstrumentMaintenanceFulfillment;
    }
}