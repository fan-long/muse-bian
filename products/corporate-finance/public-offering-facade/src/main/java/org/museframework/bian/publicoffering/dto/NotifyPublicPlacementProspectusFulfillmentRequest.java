package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyPublicPlacementProspectusFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementprospectusfulfillmentid;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementprospectusfulfillmentid(String publicplacementprospectusfulfillmentid) {
        this.publicplacementprospectusfulfillmentid = publicplacementprospectusfulfillmentid;
    }

    public String getPublicplacementprospectusfulfillmentid() {
        return publicplacementprospectusfulfillmentid;
    }
}