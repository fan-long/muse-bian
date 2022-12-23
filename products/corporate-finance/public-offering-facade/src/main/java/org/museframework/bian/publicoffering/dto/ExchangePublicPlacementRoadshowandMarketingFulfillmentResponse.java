package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePublicPlacementRoadshowandMarketingFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementRoadshowandMarketingFulfillment publicPlacementRoadshowandMarketingFulfillment;

    public void setPublicPlacementRoadshowandMarketingFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementRoadshowandMarketingFulfillment publicPlacementRoadshowandMarketingFulfillment) {
        this.publicPlacementRoadshowandMarketingFulfillment = publicPlacementRoadshowandMarketingFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementRoadshowandMarketingFulfillment getPublicPlacementRoadshowandMarketingFulfillment() {
        return publicPlacementRoadshowandMarketingFulfillment;
    }
}