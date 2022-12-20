package org.museframework.bian.privateplacement.dto;

public class NotifyPrivatePlacementInstrumentSpecificationFulfillmentRequest {
    private String privateplacementid;

    private String privateplacementinstrumentspecificationfulfillmentid;

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
}