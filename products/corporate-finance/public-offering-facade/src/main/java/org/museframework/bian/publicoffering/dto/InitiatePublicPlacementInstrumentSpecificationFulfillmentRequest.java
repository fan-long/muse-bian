package org.museframework.bian.publicoffering.dto;

public class InitiatePublicPlacementInstrumentSpecificationFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementinstrumentspecificationfulfillmentid;

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