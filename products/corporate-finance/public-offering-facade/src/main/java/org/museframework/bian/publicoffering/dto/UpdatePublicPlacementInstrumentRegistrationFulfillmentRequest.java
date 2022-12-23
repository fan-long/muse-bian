package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePublicPlacementInstrumentRegistrationFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementinstrumentregistrationfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentRegistrationFulfillment publicPlacementInstrumentRegistrationFulfillment;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementinstrumentregistrationfulfillmentid(String publicplacementinstrumentregistrationfulfillmentid) {
        this.publicplacementinstrumentregistrationfulfillmentid = publicplacementinstrumentregistrationfulfillmentid;
    }

    public String getPublicplacementinstrumentregistrationfulfillmentid() {
        return publicplacementinstrumentregistrationfulfillmentid;
    }

    public void setPublicPlacementInstrumentRegistrationFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentRegistrationFulfillment publicPlacementInstrumentRegistrationFulfillment) {
        this.publicPlacementInstrumentRegistrationFulfillment = publicPlacementInstrumentRegistrationFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentRegistrationFulfillment getPublicPlacementInstrumentRegistrationFulfillment() {
        return publicPlacementInstrumentRegistrationFulfillment;
    }
}