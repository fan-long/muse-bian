package org.museframework.bian.privateplacement.dto;

public class ExchangePrivatePlacementInstrumentMaintenanceFulfillmentRequest {
    private String privateplacementid;

    private String privateplacementinstrumentmaintenancefulfillmentid;

    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment privatePlacementInstrumentMaintenanceFulfillment;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementinstrumentmaintenancefulfillmentid(String privateplacementinstrumentmaintenancefulfillmentid) {
        this.privateplacementinstrumentmaintenancefulfillmentid = privateplacementinstrumentmaintenancefulfillmentid;
    }

    public String getPrivateplacementinstrumentmaintenancefulfillmentid() {
        return privateplacementinstrumentmaintenancefulfillmentid;
    }

    public void setPrivatePlacementInstrumentMaintenanceFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment privatePlacementInstrumentMaintenanceFulfillment) {
        this.privatePlacementInstrumentMaintenanceFulfillment = privatePlacementInstrumentMaintenanceFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentMaintenanceFulfillment getPrivatePlacementInstrumentMaintenanceFulfillment() {
        return privatePlacementInstrumentMaintenanceFulfillment;
    }
}