package org.museframework.bian.privateplacement.dto;

public class NotifyPrivatePlacementInstrumentMaintenanceFulfillmentRequest {
    private String privateplacementid;

    private String privateplacementinstrumentmaintenancefulfillmentid;

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
}