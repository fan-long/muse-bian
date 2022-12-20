package org.museframework.bian.publicoffering.dto;

public class NotifyPublicPlacementInstrumentRegistrationFulfillmentRequest {
    private String publicofferingid;

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