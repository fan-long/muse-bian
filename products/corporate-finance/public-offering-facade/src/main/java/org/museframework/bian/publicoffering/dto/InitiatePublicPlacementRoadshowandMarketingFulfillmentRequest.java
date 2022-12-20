package org.museframework.bian.publicoffering.dto;

public class InitiatePublicPlacementRoadshowandMarketingFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementroadshowandmarketingfulfillmentid;

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