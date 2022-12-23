package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyPublicPlacementInstrumentRegistrationFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementinstrumentregistrationfulfillmentid;

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
}