package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePublicPlacementIPOandUnderwritingFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementipoandunderwritingfulfillmentid;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementipoandunderwritingfulfillmentid(String publicplacementipoandunderwritingfulfillmentid) {
        this.publicplacementipoandunderwritingfulfillmentid = publicplacementipoandunderwritingfulfillmentid;
    }

    public String getPublicplacementipoandunderwritingfulfillmentid() {
        return publicplacementipoandunderwritingfulfillmentid;
    }
}