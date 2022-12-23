package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyPrivatePlacementFulfillmentRequest {
    @MetaField
    private String privateplacementid;

    @MetaField
    private String privateplacementfulfillmentid;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementfulfillmentid(String privateplacementfulfillmentid) {
        this.privateplacementfulfillmentid = privateplacementfulfillmentid;
    }

    public String getPrivateplacementfulfillmentid() {
        return privateplacementfulfillmentid;
    }
}