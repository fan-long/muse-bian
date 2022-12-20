package org.museframework.bian.mardatswiope.dto;

public class RetrieveInternalPublicationRequest {
    private String marketdataswitchoperationid;

    private String internalpublicationid;

    public void setMarketdataswitchoperationid(String marketdataswitchoperationid) {
        this.marketdataswitchoperationid = marketdataswitchoperationid;
    }

    public String getMarketdataswitchoperationid() {
        return marketdataswitchoperationid;
    }

    public void setInternalpublicationid(String internalpublicationid) {
        this.internalpublicationid = internalpublicationid;
    }

    public String getInternalpublicationid() {
        return internalpublicationid;
    }
}