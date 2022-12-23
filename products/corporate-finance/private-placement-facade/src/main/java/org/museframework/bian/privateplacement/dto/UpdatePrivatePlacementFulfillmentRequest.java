package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePrivatePlacementFulfillmentRequest {
    @MetaField
    private String privateplacementid;

    @MetaField
    private String privateplacementfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment;

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

    public void setPrivatePlacementFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment) {
        this.privatePlacementFulfillment = privatePlacementFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment getPrivatePlacementFulfillment() {
        return privatePlacementFulfillment;
    }
}