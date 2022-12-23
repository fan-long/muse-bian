package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePublicPlacementRoadshowandMarketingFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementroadshowandmarketingfulfillmentid;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementroadshowandmarketingfulfillmentid(String publicplacementroadshowandmarketingfulfillmentid) {
        this.publicplacementroadshowandmarketingfulfillmentid = publicplacementroadshowandmarketingfulfillmentid;
    }

    public String getPublicplacementroadshowandmarketingfulfillmentid() {
        return publicplacementroadshowandmarketingfulfillmentid;
    }
}