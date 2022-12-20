package org.museframework.bian.privateplacement.dto;

public class ExchangePrivatePlacementInstrumentSpecificationFulfillmentRequest {
    private String privateplacementid;

    private String privateplacementinstrumentspecificationfulfillmentid;

    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment privatePlacementInstrumentSpecificationFulfillment;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementinstrumentspecificationfulfillmentid(String privateplacementinstrumentspecificationfulfillmentid) {
        this.privateplacementinstrumentspecificationfulfillmentid = privateplacementinstrumentspecificationfulfillmentid;
    }

    public String getPrivateplacementinstrumentspecificationfulfillmentid() {
        return privateplacementinstrumentspecificationfulfillmentid;
    }

    public void setPrivatePlacementInstrumentSpecificationFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment privatePlacementInstrumentSpecificationFulfillment) {
        this.privatePlacementInstrumentSpecificationFulfillment = privatePlacementInstrumentSpecificationFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment getPrivatePlacementInstrumentSpecificationFulfillment() {
        return privatePlacementInstrumentSpecificationFulfillment;
    }
}