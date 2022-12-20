package org.museframework.bian.publicoffering.dto;

public class RetrievePublicPlacementInstrumentSpecificationFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementinstrumentspecificationfulfillmentid;

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
}