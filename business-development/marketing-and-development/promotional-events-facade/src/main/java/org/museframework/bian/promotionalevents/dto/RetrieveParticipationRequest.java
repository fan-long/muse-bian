package org.museframework.bian.promotionalevents.dto;

public class RetrieveParticipationRequest {
    private String promotionaleventsid;

    private String participationid;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setParticipationid(String participationid) {
        this.participationid = participationid;
    }

    public String getParticipationid() {
        return participationid;
    }
}