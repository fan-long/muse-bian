package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePublicPlacementProspectusFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementprospectusfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment publicPlacementProspectusFulfillment;

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

    public void setPublicPlacementProspectusFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment publicPlacementProspectusFulfillment) {
        this.publicPlacementProspectusFulfillment = publicPlacementProspectusFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment getPublicPlacementProspectusFulfillment() {
        return publicPlacementProspectusFulfillment;
    }
}