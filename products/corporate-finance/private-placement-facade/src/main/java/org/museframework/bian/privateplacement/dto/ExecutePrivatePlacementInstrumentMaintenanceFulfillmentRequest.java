package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePrivatePlacementInstrumentMaintenanceFulfillmentRequest {
    @MetaField
    private String privateplacementid;

    @MetaField
    private String privateplacementinstrumentmaintenancefulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment privatePlacementInstrumentMaintenanceFulfillment;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementinstrumentmaintenancefulfillmentid(String privateplacementinstrumentmaintenancefulfillmentid) {
        this.privateplacementinstrumentmaintenancefulfillmentid = privateplacementinstrumentmaintenancefulfillmentid;
    }

    public String getPrivateplacementinstrumentmaintenancefulfillmentid() {
        return privateplacementinstrumentmaintenancefulfillmentid;
    }

    public void setPrivatePlacementInstrumentMaintenanceFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment privatePlacementInstrumentMaintenanceFulfillment) {
        this.privatePlacementInstrumentMaintenanceFulfillment = privatePlacementInstrumentMaintenanceFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment getPrivatePlacementInstrumentMaintenanceFulfillment() {
        return privatePlacementInstrumentMaintenanceFulfillment;
    }
}