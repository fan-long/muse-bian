package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePublicPlacementInstrumentSpecificationFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementinstrumentspecificationfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentSpecificationFulfillment publicPlacementInstrumentSpecificationFulfillment;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementinstrumentspecificationfulfillmentid(String publicplacementinstrumentspecificationfulfillmentid) {
        this.publicplacementinstrumentspecificationfulfillmentid = publicplacementinstrumentspecificationfulfillmentid;
    }

    public String getPublicplacementinstrumentspecificationfulfillmentid() {
        return publicplacementinstrumentspecificationfulfillmentid;
    }

    public void setPublicPlacementInstrumentSpecificationFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentSpecificationFulfillment publicPlacementInstrumentSpecificationFulfillment) {
        this.publicPlacementInstrumentSpecificationFulfillment = publicPlacementInstrumentSpecificationFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentSpecificationFulfillment getPublicPlacementInstrumentSpecificationFulfillment() {
        return publicPlacementInstrumentSpecificationFulfillment;
    }
}