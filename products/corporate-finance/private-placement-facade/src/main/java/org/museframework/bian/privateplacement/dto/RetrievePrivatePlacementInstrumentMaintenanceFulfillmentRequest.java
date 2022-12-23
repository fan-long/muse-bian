package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePrivatePlacementInstrumentMaintenanceFulfillmentRequest {
    @MetaField
    private String privateplacementid;

    @MetaField
    private String privateplacementinstrumentmaintenancefulfillmentid;

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
}