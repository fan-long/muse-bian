package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePublicPlacementRoadshowandMarketingFulfillmentRequest {
    @MetaField
    private String publicofferingid;

    @MetaField
    private String publicplacementroadshowandmarketingfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementRoadshowandMarketingFulfillment publicPlacementRoadshowandMarketingFulfillment;

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

    public void setPublicPlacementRoadshowandMarketingFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementRoadshowandMarketingFulfillment publicPlacementRoadshowandMarketingFulfillment) {
        this.publicPlacementRoadshowandMarketingFulfillment = publicPlacementRoadshowandMarketingFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementRoadshowandMarketingFulfillment getPublicPlacementRoadshowandMarketingFulfillment() {
        return publicPlacementRoadshowandMarketingFulfillment;
    }
}