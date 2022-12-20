package org.museframework.bian.publicoffering.dto;

public class ExecutePublicPlacementInstrumentRegistrationFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementinstrumentregistrationfulfillmentid;

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