package org.museframework.bian.mardatswiope.dto;

public class UpdateInternalPublicationRequest {
    private String marketdataswitchoperationid;

    private String internalpublicationid;

    private org.museframework.bian.mardatswiope.dto.bq.InternalPublication internalPublication;

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

    public void setInternalPublication(org.museframework.bian.mardatswiope.dto.bq.InternalPublication internalPublication) {
        this.internalPublication = internalPublication;
    }

    public org.museframework.bian.mardatswiope.dto.bq.InternalPublication getInternalPublication() {
        return internalPublication;
    }
}