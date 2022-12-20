package org.museframework.bian.privateplacement.dto;

public class RetrievePrivatePlacementFulfillmentRequest {
    private String privateplacementid;

    private String privateplacementfulfillmentid;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementfulfillmentid(String privateplacementfulfillmentid) {
        this.privateplacementfulfillmentid = privateplacementfulfillmentid;
    }

    public String getPrivateplacementfulfillmentid() {
        return privateplacementfulfillmentid;
    }
}